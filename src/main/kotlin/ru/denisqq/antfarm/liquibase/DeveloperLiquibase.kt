package ru.denisqq.antfarm.liquibase

import liquibase.Liquibase
import liquibase.database.DatabaseFactory
import liquibase.database.jvm.JdbcConnection
import liquibase.resource.ClassLoaderResourceAccessor
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Profile
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import javax.sql.DataSource

@Component
@Profile("!prod") //Обвязка для ликви, для запуска после того как отработает гибер, включаем только для dev
class DeveloperLiquibase(private val dataSource: DataSource) {


    @Value("\${antfarm.liquibase.mode}")
    private lateinit var mode: LiquibaseMode

    @Value("\${antfarm.liquibase.changeLog:}")
    private lateinit var changelog: String

    @EventListener(ContextRefreshedEvent::class)
    fun contextRefreshEventHandle() {
        if (mode == LiquibaseMode.DEV) {
            updateDevData()
        }
    }

    private fun updateDevData() {
        //        log.info("{}: start", debugStr);
        try {
            dataSource.connection.use { c ->
                val database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(JdbcConnection(c))
                database.outputDefaultSchema = false
                //            database.setLiquibaseSchemaName(liquibaseProperties.getLiquibaseSchema());
//            database.setDefaultSchemaName(liquibaseProperties.getDefaultSchema());
                val liquibase = Liquibase(changelog, ClassLoaderResourceAccessor(), database)
                liquibase.update("main")
            }
        } catch (e: Exception) {
//            log.error("{}: ", debugStr, e);
        }
        //        log.info("{}: end", debugStr);
    }

    enum class LiquibaseMode {
        DEV, PROD
    }
}
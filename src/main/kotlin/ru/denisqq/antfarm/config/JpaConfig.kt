package ru.denisqq.antfarm.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.auditing.DateTimeProvider
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.time.ZonedDateTime
import java.util.*

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = ["ru.denisqq.antfarm.model"])
@EnableJpaRepositories(basePackages = ["ru.denisqq.antfarm.dao"])
@EnableJpaAuditing(dateTimeProviderRef = "auditingDateTimeProvider")
class JpaConfig {

//    @Bean
//    fun securityEvaluationContextExtension(): SecurityEvaluationContextExtension? {
//        return SecurityEvaluationContextExtension()
//    }

    @Bean
    fun auditingDateTimeProvider(): DateTimeProvider? {
        return DateTimeProvider { Optional.of(ZonedDateTime.now()) }
    }
}
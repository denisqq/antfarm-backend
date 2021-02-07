package ru.denisqq.antfarm.dao

import com.querydsl.core.types.EntityPath
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer
import org.springframework.data.querydsl.binding.QuerydslBindings
import org.springframework.data.repository.NoRepositoryBean
import ru.denisqq.antfarm.model.AbstractPersistable
import java.util.*

@NoRepositoryBean
interface AntfarmRepository<T : AbstractPersistable, Q : EntityPath<T>> : JpaRepository<T, UUID>, QuerydslPredicateExecutor<T>, QuerydslBinderCustomizer<Q> {


    @JvmDefault
    override fun customize(bindings: QuerydslBindings, root: Q) {

    }
}
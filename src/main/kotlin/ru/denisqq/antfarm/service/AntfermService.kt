package ru.denisqq.antfarm.service

import com.querydsl.core.types.Predicate
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import ru.denisqq.antfarm.model.AntPersistable
import java.util.*

interface AntfermService<T : AntPersistable> {

    fun findById(id: UUID): T

    fun findByRequest(predicate: Predicate, pageable: Pageable): Page<T>

    fun findByRequest(predicate: Predicate): Iterable<T>

    fun findAll(): Iterable<T>

    fun update(entity: T): T

    fun delete(entity: T)

    fun delete(id: UUID)
}
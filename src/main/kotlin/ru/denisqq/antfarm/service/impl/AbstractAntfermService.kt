package ru.denisqq.antfarm.service.impl

import com.querydsl.core.types.EntityPath
import com.querydsl.core.types.Predicate
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.transaction.annotation.Transactional
import org.springframework.util.Assert
import ru.denisqq.antfarm.dao.AntfarmRepository
import ru.denisqq.antfarm.model.AbstractPersistable
import ru.denisqq.antfarm.service.AntfermService
import ru.denisqq.antfarm.service.mapper.UpdateMapper
import java.util.*
import javax.persistence.EntityNotFoundException

abstract class AbstractAntfermService<T : AbstractPersistable, Q : EntityPath<T>, R : AntfarmRepository<T, Q>, U : UpdateMapper<T>>
    (protected val repository: R, protected val updateMapper: U) : AntfermService<T> {

    @Transactional
    override fun findById(id: UUID): T {

        return repository.findById(id).orElseThrow {
            val thisClass = this::class
            EntityNotFoundException("Entity with id=$id not found, service=${thisClass.simpleName}")
        }
    }

    override fun findAll(): Iterable<T> {
        return repository.findAll()
    }

    @Transactional
    override fun findByRequest(predicate: Predicate, pageable: Pageable): Page<T> {
        return repository.findAll(predicate, pageable)
    }

    @Transactional
    override fun findByRequest(predicate: Predicate): Iterable<T> {
        return repository.findAll(predicate)
    }

//    @Transactional
//    override fun create(createRequest: C): T {
//        val entity = entityMapper.toEntity(createRequest)
//        return save(entity)
//    }

    @Transactional
    override fun update(entity: T): T {
        Assert.notNull(entity, "entity for update must not be null")
        findById(entity.id!!).let {
            updateMapper.update(entity, it)
            return save(it)
        }

    }

    @Transactional
    override fun delete(entity: T) {
        repository.delete(entity)
    }

    @Transactional
    override fun delete(id: UUID) {
        delete(entity = findById(id))
    }


    protected fun save(entity: T): T {
        return repository.save(entity)
    }
}
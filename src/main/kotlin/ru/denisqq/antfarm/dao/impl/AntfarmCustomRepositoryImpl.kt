package ru.denisqq.antfarm.dao.impl

import org.springframework.transaction.annotation.Transactional
import ru.denisqq.antfarm.dao.AntfarmCustomRepository
import ru.denisqq.antfarm.model.AbstractPersistable
import javax.persistence.EntityManager
import javax.persistence.LockModeType

open class AntfarmCustomRepositoryImpl<T : AbstractPersistable>(private val em: EntityManager) : AntfarmCustomRepository<T> {

    @Transactional
    override fun refresh(entity: T, lock: LockModeType): T {
        return if (em.contains(entity)) {
            em.refresh(entity, lock)
            entity
        } else {
            em.find(entity.javaClass, entity.id, lock)
        }
    }
}
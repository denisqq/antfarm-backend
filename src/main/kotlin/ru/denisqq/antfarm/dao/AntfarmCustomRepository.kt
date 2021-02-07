package ru.denisqq.antfarm.dao

import org.springframework.data.repository.NoRepositoryBean
import ru.denisqq.antfarm.model.AbstractPersistable
import javax.persistence.LockModeType

@NoRepositoryBean
interface AntfarmCustomRepository<T : AbstractPersistable> {
    fun refresh(entity: T, lock: LockModeType): T
}
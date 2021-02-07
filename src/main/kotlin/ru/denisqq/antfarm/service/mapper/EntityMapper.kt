package ru.denisqq.antfarm.service.mapper

import ru.denisqq.antfarm.model.AntPersistable

interface EntityMapper<T : AntPersistable, C> {
    fun toEntity(request: C): T
}
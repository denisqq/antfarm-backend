package ru.denisqq.antfarm.service

import ru.denisqq.antfarm.model.AntPersistable

interface CreateService<T : AntPersistable, C> {
    fun create(createRequest: C): T
}
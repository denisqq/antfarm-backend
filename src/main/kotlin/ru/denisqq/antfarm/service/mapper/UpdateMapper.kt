package ru.denisqq.antfarm.service.mapper

import org.mapstruct.MappingTarget
import ru.denisqq.antfarm.model.AntPersistable

interface UpdateMapper<T : AntPersistable> {

    fun update(source: T, @MappingTarget to: T)
}
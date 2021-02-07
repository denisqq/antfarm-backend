package ru.denisqq.antfarm.web.mapper

interface DtoMapper<E, D> {

    fun toDto(entity: E): D

    fun toDto(entity: Collection<E>): Collection<D>

    fun toDto(entity: Iterable<E>): Collection<D>
}
package ru.denisqq.antfarm.web.dto

import java.util.*

data class AntColonyPopulationDto(
    val id: UUID,
    var ant: AntDto,
    var population: Long
)

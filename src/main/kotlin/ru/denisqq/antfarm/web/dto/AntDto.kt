package ru.denisqq.antfarm.web.dto

import ru.denisqq.antfarm.model.enums.AntType
import java.util.*

data class AntDto(
    val id: UUID,
    val antType: AntType,
    val name: String,
)

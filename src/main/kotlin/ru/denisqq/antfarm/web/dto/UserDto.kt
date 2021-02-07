package ru.denisqq.antfarm.web.dto

import ru.denisqq.antfarm.model.json.Avatar
import java.util.*

data class UserDto(
    val id: UUID,
    val username: String,
    val lastName: String,
    val firstName: String,
    val middleName: String,
    val avatar: Avatar
)

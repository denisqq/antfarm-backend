package ru.denisqq.antfarm.service.mapper

import org.mapstruct.Mapper
import ru.denisqq.antfarm.model.User

@Mapper
interface UserUpdateMapper : UpdateMapper<User>
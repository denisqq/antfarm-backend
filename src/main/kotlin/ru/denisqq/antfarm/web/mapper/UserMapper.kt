package ru.denisqq.antfarm.web.mapper

import org.mapstruct.Mapper
import ru.denisqq.antfarm.model.User
import ru.denisqq.antfarm.web.dto.UserDto

@Mapper
interface UserMapper : DtoMapper<User, UserDto>
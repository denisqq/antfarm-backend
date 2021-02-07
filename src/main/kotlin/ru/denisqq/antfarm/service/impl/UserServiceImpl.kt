package ru.denisqq.antfarm.service.impl

import org.springframework.stereotype.Service
import ru.denisqq.antfarm.dao.UserRepository
import ru.denisqq.antfarm.model.QUser
import ru.denisqq.antfarm.model.User
import ru.denisqq.antfarm.service.UserService
import ru.denisqq.antfarm.service.mapper.UserUpdateMapper

@Service
class UserServiceImpl(repository: UserRepository, updateMapper: UserUpdateMapper) : AbstractAntfermService<User, QUser, UserRepository, UserUpdateMapper>(repository, updateMapper), UserService
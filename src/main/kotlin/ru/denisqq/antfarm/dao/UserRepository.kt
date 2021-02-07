package ru.denisqq.antfarm.dao

import ru.denisqq.antfarm.model.QUser
import ru.denisqq.antfarm.model.User

interface UserRepository : AntfarmRepository<User, QUser>
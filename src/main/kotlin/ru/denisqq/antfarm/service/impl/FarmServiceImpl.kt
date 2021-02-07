package ru.denisqq.antfarm.service.impl

import org.springframework.stereotype.Service
import ru.denisqq.antfarm.dao.FarmRepository
import ru.denisqq.antfarm.model.Farm
import ru.denisqq.antfarm.model.QFarm
import ru.denisqq.antfarm.service.FarmService
import ru.denisqq.antfarm.service.mapper.FarmUpdateMapper

@Service
class FarmServiceImpl(repository: FarmRepository, updateMapper: FarmUpdateMapper) : AbstractAntfermService<Farm, QFarm, FarmRepository, FarmUpdateMapper>(repository, updateMapper), FarmService
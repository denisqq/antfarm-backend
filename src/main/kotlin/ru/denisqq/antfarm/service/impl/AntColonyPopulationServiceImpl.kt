package ru.denisqq.antfarm.service.impl

import org.springframework.stereotype.Service
import ru.denisqq.antfarm.dao.AntColonyPopulationRepository
import ru.denisqq.antfarm.model.AntColonyPopulation
import ru.denisqq.antfarm.model.QAntColonyPopulation
import ru.denisqq.antfarm.service.AntColonyPopulationService
import ru.denisqq.antfarm.service.mapper.AntColonyPopulationUpdateMapper

@Service
class AntColonyPopulationServiceImpl(
    repository: AntColonyPopulationRepository,
    updateMapper: AntColonyPopulationUpdateMapper
) : AbstractAntfermService<AntColonyPopulation, QAntColonyPopulation, AntColonyPopulationRepository, AntColonyPopulationUpdateMapper>(repository, updateMapper),AntColonyPopulationService {

}
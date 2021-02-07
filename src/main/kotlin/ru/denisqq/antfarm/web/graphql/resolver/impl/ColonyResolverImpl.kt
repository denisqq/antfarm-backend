package ru.denisqq.antfarm.web.graphql.resolver.impl

import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component
import ru.denisqq.antfarm.model.AntColonyPopulation
import ru.denisqq.antfarm.model.Colony
import ru.denisqq.antfarm.model.QAntColonyPopulation
import ru.denisqq.antfarm.service.AntColonyPopulationService
import ru.denisqq.antfarm.web.mapper.AntColonyPopulationMapper

@Component
class ColonyResolverImpl(val antColonyPopulationService: AntColonyPopulationService, val antColonyPopulationMapper: AntColonyPopulationMapper) : GraphQLResolver<Colony> {

    fun getAntColonyPopulation(colony: Colony): Collection<AntColonyPopulation> {
        val predicate = QAntColonyPopulation.antColonyPopulation.colony.eq(colony)
        val population = antColonyPopulationService.findByRequest(
            predicate
        )
        return population.toList()
    }
}
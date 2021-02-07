package ru.denisqq.antfarm.web.mapper

import org.mapstruct.Mapper
import ru.denisqq.antfarm.model.AntColonyPopulation
import ru.denisqq.antfarm.web.dto.AntColonyPopulationDto

@Mapper(uses = [AntMapper::class])
interface AntColonyPopulationMapper : DtoMapper<AntColonyPopulation, AntColonyPopulationDto>
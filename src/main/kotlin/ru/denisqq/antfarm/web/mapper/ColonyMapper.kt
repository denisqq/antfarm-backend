package ru.denisqq.antfarm.web.mapper

import org.mapstruct.Mapper
import org.mapstruct.Mapping
import ru.denisqq.antfarm.model.Colony
import ru.denisqq.antfarm.web.dto.ColonyDto

@Mapper(uses = [AntColonyPopulationMapper::class])
interface ColonyMapper : DtoMapper<Colony, ColonyDto> {

//    @Mapping(target = "antColonyPopulation", ignore = true)
    override fun toDto(entity: Colony): ColonyDto
}
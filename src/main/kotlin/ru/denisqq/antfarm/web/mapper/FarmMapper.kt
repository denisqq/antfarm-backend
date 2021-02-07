package ru.denisqq.antfarm.web.mapper

import org.mapstruct.Mapper
import ru.denisqq.antfarm.model.Farm
import ru.denisqq.antfarm.web.dto.FarmDto

@Mapper(uses = [ColonyMapper::class])
interface FarmMapper : DtoMapper<Farm, FarmDto>
package ru.denisqq.antfarm.service.mapper

import org.mapstruct.Mapper
import ru.denisqq.antfarm.model.Farm

@Mapper
interface FarmUpdateMapper: UpdateMapper<Farm>
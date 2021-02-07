package ru.denisqq.antfarm.web.mapper

import org.mapstruct.Mapper
import ru.denisqq.antfarm.model.Ant
import ru.denisqq.antfarm.web.dto.AntDto

@Mapper
interface AntMapper : DtoMapper<Ant, AntDto>
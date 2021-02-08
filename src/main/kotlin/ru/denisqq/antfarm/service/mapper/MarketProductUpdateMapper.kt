package ru.denisqq.antfarm.service.mapper

import org.mapstruct.Mapper
import ru.denisqq.antfarm.model.MarketProduct

@Mapper
interface MarketProductUpdateMapper : UpdateMapper<MarketProduct>
package ru.denisqq.antfarm.service.mapper

import org.mapstruct.Mapper
import ru.denisqq.antfarm.model.Product

@Mapper
interface ProductUpdateMapper : UpdateMapper<Product>
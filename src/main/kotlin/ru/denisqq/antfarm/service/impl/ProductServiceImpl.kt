package ru.denisqq.antfarm.service.impl

import org.springframework.stereotype.Service
import ru.denisqq.antfarm.dao.ProductRepository
import ru.denisqq.antfarm.model.Product
import ru.denisqq.antfarm.model.QProduct
import ru.denisqq.antfarm.service.ProductService
import ru.denisqq.antfarm.service.mapper.ProductUpdateMapper

@Service
class ProductServiceImpl(repository: ProductRepository, updateMapper: ProductUpdateMapper) : AbstractAntfermService<Product, QProduct, ProductRepository, ProductUpdateMapper>(repository, updateMapper), ProductService
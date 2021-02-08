package ru.denisqq.antfarm.dao

import ru.denisqq.antfarm.model.Product
import ru.denisqq.antfarm.model.QProduct

interface ProductRepository : AntfarmRepository<Product, QProduct>
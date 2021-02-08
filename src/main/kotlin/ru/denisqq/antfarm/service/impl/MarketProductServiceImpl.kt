package ru.denisqq.antfarm.service.impl

import org.springframework.stereotype.Service
import ru.denisqq.antfarm.dao.MarketProductRepository
import ru.denisqq.antfarm.model.MarketProduct
import ru.denisqq.antfarm.model.QMarketProduct
import ru.denisqq.antfarm.service.MarketProductService
import ru.denisqq.antfarm.service.mapper.MarketProductUpdateMapper

@Service
class MarketProductServiceImpl(repository: MarketProductRepository, updateMapper: MarketProductUpdateMapper) : AbstractAntfermService<MarketProduct, QMarketProduct, MarketProductRepository, MarketProductUpdateMapper>(
    repository,
    updateMapper
), MarketProductService
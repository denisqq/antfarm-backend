package ru.denisqq.antfarm.dao

import ru.denisqq.antfarm.model.MarketProduct
import ru.denisqq.antfarm.model.QMarketProduct

interface MarketProductRepository : AntfarmRepository<MarketProduct, QMarketProduct>
package ru.denisqq.antfarm.web.graphql.resolver.query.impl

import org.springframework.stereotype.Component
import ru.denisqq.antfarm.model.MarketProduct
import ru.denisqq.antfarm.service.MarketProductService
import ru.denisqq.antfarm.web.graphql.resolver.query.MarketQueryResolver

@Component
class MarketQueryResolverImpl(private val marketProductService: MarketProductService) : MarketQueryResolver {

    override fun market(): Collection<MarketProduct> {
        return marketProductService.findAll().toList()
    }
}
package ru.denisqq.antfarm.web.graphql.resolver.query

import ru.denisqq.antfarm.model.MarketProduct

interface MarketQueryResolver : AntfarmQueryResolver {

    fun market(): Collection<MarketProduct>
}
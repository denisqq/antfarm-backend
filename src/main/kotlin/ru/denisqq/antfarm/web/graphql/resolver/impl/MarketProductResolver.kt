package ru.denisqq.antfarm.web.graphql.resolver.impl

import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component
import ru.denisqq.antfarm.model.MarketProduct

@Component
class MarketProductResolver : GraphQLResolver<MarketProduct>
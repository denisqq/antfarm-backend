package ru.denisqq.antfarm.web.graphql.resolver.query.impl

import org.springframework.stereotype.Component
import ru.denisqq.antfarm.model.Farm
import ru.denisqq.antfarm.service.FarmService
import ru.denisqq.antfarm.web.graphql.resolver.query.FarmQueryResolver
import ru.denisqq.antfarm.web.mapper.FarmMapper

@Component
class FarmQueryResolverImpl(val service: FarmService, val mapper: FarmMapper) : FarmQueryResolver {

    override fun farms(): Collection<Farm> {
        val farms = service.findAll()
        return farms.toList();
    }
}
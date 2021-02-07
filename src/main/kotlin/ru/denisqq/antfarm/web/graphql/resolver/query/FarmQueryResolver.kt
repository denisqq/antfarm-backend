package ru.denisqq.antfarm.web.graphql.resolver.query

import ru.denisqq.antfarm.model.Farm

interface FarmQueryResolver: AntfarmQueryResolver {

    fun farms(): Collection<Farm>
}
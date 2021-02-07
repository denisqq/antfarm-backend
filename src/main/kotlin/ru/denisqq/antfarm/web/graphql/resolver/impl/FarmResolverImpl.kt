package ru.denisqq.antfarm.web.graphql.resolver.impl

import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component
import ru.denisqq.antfarm.model.Colony
import ru.denisqq.antfarm.model.Farm

@Component
class FarmResolverImpl: GraphQLResolver<Farm> {

//    fun getColony(farm: Farm): Colony {
//        return farm.colony;
//    }
}
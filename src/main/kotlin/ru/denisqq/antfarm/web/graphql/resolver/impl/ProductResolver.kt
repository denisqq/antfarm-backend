package ru.denisqq.antfarm.web.graphql.resolver.impl

import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component
import ru.denisqq.antfarm.model.Ant
import ru.denisqq.antfarm.model.AntProduct
import ru.denisqq.antfarm.model.Product
import ru.denisqq.antfarm.model.enums.ProductType

@Component
class ProductResolver : GraphQLResolver<Product> {

    fun getAnt(product: Product): Ant? {
        return if (product.type == ProductType.ANT) {
            product as AntProduct
            product.ant
        } else {
            null
        }
    }
}
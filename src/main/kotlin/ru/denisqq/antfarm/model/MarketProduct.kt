package ru.denisqq.antfarm.model

import org.hibernate.annotations.Type
import ru.denisqq.antfarm.model.json.MarketProductPrice
import javax.persistence.*

@Entity
class MarketProduct(

    @Column(nullable = false)
    var quantity: Int,

    @ManyToOne
    @JoinColumn(name = "product_id", foreignKey = ForeignKey(name = "market_product_product_id_fkey"), nullable = false)
    var product: Product,

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb", nullable = false)
    var marketProductPrices: List<MarketProductPrice>

) : AbstractPersistable()
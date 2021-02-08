package ru.denisqq.antfarm.model

import ru.denisqq.antfarm.model.enums.ProductType
import javax.persistence.*


@Entity
@DiscriminatorValue(value = ProductType.ANT_VALUE)
class AntProduct(
    @ManyToOne
    @JoinColumn(name = "ant_id", foreignKey = ForeignKey(name = "product_ant_id_fkey"))
    var ant: Ant,
    name: String,
) : Product(name, type = ProductType.ANT)
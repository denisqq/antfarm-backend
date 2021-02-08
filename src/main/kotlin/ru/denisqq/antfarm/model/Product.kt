package ru.denisqq.antfarm.model

import ru.denisqq.antfarm.model.enums.ProductType
import javax.persistence.*
import javax.persistence.InheritanceType.SINGLE_TABLE


@Entity
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
open class Product(
    @Column(nullable = false)
    var name: String,

    @Column(nullable = false, insertable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    var type: ProductType,
) : AbstractPersistable()
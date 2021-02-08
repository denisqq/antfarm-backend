package ru.denisqq.antfarm.model.json

import ru.denisqq.antfarm.model.enums.Currency
import java.math.BigDecimal

data class MarketProductPrice(
    val currency: Currency,
    val price: BigDecimal
)

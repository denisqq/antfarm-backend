package ru.denisqq.antfarm.model

import javax.persistence.Entity
import javax.persistence.OneToOne

@Entity
class Farm(

    @OneToOne(mappedBy = "farm", fetch = FetchType.EAGER)
    var colony: Colony

) : AbstractAuditable()
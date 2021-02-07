package ru.denisqq.antfarm.model

import ru.denisqq.antfarm.model.enums.AntType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
class Ant(

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var antType: AntType,

    @Column(nullable = false)
    var name: String,


    ) : AbstractPersistable()
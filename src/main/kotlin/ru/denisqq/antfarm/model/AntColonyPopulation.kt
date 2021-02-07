package ru.denisqq.antfarm.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToOne


@Entity
class AntColonyPopulation(
    @ManyToOne
    var colony: Colony,

    @ManyToOne
    var ant: Ant,

    @Column(nullable = false)
    var population: Long
) : AbstractAuditable()
package ru.denisqq.antfarm.model

import javax.persistence.*


@Entity
class AntColonyPopulation(
    @ManyToOne
    @JoinColumn(foreignKey = ForeignKey(name = "ant_colony_population_colony_farm_id_fkey"))
    var colony: Colony,

    @ManyToOne
    @JoinColumn(foreignKey = ForeignKey(name = "ant_colony_population_ant_id_fkey"))
    var ant: Ant,

    @Column(nullable = false)
    var population: Long
) : AbstractAuditable()
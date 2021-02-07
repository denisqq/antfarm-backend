package ru.denisqq.antfarm.model

import javax.persistence.*

@Entity
class Colony(

    @MapsId
    @OneToOne
    var farm: Farm,

    @OneToMany(mappedBy = "colony")
    var antColonyPopulation: Set<AntColonyPopulation>,

    @Column(nullable = false)
    var population: Long,

    ) : AbstractAuditable()
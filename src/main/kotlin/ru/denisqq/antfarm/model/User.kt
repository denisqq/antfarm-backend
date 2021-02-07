package ru.denisqq.antfarm.model

import org.hibernate.annotations.Type
import ru.denisqq.antfarm.model.json.Avatar
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "\"user\"")
class User(
    @Column(nullable = false)
    var username: String,

    @Column(nullable = false)
    var lastName: String,

    @Column(nullable = false)
    var firstName: String,

    @Column
    var middleName: String,

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    var avatar: Avatar
) : AbstractAuditable()
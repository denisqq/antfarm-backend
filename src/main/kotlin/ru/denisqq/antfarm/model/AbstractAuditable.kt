package ru.denisqq.antfarm.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.OffsetDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass
import javax.persistence.Version

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class AbstractAuditable : AbstractPersistable(), Auditable {

    @CreatedDate
    @Column(nullable = false, columnDefinition = "timestamp with time zone")
    private lateinit var createdAt: OffsetDateTime

    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "timestamp with time zone")
    private lateinit var updatedAt: OffsetDateTime

    @Version
    @Column(nullable = false, columnDefinition = "timestamp with time zone")
    private lateinit var version: OffsetDateTime

    override fun getCreatedAt(): OffsetDateTime {
        return createdAt
    }

    override fun setCreatedAt(createdAt: OffsetDateTime) {
        this.createdAt = createdAt
    }

    override fun getUpdatedAt(): OffsetDateTime {
        return updatedAt
    }

    override fun setUpdatedAt(updatedAt: OffsetDateTime) {
        this.updatedAt = updatedAt
    }

    override fun getVersion(): OffsetDateTime {
        return version
    }

    open fun setVersion(version: OffsetDateTime) {
        this.version = version
    }
}
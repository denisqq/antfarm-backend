package ru.denisqq.antfarm.model

import java.time.OffsetDateTime

interface Auditable {

    fun getCreatedAt(): OffsetDateTime

    fun setCreatedAt(createdAt: OffsetDateTime)

    fun getUpdatedAt(): OffsetDateTime

    fun setUpdatedAt(updatedAt: OffsetDateTime)

    fun getVersion(): OffsetDateTime
}
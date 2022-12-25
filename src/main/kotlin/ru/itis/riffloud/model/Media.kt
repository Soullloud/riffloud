package ru.itis.riffloud.model

import java.util.UUID
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "media")
open class Media(
    @Id val id: UUID,
    val content: ByteArray
)
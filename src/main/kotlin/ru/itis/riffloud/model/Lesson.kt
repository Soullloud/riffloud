package ru.itis.riffloud.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
open class Lesson(
    @Id @GeneratedValue val id: Int,
    val name: String,
    val description: String
)
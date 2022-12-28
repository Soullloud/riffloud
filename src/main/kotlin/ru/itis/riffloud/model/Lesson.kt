package ru.itis.riffloud.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
open class Lesson(
    @Id @GeneratedValue open val id: Int,
    open val name: String,
    open val description: String
)
package ru.itis.riffloud.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
open class Student(
    @Id @GeneratedValue val id: Int,
    val username: String,
    val email: String,
    val password: String,
    val firstName: String?,
    val lastName: String?,
    val city: String?,
    val country: String?
)
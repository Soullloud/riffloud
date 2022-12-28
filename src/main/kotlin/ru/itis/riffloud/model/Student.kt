package ru.itis.riffloud.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
open class Student(
    @Id @GeneratedValue open val id: Int,
    open val username: String,
    open val email: String,
    open val password: String,
    open val firstName: String?,
    open val lastName: String?,
    open val city: String?,
    open val country: String?
)
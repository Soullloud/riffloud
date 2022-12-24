package ru.itis.riffloud.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
open class Course(
    @Id @GeneratedValue val id: Int,
    val name: String,
    val description: String,
    @OneToMany val lessons: List<Lesson>
)
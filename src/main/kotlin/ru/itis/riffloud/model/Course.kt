package ru.itis.riffloud.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
open class Course(
    @Id @GeneratedValue open val id: Int,
    open val name: String,
    open val description: String,
    @OneToMany open val lessons: List<Lesson>
)
package ru.itis.riffloud.repository

import java.util.*
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.itis.riffloud.model.Student

@Repository
interface StudentRepository : CrudRepository<Student, Int> {

    fun findByUsername(username: String): Optional<Student>
}

package ru.itis.riffloud.service

import org.springframework.stereotype.Service
import ru.itis.riffloud.exception.NotFoundException
import ru.itis.riffloud.model.Student
import ru.itis.riffloud.repository.StudentRepository

@Service
class StudentService(
    private val studentRepository: StudentRepository
) {

    fun findOneById(id: Int): Student = studentRepository.findById(id).orElseThrow {
        NotFoundException("User not found with id = $id")
    }

    fun findByUsername(username: String): Student = studentRepository.findByUsername(username).orElseThrow {
        NotFoundException("User not found with username = $username")
    }
}

package ru.itis.riffloud.service

import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import ru.itis.riffloud.exception.NotFoundException
import ru.itis.riffloud.model.Course
import ru.itis.riffloud.repository.CourseRepository

@Service
class CourseService(
    private val courseRepository: CourseRepository
) {

    fun findOneById(id: Int): Course = courseRepository.findById(id).orElseThrow {
        NotFoundException("Course not found with id = $id")
    }

    fun getPaginated(page: Int, size: Int): List<Course> = courseRepository.findAll(PageRequest.of(page, size)).content
}

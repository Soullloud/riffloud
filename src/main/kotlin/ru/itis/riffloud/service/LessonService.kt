package ru.itis.riffloud.service

import org.springframework.stereotype.Service
import ru.itis.riffloud.exception.NotFoundException
import ru.itis.riffloud.model.Lesson
import ru.itis.riffloud.repository.LessonRepository

@Service
class LessonService(
    private val lessonRepository: LessonRepository
) {

    fun findOneById(id: Int): Lesson = lessonRepository.findById(id).orElseThrow {
        NotFoundException("Not found lesson with id $id")
    }

    fun findAllLessonsInCourse(courseId: Int): List<Lesson> = lessonRepository.findLessonsByCourseId(courseId)
}

package ru.itis.riffloud.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import ru.itis.riffloud.model.Lesson

@Repository
interface LessonRepository: JpaRepository<Lesson, Int> {

    @Query("select l from Course c join c.lessons l where c.id = :id")
    fun findLessonsByCourseId(courseId: Int): List<Lesson>
}

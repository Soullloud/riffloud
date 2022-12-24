package ru.itis.riffloud.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.itis.riffloud.model.Course

@Repository
interface CourseRepository : JpaRepository<Course, Int>

package com.moriawe.spring_boot_crash_course.repository

import com.moriawe.spring_boot_crash_course.repository.model.Note
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface NotesRepository: MongoRepository<Note, ObjectId> {

    fun findByOwnerId(ownerId: ObjectId): List<Note>

}


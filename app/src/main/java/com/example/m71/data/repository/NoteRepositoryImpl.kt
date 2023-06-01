package com.example.m71.data.repository

import com.example.m71.data.local.NoteDao
import com.example.m71.data.mappers.toEntity
import com.example.m71.data.mappers.toNote
import com.example.m71.domain.model.Note
import com.example.m71.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map { it.toNote()}
    }

    override fun createNote(note: Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toEntity())
    }

    override fun updateNote(note: Note) {
        noteDao.updateNote(note.toEntity())
    }
}
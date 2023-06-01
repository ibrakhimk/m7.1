package com.example.m71.domain.usecase

import com.example.m71.domain.model.Note
import com.example.m71.domain.repository.NoteRepository

class GetAllNotesUseCase(private val noteRepository: NoteRepository) {

    fun getAllNotes() = noteRepository.getAllNotes()

    //    fun createNotes() = noteRepository.createNote()
    fun createNotes(note: Note) {
        noteRepository.createNote(note)
    }

    fun deleteNotes(note: Note) {
        noteRepository.deleteNote(note)
    }

    fun updateNote(note: Note){
        noteRepository.updateNote(note)
    }


}
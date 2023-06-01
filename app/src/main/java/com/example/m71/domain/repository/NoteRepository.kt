package com.example.m71.domain.repository

import com.example.m71.domain.model.Note

interface NoteRepository {

    fun getAllNotes():List<Note>

    fun createNote(note: Note)

    fun deleteNote(note: Note)

    fun updateNote(note: Note)
}
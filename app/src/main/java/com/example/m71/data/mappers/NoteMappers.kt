package com.example.m71.data.mappers

import com.example.m71.data.model.NoteEntity
import com.example.m71.domain.model.Note

fun Note.toEntity()  = NoteEntity(id, title, description)

fun NoteEntity.toNote()  = Note(id, title, description)
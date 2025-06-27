package com.example.quicknote;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteRepository {
    private NoteDao noteDao;
    private LiveData<List<Note>> allNotes;

    public NoteRepository(Application application) {
        NoteDatabase database = NoteDatabase.getInstance(application);
        noteDao = database.noteDao();
        allNotes = noteDao.getAllNotes();
    }

    public void insert(Note note) {
        new Thread(() -> noteDao.insert(note)).start();
    }

    public void update(Note note) {
        new Thread(() -> noteDao.update(note)).start();
    }

    public void delete(Note note) {
        new Thread(() -> noteDao.delete(note)).start();
    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }
}

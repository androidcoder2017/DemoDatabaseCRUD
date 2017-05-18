package com.example.a15056112.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by 15056112 on 18/5/2017.
 */

public class Note implements Serializable {
    private int id;
    private String noteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + noteContent;
    }
}

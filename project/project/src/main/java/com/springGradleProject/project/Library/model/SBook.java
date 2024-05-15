package com.springGradleProject.project.Library.model;

public class SBook {
    private String title;
    private String author;
    private boolean available;

    public SBook() {
    }
    public SBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "SBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}

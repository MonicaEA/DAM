package model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    @SerializedName("Title")
    private String title;
    @SerializedName("Year")
    private int year;
    @SerializedName("Pages")
    private int pages;

    public Libro() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | %s (%d) | %d págs", id, title, year, pages);
    }
}
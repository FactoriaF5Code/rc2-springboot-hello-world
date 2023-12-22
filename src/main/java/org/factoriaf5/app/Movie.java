package org.factoriaf5.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
    private String title;
    private String director;
    
    @Id
    private Long id;
    
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }


    public String getDirector() {
        return director;
    }


    public String getTitle() {
        return title;
    }
}

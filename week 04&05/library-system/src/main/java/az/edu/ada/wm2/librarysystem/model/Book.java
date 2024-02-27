package az.edu.ada.wm2.librarysystem.model;

public class Book {
    private static Long idCounter = 1L;

    private Long id;
    private String title;
    private String description;
    private Integer year;  // Use Integer instead of int to allow null

    private String author;

    public Book() {
        this.id = idCounter++;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

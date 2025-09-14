package CMSAIML.example.CMSAIML.Service;


import CMSAIML.example.CMSAIML.Entity.FacultyBookChapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyBookChapterService {

    private final List<FacultyBookChapter> books = new ArrayList<>();

    public void addBook(FacultyBookChapter book) {
        books.add(book);
    }

    public List<FacultyBookChapter> getAllBooks() {
        return books;
    }

    public FacultyBookChapter getByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteByTitle(String title) {
        return books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
    }
}

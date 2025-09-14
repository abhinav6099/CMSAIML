package CMSAIML.example.CMSAIML.Controller;


import CMSAIML.example.CMSAIML.Entity.FacultyBookChapter;
import CMSAIML.example.CMSAIML.Service.FacultyBookChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty-books")
public class FacultyBookChapterController {

    @Autowired
    private FacultyBookChapterService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody FacultyBookChapter book) {
        bookService.addBook(book);
        return "Book or chapter added successfully.";
    }

    @GetMapping("/all")
    public List<FacultyBookChapter> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/get/{title}")
    public FacultyBookChapter getBook(@PathVariable String title) {
        FacultyBookChapter book = bookService.getByTitle(title);
        if (book != null) return book;
        throw new RuntimeException("Book not found.");
    }

    @DeleteMapping("/delete/{title}")
    public String deleteBook(@PathVariable String title) {
        boolean removed = bookService.deleteByTitle(title);
        return removed ? "Book deleted successfully." : "Book not found.";
    }
}

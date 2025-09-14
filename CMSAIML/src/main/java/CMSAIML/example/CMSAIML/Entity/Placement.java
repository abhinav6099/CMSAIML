package CMSAIML.example.CMSAIML.Entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "placements")
public class Placement {

    // Setters
    // Getters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;  // Reference to the student placed

    private String company;
    private double packageAmount;  // Salary package offered
    private int year;  // Year of placement

    // Default constructor


    // Parameterized constructor
    public Placement(Long id, Student student, String company, double packageAmount, int year) {
        this.id = id;
        this.student = student;
        this.company = company;
        this.packageAmount = packageAmount;
        this.year = year;
    }

}

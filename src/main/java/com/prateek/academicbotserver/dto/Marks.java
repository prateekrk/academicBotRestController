package com.prateek.academicbotserver.dto;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.List;

public class Marks {
    @Id
    @ManyToMany(mappedBy = "subjectId")
    private List<Subject> subject;
    private int scored;
    private int total;
    private LocalDate localDate;
    private String academicYear;
    @ManyToMany
    private List<Faculty> faculty;
}

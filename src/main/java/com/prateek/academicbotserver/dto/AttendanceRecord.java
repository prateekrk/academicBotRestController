package com.prateek.academicbotserver.dto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class AttendanceRecord {
    private Subject subject;
    private int attended;
    private int conducted;
    private String remarks;
    @ManyToOne
    private List<Faculty> faculties;
}

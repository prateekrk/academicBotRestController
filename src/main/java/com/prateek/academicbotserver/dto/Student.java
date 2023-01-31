package com.prateek.academicbotserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "usn"))
public class Student {
    private String name;
    @OneToOne(mappedBy = "email")
    private User user;
    private String usn;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "courseName")
    private Course course;
    private int semester;
    private Designation designation = Designation.STUDENT;
    @OneToMany
    private List<Marks> academicRecords;
    @OneToMany
    private List<AttendanceRecord> attendanceRecords;
    @OneToOne
    private StudentDetails studentDetails;
}

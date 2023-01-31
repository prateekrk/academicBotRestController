package com.prateek.academicbotserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "facultyId"))
public class Faculty {
    @Id
    private String facultyId;
    @Enumerated(EnumType.ORDINAL)
    private Designation designation;
    private String name;
    @OneToOne(mappedBy = "email")
    private User user;
    @OneToOne(mappedBy = "courseName")
    private Course course;
    private String phoneNumber;
    private String joinedOn;
    private String facultyAddress;
    @OneToMany
    private List<Subject> subjects;

}

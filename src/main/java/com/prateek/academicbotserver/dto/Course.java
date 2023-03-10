package com.prateek.academicbotserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "courseName"))
public class Course {
    String courseName;
}

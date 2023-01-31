package com.prateek.academicbotserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class SubjectCatalog {
    private String name;
    private int credits;
    @ManyToOne
    private Faculty faculty;
}

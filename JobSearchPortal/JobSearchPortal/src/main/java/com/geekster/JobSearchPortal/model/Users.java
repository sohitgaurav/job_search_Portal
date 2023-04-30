package com.geekster.JobSearchPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="location")
    private String location;

    @Column(name="salary")
    private Double salary;

    @Column(name="company_Name")
    private String companyName;

    @Column(name="employ_Name")
    private String employName;

    @Column(name="job_Type")
    @Enumerated(EnumType.STRING)
    private JobType jobType;

}

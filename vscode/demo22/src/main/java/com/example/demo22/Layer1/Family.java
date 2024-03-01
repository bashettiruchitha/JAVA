package com.example.demo22.Layer1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Family")
@Setter
@Getter
@NoArgsConstructor
public class Family
{
    @Id
    @Column(name="family_id")
    private int id;

    @Column(name="person_name")
    private String pname;

    @Column(name="person_age")
    private int page;

    @Column(name="occupation")
    private String poccupation;
    
}

package com.example.empiria;

import javax.persistence.*;

public class LipolysisConsenti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Person person;
}

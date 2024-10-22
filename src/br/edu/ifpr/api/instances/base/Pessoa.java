package br.edu.ifpr.api.instances.base;

import java.time.LocalDate;

import br.edu.ifpr.api.global.GlobalFlags;

public class Pessoa {
    private String CPF;
    private String name;
    private LocalDate dateOfBirth;

    /******************\
     *  CONSTRUCTORS  *
    \******************/

    private Pessoa( String name, String CPF, LocalDate dob ) {
        if( GlobalFlags.VERBOSE && (dob == null || CPF == null || name == null) ) System.err.println("WARN: Class instantiated with ");

        this.dateOfBirth = dob;
        this.CPF = CPF;
        this.name = name;
    }

    private Pessoa() {}

    /***************\
     *  OVERRIDES  *
    \***************/

    @Override
    public String toString() {
        return "%s|%s@%s".formatted(name, dateOfBirth.toEpochDay(), dateOfBirth );
    }

    /***********************\
     *  GETTERS & SETTERS  *
    \***********************/

    public String getCPF() { return CPF; }
    public String getName() { return name; }
    public LocalDate   getDateOfBirth() { return dateOfBirth; }

    public void setCPF(String cPF) { CPF = cPF; }
    public void setName(String name) { this.name = name; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
}
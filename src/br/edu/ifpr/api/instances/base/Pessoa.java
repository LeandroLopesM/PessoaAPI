package br.edu.ifpr.api.instances.base;

import java.time.LocalDate;

import br.edu.ifpr.api.global.ErrorHandler;
import br.edu.ifpr.api.global.GlobalFlags;

public abstract class Pessoa {
    private String CPF;
    private String name;
    private Endereço address;
    private LocalDate dateOfBirth;

    /******************\
     *  CONSTRUCTORS  *
    \******************/

    public Pessoa( String name, String CPF, LocalDate dob ) {
        if( GlobalFlags.VERBOSE && (dob == null || CPF == null || name == null) ) ErrorHandler.warn("WARN: Class instantiated with null parameters, may cause unexpected behavior", "nullparam");

        this.dateOfBirth = dob;
        this.CPF = CPF;
        this.name = name;
    }

    public Pessoa() {}

    /***************\
     *  OVERRIDES  *
    \***************/

    @Override
    public String toString() {
        return "%s:%s:%s@%s".formatted(name, dateOfBirth.toEpochDay(), dateOfBirth, address.toString() );
    }

    /***********************\
     *  GETTERS & SETTERS  *
    \***********************/

    public String    getCPF() { return CPF; }
    public String    getName() { return name; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public Endereço getAddress() { return address; }

    public void setCPF(String cPF) { CPF = cPF; }
    public void setName(String name) { this.name = name; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setAddress( String road, String neighborhood, String city, String state, int cep ) { address = new Endereço( road, neighborhood, city, state, cep ); }
}
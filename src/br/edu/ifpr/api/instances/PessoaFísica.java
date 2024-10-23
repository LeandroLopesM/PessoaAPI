package br.edu.ifpr.api.instances;

import java.time.LocalDate;

import br.edu.ifpr.api.instances.base.Pessoa;

public class PessoaFísica extends Pessoa {

    public PessoaFísica( String name, String CPF, LocalDate dob ) {
        super( name, CPF, dob );
    }
    
    
    public PessoaFísica withAddress( String road, String neighborhood, String city, String state, int cep ) {
        setAddress( road, neighborhood, city, state, cep );
        return this;
    }
}

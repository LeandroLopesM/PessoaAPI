package br.edu.ifpr.api.instances;

import java.time.LocalDate;

import br.edu.ifpr.api.instances.base.Pessoa;

public class PessoaFísica extends Pessoa {

    public PessoaFísica( String name, String CPF, LocalDate dob ) {
        super( name, CPF, dob );
    }
    
    
}

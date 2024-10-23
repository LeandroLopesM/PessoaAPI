# CHANGELOG

## 10/22/2024
### Start
    Created base folder structure along with most basic classes:
        App.java
        Pessoa.java
            Constructor, getters/setters, toString
        GlobalFlags.java
            VERBOSE: boolean
                When giving warnings, check if enabled.
    Now to start implementations.
## 10/23/2024
### Branching out
    Created global flags for error checking and an errorhandler for verbose debugging. Added Address class and PessoaFísica:
        ErrorHandler.java
            Warn, fatal and error flags.
                -- move error flags to GlobalFlags?
        Pessoa.java
            Added address field
        Endereço.java
            Constructors, getters/setters, toString
        PessoaFísica.java
            extended Pessoa
#### MINOR
    Formatted GlobalFlags and ErrorHandler to specification.
package br.edu.ifpr.api.instances.base;

import br.edu.ifpr.api.global.ErrorHandler;

public class Endereço {
    private String road;
    private String neighborhood;
    private String city;
    private String state;
    private int cep;

    /******************\
     *  CONSTRUCTORS  *
    \******************/
    
    protected Endereço(String road, String neighborhood, String city, String state, int cep) {
        if( road == null || neighborhood == null || city == null || state == null || cep <= 0 ) 
            ErrorHandler.warn("Class instantiated with null parameters, may cause unexpected behavior", "nullparam");
        
        this.road = road;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cep = cep;
    }

    protected Endereço() { ErrorHandler.warn("Class instantiated with null parameters, may cause unexpected behavior", "nullparam"); }

    /***************\
     *  OVERRIDES  *
    \***************/

    @Override
    public String toString() {
        return "%s:%s:%s:%s@%d".formatted(road, neighborhood, city, state, cep);
    }

    /***********************\
     *  GETTERS & SETTERS  *
    \***********************/
    
    public int    getCep() { return cep; }
    public String getRoad() { return road; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getNeighborhood() { return neighborhood; }
    
    public void setCep( int cep ) { this.cep = cep; }
    public void setRoad( String road ) { this.road = road; }
    public void setCity( String city ) { this.city = city; }
    public void setState( String state ) { this.state = state; }
    public void setNeighborhood( String neighborhood ) { this.neighborhood = neighborhood; }
    
}

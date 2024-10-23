package test.br.edu.ifpr.api.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import br.edu.ifpr.api.global.GlobalFlags;
import br.edu.ifpr.api.instances.PessoaFísica;

import org.junit.Test;

public class App {
    @Test
    public void pessoaFísicaConstructor() {
        PessoaFísica pf = new PessoaFísica("NAME", "00000000000", LocalDate.of(2000, 1, 1));
        String[] results = new String[]{ pf.getName(), pf.getCPF(), pf.getDateOfBirth().toString() };
        assertArrayEquals( results , new String[]{ "NAME", "00000000000", "2000-01-01" });
    }

    @Test
    public void pessoaFísicaConstructorNullParamErrorFlag() {
        PessoaFísica pf = new PessoaFísica(null, null, null);
        assertEquals( GlobalFlags.NULLPARAM, true );
    }

    @Test
    public void pessoaFísicaEndereçoConstructor() {
        PessoaFísica pf = new PessoaFísica("NAME", "00000000000", LocalDate.of(2000, 1, 1))
                          .withAddress("ROAD", "NEIGHBORHOOD", "CITY", "STATE", 123);
        assertArrayEquals( 
            new String[]{ pf.getAddress().getRoad(), pf.getAddress().getNeighborhood(), pf.getAddress().getCity(), pf.getAddress().getState(), String.valueOf(pf.getAddress().getCep())  }, 
            new String[]{ "ROAD", "NEIGHBORHOOD", "CITY", "STATE", "123" }
        );
    }

    @Test
    public void pessoaFísicaEndereçoConstructorNullParameterErrorFlag() {
        PessoaFísica pf = new PessoaFísica("NAME", "00000000000", LocalDate.of(2000, 1, 1))
                          .withAddress("ROAD", "NEIGHBORHOOD", "CITY", "STATE", 123);
        assertEquals( GlobalFlags.NULLPARAM, true );
    }
}

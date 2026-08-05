import org.example.ContaBancaria;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class ContaBancariaTeste {


    ContaBancaria conta;

    @BeforeEach
    void preparar() {
        conta = new ContaBancaria(100.00);
    }

    @Test
    public void deveAumentarSaldoAoDepositar() {
        conta.depositar(50.0);
        assertEquals(150.0, conta.consultarSaldo());
    }

}

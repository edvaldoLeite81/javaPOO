import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Conta {
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    @Override
    public String toString() {
        Locale locale = new Locale("pt","BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(locale);
        return "Conta{" +
                "titular=" + titular.nome +
                ", CPF=" + titular.documento +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + moeda.format(saldo) +
                '}';
    }
}

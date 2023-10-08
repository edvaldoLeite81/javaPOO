import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(locale);

        Pessoa titular1 = new Pessoa();
        titular1.nome = "Godofredo da Silva";
        titular1.documento="22117584560";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Godofredina da Silva";
        titular2.documento="27158645895";

        Conta minhaConta = new Conta();
        minhaConta.titular = titular1;
        minhaConta.agencia = 1234;
        minhaConta.numero = 123456;
        minhaConta.saldo = 80_800.00;

        Conta suaConta = new Conta();
        suaConta.titular = titular2;
        suaConta.agencia = 5678;
        suaConta.numero = 564789;
        suaConta.saldo = 34_569.22;

        System.out.println(minhaConta);
        System.out.println(suaConta);

    }
}
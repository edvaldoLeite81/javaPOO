import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //default double por isso necessario explicita "f"
        float salario = 5_832.00f;
        float rendimento = 0.5f;
        Locale locale = new Locale("pt", "BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(locale);

        System.out.println("****************************");
        System.out.println("Salário Mensal: " + moeda.format(salario));
        System.out.println("Rendimento Mensal: " + rendimento + "%");
        System.out.println("****************************");

        for (int mes = 1; mes <= 12; mes++) {
            salario += salario * rendimento / 100;
            System.out.printf("%nSalário ao final do %d° mês: R$ %,.2f%n", mes, salario);
            System.out.println("********* Com NumberFormat: " + moeda.format(salario));
        }
    }
}

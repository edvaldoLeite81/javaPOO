
public class Main {
    public static void main(String[] args) {
        //default double por isso necessario explicita "f"
        float salario = 4_580.00f;
        float rendimento = 0.5f;

        System.out.println("**************************");
        System.out.println("Salário Mensal: " + salario);
        System.out.println("Rendimento Mensal: " + rendimento +"%");
        System.out.println("**************************");

        for (int mes = 1; mes <= 12; mes++){
            salario += salario * rendimento / 100;
            System.out.printf("Salário ao final do %d° mês: R$ %,.2f%n",mes,salario);
        }
    }
}

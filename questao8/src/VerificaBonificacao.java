
import java.util.Scanner;

public class VerificaBonificacao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos funcionários serão cadastrados?");
        int quantidade = input.nextInt();

        String[] funcionarios = new String[quantidade];
        double[] salarios = new double[quantidade];
        double[] salarioFinal = new double[quantidade];
        double[] porcentagem = new double[quantidade];

//        for (int x = 0; x < quantidade; x++) {
//
//            System.out.println("Qual o nome do funcionário " + (x + 1) + " ?");
//            String nome = input.nextLine();
//
//        }
        int x = 0;
        String eBonus = "Bônus";
        while (x <= funcionarios.length - 1) {
            System.out.println("Qual o nome do funcionário " + (x + 1) + " ?");
            String nome = input.next();
            funcionarios[x] = nome;
            System.out.println("Qual o salário do funcionário?");
            double salario = input.nextDouble();
            salarios[x] = salario;
            x++;
        }

        

        for (int i = 0; i < funcionarios.length; i++) {
            if (salarios[i] <= 1000) {
                double bonus = (salarios[i] * 20) / 100;
                porcentagem[i] = bonus;
                salarioFinal[i] = bonus + salarios[i];

            } else {
                if (salarios[i] < 2000) {
                    double bonus = (salarios[i] * 10)/100;
                    porcentagem[i] = bonus;
                    salarioFinal[i] = bonus + salarios[i];
                } else {
                    double bonus = (salarios[i] * 10)/100;
                    porcentagem[i] = bonus;
                    salarioFinal[i] = salarios[i] - bonus;
                    eBonus = "Desconto";
                }
            } 
        }
        
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionário " + funcionarios[i]);
            System.out.println("Salário: " + salarios[i]);
            System.out.println(eBonus + ": " + porcentagem[i]);
            System.out.println("Salário Líquido: " + salarioFinal[i]);


        }
        
        

    }

}

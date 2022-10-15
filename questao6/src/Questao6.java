
import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual é o seu nome?");
        String player = input.nextLine();
        
                
        String[] perguntas = new String[]{"Qual foi o primeiro modelo de carro a rodar, oficialmente, no Brasil?" + "%n" + "A) Peugeot Type 3" + "%n" + "B) Peugeot Type 2" + "%n" + "C) Jeep" + "%n" + "D) Volkswagen Fusca" + "%n" + "E) Nenhuma das alternativas" + "%n",
                                          "Como se fala verde em francês?" + "%n" + "A) Fert" + "%n" + "B)Verde" + "%n" + "C)Green" + "%n" + "D) Verdê" + "%n" + "E) Vert",
                                          "Qual é a fruta mais consumida no Brasil? "+ "%n" + "A) Uva" + "%n" + "B) Banana" + "%n" + "C) Laranja" + "%n" + "D) Goiaba" + "%n" + "E) Maracujá",
                                          "Qual é a cor mais popular do mundo?" + "%n" + "A) Amarelo" + "%n" + "B) Vermelho" + "%n" + "C) Azul" + "%n" + "D) Verde" + "%n" + "E) Preto",
                                          "Segundo Spotify, qual é o gênero musical mais ouvido no mundo?" + "%n" + "A) Rap" + "%n" + "B) Samba" + "%n" + "C) Rock" + "%n" + "D) Funk" + "%n" + "E) Pop"};
        String[] respostas = new String[]{"A",
                                          "E",
                                          "B",
                                          "C",
                                          "A"};
                                        
    
    
    
        int posicaoPergunta = 0, acertos = 0, erros = 0;
        
        for (String resposta1 : respostas) {
            System.out.printf(perguntas[posicaoPergunta]);
            System.out.printf("%n" + "Qual é a resposta?");
            String resp = input.nextLine();
            if (resposta1.equals(resp)) {
                System.out.println("Acertou");
                acertos ++;
            } else {
                System.out.println("Errou");
                erros ++;
            }
            posicaoPergunta ++;
        }
        
        System.out.println("Usuário " + player + ":");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
    }

}

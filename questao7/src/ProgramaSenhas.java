import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ProgramaSenhas {

    public static void main(String[] args) {

        Dados dados = new Dados("Compass", "senha123");

        String[] respostas = new String[]{"Bom dia, você se logou ao nosso sistema",
                                          "Boa tarde, você se logou ao nosso sistema",
                                          "Boa noite, você se logou ao nosso sistema",
                                          "Boa madrugada, você se logou ao nossos sistema",
                                          "Usuário e/ou senha incorretos"};
                                        
    
         Scanner input = new Scanner(System.in);

      System.out.print("Qual é o seu nome?");
      String usuario = input.nextLine();
      System.out.println("Qual é a sua senha?");
      String senha = input.nextLine();

      
      
        Date d = new Date();
        
       
        SimpleDateFormat hora = new SimpleDateFormat("HH");
        
        int horaAgora = Integer.parseInt(hora.format(d));
       
        int i = 4;
        
        if ((usuario.equals(dados.getUsuario())) && (senha.equals(dados.getSenha()))){
            
            if ((horaAgora >= 6) && (horaAgora <12)) {
                i = 0;
            } else {
                if ((horaAgora >= 12) && (horaAgora <18)) {
                    i = 1;
                } else {
                    if ((horaAgora >= 18) && (horaAgora <0)) {
                        i = 2;
                    } else {
                        if ((horaAgora >= 0) && (horaAgora <6)) {
                            i = 3;
                        }
                    }
                }
            }  
            
            
        } 
        
        
        String resposta = respostas[i];
        System.out.println(resposta);
        
    
    }

}

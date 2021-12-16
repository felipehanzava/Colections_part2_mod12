package hz.felipe.ebac.modulo12;


import java.util.Scanner;
import java.util.Arrays;

public class Parte1 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite nomes separados por ,  ");

        String resposta = s.next();
        String[] vetNome = resposta.split(",");
        Arrays.sort(vetNome);

        for (int i=0; i<vetNome.length; i++){
            System.out.println(""+ vetNome[i]);
        }


    }


}

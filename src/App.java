import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //12- Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58.

    //Entrada
    Double altura, pesoideal;
    Scanner teclado;
    
    System.out.println(" Digite a sua altura em metros ");
    teclado = new Scanner(System.in);
    altura = teclado.nextDouble();
    
    teclado.close();

    //Processamento
    pesoideal = ((72.7 * (altura)) - 58.);

    //Saída
    System.out.println("O seu peso ideal é igual a: " + pesoideal);

    }
}

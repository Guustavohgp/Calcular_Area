package Calcular_Area.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o número de formas: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Forma #" + i + ":");
            System.out.println("Escolha a forma");
            System.out.print("Círculo (cir), Retângulo (ret), Quadrado (qua), Triângulo Equiláteo (tri) e Trapézio (tra)");
            String sigla = sc.nextLine();
            
            switch (sigla) {
                case "cir":
                System.out.println("Raio: ");
                double raioCir = sc.nextDouble();
                    
                break;
                case "ret":
                System.out.println("Altura: ");
                double alturaRet = sc.nextDouble();
                System.out.println("Largura: ");
                double larguraRet = sc.nextDouble();
                    
                break;
                case "qua":
                System.out.println("Lado: ");
                double ladoQua = sc.nextDouble();
                    
                break;
                case "tri":
                System.out.println("Altura: ");
                double alturaTri = sc.nextDouble();
                System.out.println("Largura: ");
                double larguraTri = sc.nextDouble();

                break;
                case "tra":
                    
                break;
            
                default:
                    break;
            }
        }
    }
    
}

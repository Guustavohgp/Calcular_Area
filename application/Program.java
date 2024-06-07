package Calcular_Area.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Calcular_Area.entities.Circulo;
import Calcular_Area.entities.Formas;
import Calcular_Area.entities.Quadrado;
import Calcular_Area.entities.Retangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        List<Formas> list = new ArrayList<>();

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
                list.add(new Circulo(raioCir));
                break;

                case "ret":
                System.out.println("Altura: ");
                double alturaRet = sc.nextDouble();
                System.out.println("Largura: ");
                double larguraRet = sc.nextDouble(); 
                list.add(new Retangulo(alturaRet, larguraRet));  
                break;

                case "qua":
                System.out.println("Lado: ");
                double ladoQua = sc.nextDouble();
                list.add(new Quadrado(ladoQua));
                    
                break;
                case "tri":
                System.out.println("Altura: ");
                double alturaTri = sc.nextDouble();
                System.out.println("Largura: ");
                double larguraTri = sc.nextDouble();
                break;

                case "tra":
                System.out.println("Base maior:" );
                double baseMaiorTra = sc.nextDouble();
                System.out.println("Base menor: ");
                double baseMenorTra = sc.nextDouble();
                System.out.println("Altura: ");
                double alturaTra = sc.nextDouble();  
                break;
            
                default:
                    break;
            }
        }
    }
    
}

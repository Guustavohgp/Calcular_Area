package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Circulo;
import entities.Formas;
import entities.Quadrado;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        List<Formas> list = new ArrayList<>();

        System.out.print("Digite o número de formas:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=n; i++) {
            System.out.println("Forma #" + i + ":");
            System.out.println("Escolha a forma");
            System.out.print("Círculo (cir), Retângulo (ret), Quadrado (qua), Triângulo Equiláteo (tri) e Trapézio (tra): ");
            String sigla = sc.nextLine();
            
                switch (sigla) {
                case "cir":
                System.out.println("Raio: ");
                double raioCir = sc.nextDouble();
                sc.nextLine();  
                list.add(new Circulo(raioCir));
                break;

                case "ret":
                System.out.println("Altura: ");
                double alturaRet = sc.nextDouble();
                sc.nextLine(); 
                System.out.println("Largura: ");
                double larguraRet = sc.nextDouble(); 
                sc.nextLine(); 
                list.add(new Retangulo(alturaRet, larguraRet));  
                break;

                case "qua":
                System.out.println("Lado: ");
                double ladoQua = sc.nextDouble();
                sc.nextLine(); 
                list.add(new Quadrado(ladoQua));   
                break;

                case "tri":
                System.out.println("Altura: ");
                double alturaTri = sc.nextDouble();
                sc.nextLine(); 
                System.out.println("Largura: ");
                double larguraTri = sc.nextDouble();
                sc.nextLine(); 
                list.add(new Triangulo(alturaTri, larguraTri));
                break;

                case "tra":
                System.out.println("Base maior:" );
                double baseMaiorTra = sc.nextDouble();
                sc.nextLine(); 
                System.out.println("Base menor: ");
                double baseMenorTra = sc.nextDouble();
                sc.nextLine(); 
                System.out.println("Altura: ");
                double alturaTra = sc.nextDouble();  
                sc.nextLine(); 
                list.add(new Trapezio(baseMaiorTra, baseMenorTra, alturaTra));
                break;
                
                default:
                if (sigla != "cir" && sigla != "ret" && sigla != "qua" &&  sigla != "tri" &&  sigla != "tra") {
                    System.out.println("Forma inválida");
                    return;
                }
            }
        }  
        sc.close(); 

        System.out.println();
        System.out.println("Area: ");
        for (Formas forma: list){
            System.out.println(String.format ("%.2f", forma.area()));
        }   
    }
} 





    

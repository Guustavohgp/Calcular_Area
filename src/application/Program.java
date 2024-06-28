package Calcular_Area.src.application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Calcular_Area.src.entities.CreateFormas;
import Calcular_Area.src.entities.Formas;
import Calcular_Area.src.entities.Circulo;
import Calcular_Area.src.entities.Quadrado;
import Calcular_Area.src.entities.Retangulo;
import Calcular_Area.src.entities.Triangulo;
import Calcular_Area.src.entities.Trapezio;
import Calcular_Area.src.entities.Formas;
import Calcular_Area.src.entities.CreateFormas;



public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Formas> list = new ArrayList<>();

        int n = 0;
        
        // Solicitar o número de formas com tratamento de exceção
        while (true) {
            try {
                System.out.print("Digite o número de formas: ");
                n = sc.nextInt();
                sc.nextLine(); // Limpar o buffer
                if (n <= 0) {
                    System.out.println("O número de formas deve ser positivo. Tente novamente.");
                    continue;
                }
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido, insira um número inteiro.");
                sc.nextLine(); 
            }
        }

        for (int i = 1; i <= n; i++) { // loop para ler as formas
            try {
                System.out.println("Forma #" + i + ":");
                System.out.print("Escolha a forma (cir, ret, qua, tri, tra): ");
                String sigla = sc.nextLine();

                Formas forma = CreateFormas.createForma(sigla, sc);
                list.add(forma); // adicionando forma a uma lista

            } catch (InputMismatchException e) { 
                System.out.println("Forma inválida. Tente novamente.");
                i--;
                continue;
            }
        }
        sc.close();

        System.out.println();
        System.out.println("Área das Formas:");
        int formaNumero = 1;
        for (Formas forma : list) { 
            System.out.println("Forma #" + formaNumero + ": " + forma.toString());
            formaNumero++;
        }
    }
}
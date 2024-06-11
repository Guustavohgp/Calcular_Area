package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Circulo;
import entities.CreateFormas;
import entities.Formas;
import entities.Quadrado;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Formas> list = new ArrayList<>();

        System.out.print("Digite o número de formas: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            try {
                System.out.println("Forma #" + i + ":");
                System.out.print("Escolha a forma (cir, ret, qua, tri, tra): ");
                String sigla = sc.nextLine();

                Formas forma = CreateFormas.createForma(sigla, sc);
                list.add(forma);

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.nextLine(); // Limpa o buffer
                i--; // Decrementa o contador para repetir a entrada desta forma
            }
        }

        sc.close();

        System.out.println();
        System.out.println("Área das Formas:");
        int formaNumero = 1;
        for (Formas forma : list) {
            System.out.println("Forma #" + formaNumero + ": " + String.format("%.2f",forma.toString()));
            formaNumero++;
        }
    }
}
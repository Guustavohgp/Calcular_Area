package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
        Scanner sc = new Scanner(System.in);
        List<Formas> list = new ArrayList<>();

        try {
            System.out.print("Digite o número de formas: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {
                System.out.println("Forma #" + i + ":");
                System.out.println("Escolha a forma");
                System.out.print("Círculo (cir), Retângulo (ret), Quadrado (qua), Triângulo Equilátero (tri) e Trapézio (tra): ");
                String sigla = sc.nextLine();

                

        System.out.println();
        System.out.println("Área das Formas:");
        for (Formas forma : list) {
            System.out.println(String.format("%.2f", forma.area()));
        }
    }
}
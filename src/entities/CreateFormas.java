package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateFormas {

    public static Formas createForma(String sigla, Scanner sc) {
        switch (sigla.toLowerCase()) {
            case "cir":
                System.out.print("Raio: ");
                double raioCir = sc.nextDouble();
                sc.nextLine();
                return new Circulo(raioCir);

            case "ret":
                System.out.print("Altura: ");
                double alturaRet = sc.nextDouble();
                sc.nextLine();
                System.out.print("Largura: ");
                double larguraRet = sc.nextDouble();
                sc.nextLine();
                return new Retangulo(alturaRet, larguraRet);

            case "qua":
                System.out.print("Lado: ");
                double ladoQua = sc.nextDouble();
                sc.nextLine();
                return new Quadrado(ladoQua);

            case "tri":
                System.out.print("Altura: ");
                double alturaTri = sc.nextDouble();
                sc.nextLine();
                System.out.print("Base: ");
                double larguraTri = sc.nextDouble();
                sc.nextLine();
                return new Triangulo(alturaTri, larguraTri);

            case "tra":
                System.out.print("Base maior: ");
                double baseMaiorTra = sc.nextDouble();
                sc.nextLine();
                System.out.print("Base menor: ");
                double baseMenorTra = sc.nextDouble();
                sc.nextLine();
                System.out.print("Altura: ");
                double alturaTra = sc.nextDouble();
                sc.nextLine();
                return new Trapezio(baseMaiorTra, baseMenorTra, alturaTra);

                default:
                throw new InputMismatchException("Forma inválida");
        }
    }
}
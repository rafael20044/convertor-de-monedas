package com.convertor;

import com.convertor.modelos.Convertir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertir convertir = new Convertir();
        String menu = """
                    ***************************
                    1. Dolar => Peso Colombiano
                    2. Peso Colombiano => Dolar
                    3. Euro => Peso Colombiano
                    4. Peso Colombiano => Euro
                    5. Dolar => Euro
                    6. Euro => Dolar
                    7. Salir
                    ***************************
                    """;
        int op;
        float monto;
        do{
            System.out.println(menu);
            System.out.println("Digite una opcion: ");
            op = sc.nextInt();
            switch (op){
                case 1 ->{
                    System.out.println("Digite el monto en dolares: ");
                    monto = sc.nextFloat();
                    float resultado = convertir.dolarToPesoCop(monto);
                    System.out.println(monto + " USD equivale a " + resultado + " COP");
                }
                case 2 ->{
                    System.out.println("Digite el monto en pesos colombianos: ");
                    monto = sc.nextFloat();
                    float resultado = convertir.pesoCopToDolar(monto);
                    System.out.println(monto + " COP equivale a " + resultado + " USD");
                }
                case 3 ->{
                    System.out.println("Digite el monto en euros: ");
                    monto = sc.nextFloat();
                    float resultado = convertir.euroToPesoCop(monto);
                    System.out.println(monto + " EUR equivale a " + resultado + " COP");
                }
                case 4 ->{
                    System.out.println("Digite el monto en pesos colombianos: ");
                    monto = sc.nextFloat();
                    float resultado = convertir.pesoCopToEuro(monto);
                    System.out.println(monto + " COP equivale a " + resultado + " EUR");
                }
                case 5 ->{
                    System.out.println("Digite el monto en dolares: ");
                    monto = sc.nextFloat();
                    float resultado = convertir.dolarToEuro(monto);
                    System.out.println(monto + " USD equivale a " + resultado + " EUR");
                }
                case 6 ->{
                    System.out.println("Digite el monto en euros: ");
                    monto = sc.nextFloat();
                    float resultado = convertir.euroToDolar(monto);
                    System.out.println(monto + " EUR equivale a " + resultado + " USD");
                }
            }
        }while (op >= 1 && op <=6);
    }

}
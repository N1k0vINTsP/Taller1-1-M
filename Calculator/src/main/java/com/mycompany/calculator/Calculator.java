package com.mycompany.calculator;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws InterruptedException {
        Scanner digitar = new Scanner(System.in);

        int opc = 0;
        float numA;
        float numB;
        float resultado = 0; 
        double angulo;
        double pi = Math.PI;
        double resultrigo = 0;

        

        for(;;){
            System.out.println("\n\t CALCULADORA OPERACIONAL ");
       
            System.out.println("\n MENU DE OPERACIONES:");
            System.out.println(" 1. Suma");
            System.out.println(" 2. Resta");
            System.out.println(" 3. Multiplicación");
            System.out.println(" 4. División");
            System.out.println(" 5. Funcion seno");
            System.out.println(" 6. Funcion coseno");
            System.out.println(" 7. Funcion tangente");
            System.out.println(" 8. Salir de la calculadora");
    
        do{
            System.out.println("¿Que operacion desea realizar? ");
            opc = digitar.nextInt();

        }while (opc < 0 || opc > 8);

        
        switch (opc) {
            case 1:

                System.out.println("Ingrese el primer número: ");
                numA = digitar.nextFloat();
                System.out.println("Ingrese el segundo número: ");
                numB = digitar.nextFloat();
                resultado = numA + numB;

                System.out.println("\n\n Resultado: " + resultado);
                break;

            case 2:

                System.out.println("Ingrese el primer número: ");
                numA = digitar.nextFloat();
                System.out.println("Ingrese el segundo número: ");
                numB = digitar.nextFloat();
                resultado = numA - numB;

                System.out.println("\n\n Resultado: " + resultado);
                break;

            case 3:

                System.out.println("Ingrese el primer número: ");
                numA = digitar.nextFloat();
                System.out.println("Ingrese el segundo número: ");
                numB = digitar.nextFloat();
                resultado = numA * numB;

                System.out.println("\n\n Resultado: " + resultado);
                break;

            case 4:

                System.out.println("Ingrese el primer número: ");
                numA = digitar.nextFloat();
                System.out.println("Ingrese el segundo número: ");
                numB = digitar.nextFloat();
                if (numB != 0) {
                    resultado = numA / numB;
                    System.out.println("\n\n Resultado: " + resultado);
                } else {
                    System.out.println(" INDEFINIDO. No se puede dividir entre cero.");
                    return;
                }

                break;

            case 5:

                System.out.println("Ingrese el angulo en °: ");
                angulo = digitar.nextDouble();
                angulo = angulo*(pi/180);
                resultrigo = Math.sin(angulo);

                System.out.println("\n\n Resultado: " + resultrigo);
                break;

            case 6:

                System.out.println("Ingrese el angulo en °: ");
                angulo = digitar.nextDouble();
                angulo = angulo*(pi/180);
                resultrigo = Math.cos(angulo);

                System.out.println("\n\n Resultado: " + resultrigo);
                break;

            case 7:

                System.out.println("Ingrese el angulo en °: ");
                angulo = digitar.nextDouble();
                if (numB != 0 || ) {
                angulo = angulo*(pi/180);
                resultrigo = Math.tan(angulo);

                System.out.println("\n\n Resultado: " + resultrigo);
                break;

            case 8:

                System.out.println("\n\n Hasta la proxima :D");
                break;
                
            default:
                System.out.println("\n Operacion no encontrada, vuelva a intentar.");
                return;
        }
        Thread.sleep(10000);
        }
    }

}


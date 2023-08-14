
import java.util.Scanner;


class OperacionBasica{

    double operar(int opc, double numA, double numB){

         switch (opc) {
            case 1:
                //suma
                System.out.println("SUMA");
                return numA + numB;

            case 2:
                //resta
                System.out.println("RESTA");
                return numA - numB;

            case 3:
                //multiplicacion
                System.out.println("MULTIPLICACION");
                return numA * numB;
                
            case 4:
                //division
                System.out.println("DIVISION");
                if (numB != 0) {
                    return numA / numB;      
                } else {
                    System.out.println(" INDEFINIDO. No se puede dividir entre cero.");
                    return Double.NaN;
                }

            default:

                System.out.println("\n Operacion no encontrada, vuelva a intentar.");
                return Double.NaN;

            }
    }
}

class OperacionTrigonometrica extends OperacionBasica{
    private double pi = Math.PI;
    double operar(int opc, double numA, double numB){

    switch (opc) {
        
        case 5:
            //seno
            System.out.println("SENO");
            numA = numA*(pi/180);
            return Math.sin(numA);

        case 6:
            //coseno
            System.out.println("CONSENO");
            numA = numA*(pi/180);
            return Math.cos(numA);

        case 7:
            //tangente
            System.out.println("TANGENTE");
            if (numA == 0 || numA %90==0) {
                    
                System.out.println("\n\n Resultado: INDEFENIDO ");
                return Double.NaN;
            }
            else{
                numA = numA*(pi/180);
                return Math.tan(numA);
                }

        case 8:
            //salir de calculadora
            System.out.println("SALIENDO...");
            System.out.println("\n\n Hasta la proxima :D");
            System.exit(0);

        default:
        
                return super.operar(opc, numA, numB);
        }

    }
}


public class Calculator {

    public static void main(String[] args) throws InterruptedException {
        Scanner digitar = new Scanner(System.in);
        OperacionTrigonometrica op = new OperacionTrigonometrica();

        int opc = 0;
        double numA; 
        double numB; 
        double resultado;

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
            System.out.print("¿Que operacion desea realizar? ");
            System.out.println();
            opc = digitar.nextInt();

          
            if(opc == 5 || opc == 6 || opc == 7){
                
                System.out.print("Ingrese el angulo °: ");
                numA = digitar.nextDouble();
                resultado = op.operar(opc, numA, 0);
                resultado = (Math.round(resultado*100000)/100000.0);

            }else{

                if(opc == 8){

                    resultado = op.operar(opc, 0, 0);

                }else{

                    System.out.print("Ingrese el primer número: ");
                    numA = digitar.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    numB = digitar.nextDouble();
                    resultado = op.operar(opc, numA, numB);
                    resultado = (Math.round(resultado*100000)/100000.0);
                }
            }

            if(!Double.isNaN(resultado)){

                System.out.println();
                System.out.println("El resultado es: " + resultado);
                Thread.sleep(5000);
            }

            

        }while (opc < 0 || opc > 8);

        }

     
    }

}
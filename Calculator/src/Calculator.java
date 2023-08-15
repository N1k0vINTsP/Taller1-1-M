
import java.util.Scanner;


class OperacionBasica{

    double operar(int opc, double numA, double numB){

         switch (opc) {
            case 1:
                //suma
                System.out.println("\nSUMA");
                return numA + numB;

            case 2:
                //resta
                System.out.println("\nRESTA");
                return numA - numB;

            case 3:
                //multiplicacion
                System.out.println("\nMULTIPLICACION");
                return numA * numB;
                
            case 4:
                //division
                System.out.println("\nDIVISION");
                if (numB != 0) {
                    return numA / numB;      
                } else {
                    System.out.println("INDEFINIDO. No se puede dividir entre cero.");
                    return Double.NaN;
                }

            case 5:
                //potencia enesima
                System.out.println("\nPOTENCIA ENESIMA");
                return Math.pow(numA, numB);//numA es la base y numB es el exponente

            case 6:
                // raiz enesima
                System.out.println("\nRAIZ ENESIMA");
                if(numA == 0 && numB<0 || numA == 0 && numB == 0 || numA<0){
                     System.out.println("INDEFINIDO. Numeros imaginarios.");
                     return Double.NaN;
                }else{
                    return Math.pow(numA, 1.0/numB); //numA es el radicando y numB es el indice
                }

            case 10:
                // Calculo IVA
                System.out.println("\nIVA ");
                return numA*(numB/100);

            default:

                System.out.println("\nOperacion no encontrada, vuelva a intentar.");
                return Double.NaN;

            }
    }
}

class OperacionTrigonometrica extends OperacionBasica{
    private double pi = Math.PI;
    double operar(int opc, double numA, double numB){

    switch (opc) {
        
        case 7:
            //seno
            System.out.println("\nSENO");
            numA = numA*(pi/180);
            return Math.sin(numA);

        case 8:
            //coseno
            System.out.println("\nCONSENO");
            numA = numA*(pi/180);
            return Math.cos(numA);

        case 9:
            //tangente
            System.out.println("\nTANGENTE");
            if (numA == 0 || numA %90==0) {
                    
                System.out.println("Resultado: INDEFENIDO ");
                return Double.NaN;
            }
            else{
                numA = numA*(pi/180);
                return Math.tan(numA);
                }

        case 11:
            //salir de calculadora
            System.out.println("\nSALIENDO...");
            System.out.println("\nHasta la proxima :D");
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
        double resultado=0;

        for(;;){
            System.out.println("\n\t CALCULADORA OPERACIONAL ");
       
            System.out.println("\n MENU DE OPERACIONES:");
            System.out.println(" 1. Suma");
            System.out.println(" 2. Resta");
            System.out.println(" 3. Multiplicación");
            System.out.println(" 4. División");
            System.out.println(" 5. Potencia enesima");
            System.out.println(" 6. Raiz enesima");
            System.out.println(" 7. Funcion seno");
            System.out.println(" 8. Funcion coseno");
            System.out.println(" 9. Funcion tangente");
            System.out.println(" 10. Porcentaje IVA");
            System.out.println(" 11. Salir de la calculadora");
    
        do{
            System.out.print("¿Que operacion desea realizar? ");
            opc = digitar.nextInt();
            System.out.println();

          
            if(opc == 7 || opc == 8 || opc == 9){
                
                System.out.print("Ingrese el angulo °: ");
                numA = digitar.nextDouble();
                resultado = op.operar(opc, numA, 0);
                if(!Double.isNaN(resultado)){
                    resultado = (Math.round(resultado*100000)/100000.0);
                }

            }else{

                if(opc == 11){

                    resultado = op.operar(opc, 0, 0);

                }else{

                    if(opc == 5){

                        System.out.print("Ingrese la base: ");
                        numA = digitar.nextDouble();
                        System.out.print("Ingrese el exponente: ");
                        numB = digitar.nextDouble();
                        resultado = op.operar(opc, numA, numB);
                        if(!Double.isNaN(resultado)){
                            resultado = (Math.round(resultado*100000)/100000.0);
                        }

                    }else{

                        if(opc == 6){

                            System.out.print("Ingrese el radicando: ");
                            numA = digitar.nextDouble();
                            System.out.print("Ingrese el indice: ");
                            numB = digitar.nextDouble();
                            resultado = op.operar(opc, numA, numB);
                            if(!Double.isNaN(resultado)){
                                resultado = (Math.round(resultado*100000)/100000.0);
                            }

                        }else{

                            if(opc == 10){

                                System.out.print("Ingrese el monto $: ");
                                numA = digitar.nextDouble();
                                System.out.print("Ingrese el porcentaje de IVA %: ");
                                numB = digitar.nextDouble();
                                resultado = op.operar(opc, numA, numB);
                                if(!Double.isNaN(resultado)){
                                    resultado = (Math.round(resultado*100000)/100000.0);
                                }

                            }else{

                                System.out.print("Ingrese el primer número: ");
                                numA = digitar.nextDouble();
                                System.out.print("Ingrese el segundo número: ");
                                numB = digitar.nextDouble();
                                resultado = op.operar(opc, numA, numB);
                                if(!Double.isNaN(resultado)){
                                    resultado = (Math.round(resultado*100000)/100000.0);
                                }
                            }
                        }
                    }
                }
            }

            if(Double.isNaN(resultado)){

                Thread.sleep(5000);

            }else{
                System.out.println("El resultado es: " + resultado);
                Thread.sleep(5000);
            }

            

        }while (opc < 0 || opc > 8);

        }

     
    }

}
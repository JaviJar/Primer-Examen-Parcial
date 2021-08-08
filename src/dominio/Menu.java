package dominio;

import operaciones.FuncionesAvanzadas;
import operaciones.FuncionesBasicas;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private FuncionesBasicas funcionesBasicas;
    private FuncionesAvanzadas funcionesAvanzadas;
    private Scanner entradaDeTeclado = new Scanner(System.in);

    public Menu() {
        funcionesBasicas = new FuncionesBasicas();
        funcionesAvanzadas = new FuncionesAvanzadas();
    }

    public void app() {
        boolean controlDeBucle = true;

        while (controlDeBucle) {
            double numero1;
            double numero2;
            double valorDeOperacion;
            double angulo;

            System.out.println("Menu Principal de Calculadora");
            System.out.println("\n--------------Operaciones Basicas--------------");
            System.out.println("1-Sumar" +
                    "\n2-Restar" +
                    "\n3-Multiplicar" +
                    "\n4-Dividir");
            System.out.println("\n--------------Operaciones Avanzadas--------------");
            System.out.println("5-Raiz" +
                    "\n6-Potencia" +
                    "\n7-Seno de Angulo" +
                    "\n8-Coseno de Angulo" +
                    "\n9-Tangente de Angulo");
            System.out.println("\n--------------Operaciones Avanzadas--------------");
            System.out.println("10-Salir\n");
            System.out.print("->");
            String opcion = entradaDeTeclado.nextLine();

            if (opcion.matches("[1-9]") || opcion.equalsIgnoreCase("10")) {
                switch (opcion) {
                    case "1":
                        System.out.println("Ingrese el primero numero a sumar");
                        numero1 = Double.parseDouble(entradaDeTeclado.nextLine());
                        System.out.println("Ingrese el segundo numero a sumar");
                        numero2 = Double.parseDouble(entradaDeTeclado.nextLine());

                        System.out.println("el resultado de la suma es: " + funcionesBasicas.sumar(numero1, numero2));
                        break;
                    case "2":
                        System.out.println("Ingrese el numero minuendo");
                        numero1 = Double.parseDouble(entradaDeTeclado.nextLine());
                        System.out.println("Ingrese el numero sustraendo");
                        numero2 = Double.parseDouble(entradaDeTeclado.nextLine());

                        System.out.println("El resultado de la resta es: " + funcionesBasicas.restar(numero1, numero2));
                        break;
                    case "3":
                        System.out.println("Ingrese el primer numero a multiplicar");
                        numero1 = Double.parseDouble(entradaDeTeclado.nextLine());
                        System.out.println("Ingrese el segundo numero a multiplicar");
                        numero2 = Double.parseDouble(entradaDeTeclado.nextLine());

                        System.out.println("El resultado de la multiplicacion es: " + funcionesBasicas.multiplicar(numero1, numero2));
                        break;
                    case "4":
                        System.out.println("Ingrese el numero dividendo");
                        numero1 = Double.parseDouble(entradaDeTeclado.nextLine());
                        System.out.println("Ingrese el numero divisor");
                        numero2 = Double.parseDouble(entradaDeTeclado.nextLine());

                        if (numero2 != 0) {
                            System.out.println("El resultado de la division es: " + funcionesBasicas.dividir(numero1, numero2));
                        } else {
                            System.out.println("no se puede dividir un numero por cero");
                        }
                        break;
                    case "5":
                        System.out.println("Ingrese el numero a operar: ");
                        valorDeOperacion = Double.parseDouble(entradaDeTeclado.nextLine());
                        System.out.println("Ingrese el valor de la raiz: ");
                        int valorRaiz = Integer.parseInt(entradaDeTeclado.nextLine());

                        System.out.println("El Resultado de la Operación de Raices es: " + funcionesAvanzadas.raiz(valorDeOperacion, valorRaiz));
                        break;
                    case "6":
                        System.out.println("Ingrese el numero a operar: ");
                        valorDeOperacion = Double.parseDouble(entradaDeTeclado.nextLine());
                        System.out.println("Ingrese el Valor de la potencia");
                        int valorDePotencia = Integer.parseInt(entradaDeTeclado.nextLine());

                        System.out.println("El Resultado de la Operación es: " + funcionesAvanzadas.potencia(valorDeOperacion, valorDePotencia));
                        break;
                    case "7":
                        System.out.println("Ingrese el valor del angulo");
                        angulo = Double.parseDouble(entradaDeTeclado.nextLine());

                        System.out.println("El Seno del Angulo es: " + funcionesAvanzadas.seno(angulo));
                        break;
                    case "8":
                        System.out.println("Ingrese el valor del angulo");
                        angulo = Double.parseDouble(entradaDeTeclado.nextLine());

                        System.out.println("El Coseno del Angulo es " + funcionesAvanzadas.coseno(angulo));
                        break;
                    case "9":
                        System.out.println("Ingrese el valor del angulo");
                        angulo = Double.parseDouble(entradaDeTeclado.nextLine());

                        System.out.println("La tangente del Angulo es: " + funcionesAvanzadas.tangente(angulo));
                        break;
                    case "10":
                        System.err.println("Gracias por usar la aplicación");
                        System.exit(0);
                        break;
                }

                System.out.println("\n\nDesea Realizar otra operacion (si)");
                String verificacion = entradaDeTeclado.nextLine();

                if(verificacion.equalsIgnoreCase("si")){

                }else {
                    System.err.println("Gracias!!!!");
                    controlDeBucle = false;
                }
            } else {
                System.err.print("Debe elegir una opcion valida");
                entradaDeTeclado.nextLine();
                System.out.println("\n\n\n\n");
            }
        }
    }

}

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombre = "Viuda Negra";
        String tipoDeCuenta = "Corriente";
        double saldo = 16999.99;
        int opcion = 0;


        System.out.println("*********************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo);
        System.out.println("\n*********************************");

        String menu = """
                *** Escribe el nùmero de la opciòn deseada ***
                1 - Consultar saldo
                2 - Depositar
                3 - Retirar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System
                .in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuàl es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 3:
                    System.out.println("¿Cuàl es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
/*
Venta de automoviles
 */
package ventaautomovil;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class VentaAutomovil {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);

        String nombre;
        String valor;

        double precio, resultado = 0, bono;
        System.out.println("Ingresa el nombre de la persona");
        nombre = entrada.nextLine();

        System.out.println("Quieres iniciar \n s: SI n: NO");
        valor = entrada1.nextLine();

        while (valor.equalsIgnoreCase("s")) {
            System.out.println("Precio del carro");
            precio = entrada.nextDouble();
            bono = precio * 0.05;
            resultado = resultado + bono + 150 + 3200;
            System.out.println("Quieres ingresar otro valor \n s: SI n: NO");
            valor = entrada1.nextLine();
        }
        System.out.println("Resultado es : " + resultado);
    }

}

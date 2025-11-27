/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal = "Listado de Notas\n";
        int nota;
        String nombre;
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador = 0;

        while (bandera) {

            System.out.println("Ingrese el nombre del estudiante:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la nota del estudiante:");
            nota = entrada.nextInt();
            
            // Evaluar si es buena o muy buena
            String mensaje = (nota >= 5) ? "Muy buena" : "Buena";

            // Acumula en la cadena final
            cadenaFinal = String.format("%sCalificacion %d (%s) del estudiante %s\n",
                    cadenaFinal, nota, mensaje, nombre);

            // Acumuladores
            suma += nota;
            contador++;

            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            int salida = entrada.nextInt();

            if (salida == -111) {
                bandera = false;
            }

            entrada.nextLine(); // limpiar buffer
        }

        // Cálculo del promedio
        promedio = (double) suma / contador;

        cadenaFinal = String.format("%s\nPromedio de calificaciones: %.2f",
                cadenaFinal, promedio);

        System.out.printf("%s\n", cadenaFinal);
    }
}

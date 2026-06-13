/**
 * ============================================================
 *  Tema 5: Manejo de Archivos
 *  Ingeniería en TI - Primer Semestre
 * ============================================================
 *  Demuestra el uso de:
 *    - FileWriter  → escritura de archivos .txt
 *    - BufferedReader / FileReader → lectura de archivos .txt
 *    - Bloques try-catch-finally para manejo de excepciones
 *    - PrintWriter para escritura con formato
 * ============================================================
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ManejoArchivos {

    // ──────────────────────────────────────────────────────────
    //  MÉTODO 1: Escribir datos en un archivo .txt
    // ──────────────────────────────────────────────────────────
    /**
     * Escribe una lista de estudiantes y sus notas en un archivo de texto.
     *
     * @param nombreArchivo  Nombre (y ruta) del archivo a crear.
     */
    public static void escribirArchivo(String nombreArchivo) {

        // try-with-resources: cierra automáticamente el archivo al terminar
        try (PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivo))) {

            // Datos a guardar
            String[] nombres = {"Ana García", "Luis Torres", "María López"};
            double[] notas   = {92.5, 78.0, 85.3};

            // Encabezado del archivo
            escritor.println("=== Registro de Estudiantes ===");
            escritor.println("Nombre               | Nota");
            escritor.println("---------------------|------");

            // Escribir cada fila con formato
            for (int i = 0; i < nombres.length; i++) {
                // %-21s → texto alineado a la izquierda en 21 caracteres
                escritor.printf("%-21s| %.1f%n", nombres[i], notas[i]);
            }

            escritor.println("===============================");
            System.out.println("✔ Archivo escrito exitosamente: " + nombreArchivo);

        } catch (IOException e) {
            // IOException se lanza si no se puede crear o acceder al archivo
            System.out.println("✘ Error al escribir el archivo: " + e.getMessage());
        }
    }

    // ──────────────────────────────────────────────────────────
    //  MÉTODO 2: Leer y mostrar el contenido de un archivo .txt
    // ──────────────────────────────────────────────────────────
    /**
     * Lee un archivo de texto línea por línea e imprime su contenido.
     *
     * @param nombreArchivo  Nombre (y ruta) del archivo a leer.
     */
    public static void leerArchivo(String nombreArchivo) {

        System.out.println("\n--- Contenido de '" + nombreArchivo + "' ---");

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {

            String linea;          // variable que guarda cada línea leída
            int numeroLinea = 1;

            // readLine() devuelve null al llegar al final del archivo
            while ((linea = lector.readLine()) != null) {
                System.out.println(numeroLinea + ". " + linea);
                numeroLinea++;
            }

        } catch (IOException e) {
            System.out.println("✘ Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("--- Fin del archivo ---");
    }

    // ──────────────────────────────────────────────────────────
    //  MÉTODO 3: Agregar (append) una línea a un archivo existente
    // ──────────────────────────────────────────────────────────
    /**
     * Añade una línea al final de un archivo sin borrar su contenido previo.
     * El segundo parámetro de FileWriter(archivo, true) activa el modo append.
     *
     * @param nombreArchivo  Archivo al que se añadirá contenido.
     * @param contenido      Texto a agregar.
     */
    public static void agregarAlArchivo(String nombreArchivo, String contenido) {

        // true → modo append: no sobreescribe, solo agrega al final
        try (FileWriter escritor = new FileWriter(nombreArchivo, true)) {
            escritor.write(contenido + "\n");
            System.out.println("✔ Línea agregada al archivo.");
        } catch (IOException e) {
            System.out.println("✘ Error al agregar al archivo: " + e.getMessage());
        }
    }

    // ──────────────────────────────────────────────────────────
    //  MAIN: demostración del flujo completo
    // ──────────────────────────────────────────────────────────
    public static void main(String[] args) {

        String archivo = "estudiantes.txt";

        // Paso 1: escribir el archivo desde cero
        System.out.println("=== ESCRITURA DE ARCHIVO ===");
        escribirArchivo(archivo);

        // Paso 2: leer el archivo recién creado
        System.out.println("\n=== LECTURA DE ARCHIVO ===");
        leerArchivo(archivo);

        // Paso 3: agregar una línea extra sin borrar lo anterior
        System.out.println("\n=== APPEND AL ARCHIVO ===");
        agregarAlArchivo(archivo, "Pedro Salas    | 88.0");

        // Paso 4: volver a leer para verificar el cambio
        System.out.println("\n=== ARCHIVO ACTUALIZADO ===");
        leerArchivo(archivo);
    }
}

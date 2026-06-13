/**
 * ============================================================
 *  Main.java — Clase Principal del Tutorial
 *  Ingeniería en TI - Primer Semestre
 * ============================================================
 *  Ejecuta una demostración integrada de todos los temas:
 *    1. Ciclos
 *    2. Métodos
 *    3. Vectores y Matrices
 *    4. Listas (ArrayList)
 *    5. Manejo de Archivos
 *
 *  Puedes compilar y ejecutar cada clase individualmente, o
 *  usar este Main como punto de entrada único.
 * ============================================================
 *  COMPILACIÓN:
 *      javac src/*.java -d out/
 *  EJECUCIÓN:
 *      java -cp out Main
 * ============================================================
 */
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    // ── SEPARADOR VISUAL ─────────────────────────────────────
    static void separador(String titulo) {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║  " + titulo);
        System.out.println("╚══════════════════════════════════════╝");
    }

    // ════════════════════════════════════════════════════════
    //  1. CICLOS
    // ════════════════════════════════════════════════════════
    static void demoCiclos() {
        separador("TEMA 1: CICLOS");

        System.out.println("-- For: tabla del 3 --");
        for (int i = 1; i <= 5; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }

        System.out.println("\n-- While: potencias de 2 --");
        int base = 1;
        int exponente = 0;
        while (exponente <= 8) {
            System.out.println("2^" + exponente + " = " + base);
            base *= 2;
            exponente++;
        }
    }

    // ════════════════════════════════════════════════════════
    //  2. MÉTODOS
    // ════════════════════════════════════════════════════════
    static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void demoMetodos() {
        separador("TEMA 2: MÉTODOS");

        double area = calcularAreaRectangulo(6.0, 4.5);
        System.out.println("Área de rectángulo 6×4.5 = " + area);

        System.out.print("Números primos hasta 20: ");
        for (int i = 2; i <= 20; i++) {
            if (esPrimo(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    // ════════════════════════════════════════════════════════
    //  3. VECTORES Y MATRICES
    // ════════════════════════════════════════════════════════
    static void demoVectoresMatrices() {
        separador("TEMA 3: VECTORES Y MATRICES");

        // Vector
        int[] temperaturas = {22, 19, 25, 30, 27, 18, 24};
        int maxTemp = temperaturas[0];
        for (int t : temperaturas) {
            if (t > maxTemp) maxTemp = t;
        }
        System.out.println("Temperatura máxima de la semana: " + maxTemp + "°C");

        // Matriz identidad 3×3
        System.out.println("\nMatriz identidad 3×3:");
        int[][] identidad = new int[3][3];
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                identidad[f][c] = (f == c) ? 1 : 0;
                System.out.print(identidad[f][c] + "  ");
            }
            System.out.println();
        }
    }

    // ════════════════════════════════════════════════════════
    //  4. LISTAS (ArrayList)
    // ════════════════════════════════════════════════════════
    static void demoListas() {
        separador("TEMA 4: LISTAS (ArrayList)");

        ArrayList<String> asignaturas = new ArrayList<>();
        asignaturas.add("Matemáticas");
        asignaturas.add("Física");
        asignaturas.add("Programación");
        asignaturas.add("Inglés");

        System.out.println("Asignaturas: " + asignaturas);
        System.out.println("Total: " + asignaturas.size());

        asignaturas.remove("Inglés");
        System.out.println("Después de eliminar 'Inglés': " + asignaturas);

        System.out.println("¿Está 'Física'? " + asignaturas.contains("Física"));
    }

    // ════════════════════════════════════════════════════════
    //  5. MANEJO DE ARCHIVOS
    // ════════════════════════════════════════════════════════
    static void demoArchivos() {
        separador("TEMA 5: MANEJO DE ARCHIVOS");
        String archivo = "reporte_demo.txt";

        // Escritura
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            pw.println("Reporte generado por Main.java");
            pw.println("Fecha: 2025");
            pw.println("Estado: OK");
            System.out.println("Archivo '" + archivo + "' creado.");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }

        // Lectura
        System.out.println("Contenido del archivo:");
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("  > " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }

    // ════════════════════════════════════════════════════════
    //  MAIN
    // ════════════════════════════════════════════════════════
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║   TUTORIAL DE JAVA - PRIMER AÑO TI  ║");
        System.out.println("╚══════════════════════════════════════╝");

        demoCiclos();
        demoMetodos();
        demoVectoresMatrices();
        demoListas();
        demoArchivos();

        System.out.println("\n✔ Demo completa. ¡Buen aprendizaje!");
    }
}

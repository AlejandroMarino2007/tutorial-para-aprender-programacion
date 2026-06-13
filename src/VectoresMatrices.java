/**
 * ============================================================
 *  Tema 3: Vectores y Matrices
 *  Ingeniería en TI - Primer Semestre
 * ============================================================
 *  Demuestra el uso de:
 *    - Arreglo unidimensional (vector)  →  int[]
 *    - Arreglo bidimensional (matriz)   →  int[][]
 *    - Recorrido con ciclos anidados
 * ============================================================
 */
public class VectoresMatrices {

    public static void main(String[] args) {

        // ── 1. VECTOR (arreglo unidimensional) ──────────────────
        System.out.println("=== VECTOR: calificaciones de estudiantes ===");

        // Declaración e inicialización directa
        double[] calificaciones = {85.5, 92.0, 78.3, 95.1, 60.7};

        // Recorrer el vector con un for clásico (índice)
        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("  Estudiante " + (i + 1) + ": " + calificaciones[i]);
        }

        // Calcular el promedio recorriendo el vector
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        double promedio = suma / calificaciones.length;
        System.out.printf("Promedio del grupo: %.2f%n", promedio);

        // For-each: sintaxis más corta para recorrer (sin necesitar el índice)
        System.out.println("\nCalificaciones con for-each:");
        for (double nota : calificaciones) {
            System.out.println("  " + nota);
        }

        // ── 2. MATRIZ (arreglo bidimensional) ───────────────────
        System.out.println("\n=== MATRIZ 3x3: tabla de multiplicar ===");

        int filas = 3;
        int columnas = 3;

        // Declarar una matriz de enteros de 3 filas × 3 columnas
        int[][] tabla = new int[filas][columnas];

        // Llenar la matriz con ciclos anidados
        for (int f = 0; f < filas; f++) {       // ciclo externo → recorre filas
            for (int c = 0; c < columnas; c++) { // ciclo interno → recorre columnas
                tabla[f][c] = (f + 1) * (c + 1);
            }
        }

        // Imprimir la matriz con ciclos anidados
        System.out.println("Tabla de multiplicar (filas × columnas):");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                // %-4d: entero alineado a la izquierda en campo de 4 caracteres
                System.out.printf("%-4d", tabla[f][c]);
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        // ── 3. EJEMPLO PRÁCTICO: notas por materia ──────────────
        System.out.println("\n=== MATRIZ: notas de 2 estudiantes en 3 materias ===");

        String[] estudiantes = {"Ana", "Luis"};
        String[] materias    = {"Matemáticas", "Física", "Programación"};

        double[][] notas = {
            {90.0, 85.5, 95.0},   // notas de Ana
            {78.0, 82.0, 88.5}    // notas de Luis
        };

        for (int est = 0; est < notas.length; est++) {
            System.out.println("Notas de " + estudiantes[est] + ":");
            for (int mat = 0; mat < notas[est].length; mat++) {
                System.out.println("  " + materias[mat] + ": " + notas[est][mat]);
            }
        }
    }
}

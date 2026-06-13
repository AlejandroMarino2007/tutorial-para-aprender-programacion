/**
 * ============================================================
 *  Tema 1: Ciclos (Bucles)
 *  Ingeniería en TI - Primer Semestre
 * ============================================================
 *  Demuestra el uso de:
 *    - Bucle FOR  (controlado por contador)
 *    - Bucle WHILE (controlado por condición)
 * ============================================================
 */
public class Ciclos {

    public static void main(String[] args) {

        // ── 1. BUCLE FOR ────────────────────────────────────────
        System.out.println("=== Tabla de multiplicar del 5 (for) ===");

        /*
         * Sintaxis:  for (inicialización; condición; incremento)
         *   - int i = 1  →  contador empieza en 1
         *   - i <= 10    →  se repite mientras i sea ≤ 10
         *   - i++        →  suma 1 al contador en cada vuelta
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // ── 2. BUCLE WHILE ──────────────────────────────────────
        System.out.println("\n=== Cuenta regresiva desde 5 (while) ===");

        /*
         * Sintaxis:  while (condición)
         *   El bloque se ejecuta mientras la condición sea true.
         *   Debemos modificar la variable dentro del bloque para
         *   evitar un bucle infinito.
         */
        int contador = 5;
        while (contador >= 1) {
            System.out.println("Cuenta: " + contador);
            contador--; // equivalente a: contador = contador - 1
        }
        System.out.println("¡Despegue!");

        // ── 3. DO-WHILE (variante del while) ────────────────────
        System.out.println("\n=== Suma acumulada con do-while ===");

        /*
         * do-while garantiza al menos UNA ejecución del bloque
         * antes de evaluar la condición.
         */
        int numero = 1;
        int suma = 0;
        do {
            suma += numero; // suma = suma + numero
            numero++;
        } while (numero <= 10);

        System.out.println("Suma del 1 al 10 = " + suma);
    }
}

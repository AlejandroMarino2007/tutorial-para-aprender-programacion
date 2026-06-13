/**
 * ============================================================
 *  Tema 2: Métodos (Funciones)
 *  Ingeniería en TI - Primer Semestre
 * ============================================================
 *  Demuestra el uso de:
 *    - Métodos static sin retorno  (void)
 *    - Métodos static con retorno
 *    - Paso de parámetros
 *    - Modularización del código
 * ============================================================
 */
public class Metodos {

    // ── MÉTODO 1: sin parámetros y sin retorno (void) ─────────
    /**
     * Imprime un saludo genérico.
     * No recibe datos y no devuelve ningún valor.
     */
    public static void mostrarBienvenida() {
        System.out.println("¡Bienvenido al tutorial de Java!");
    }

    // ── MÉTODO 2: con parámetro y sin retorno (void) ──────────
    /**
     * Imprime un saludo personalizado.
     *
     * @param nombre  El nombre de la persona a saludar.
     */
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "! Que tengas un buen día.");
    }

    // ── MÉTODO 3: con parámetros y con retorno ────────────────
    /**
     * Calcula el área de un rectángulo.
     *
     * @param base   Longitud de la base.
     * @param altura Longitud de la altura.
     * @return       El área resultante (base × altura).
     */
    public static double calcularArea(double base, double altura) {
        double area = base * altura;
        return area; // devuelve el resultado al código que llamó al método
    }

    // ── MÉTODO 4: con lógica interna (número par/impar) ───────
    /**
     * Determina si un número entero es par.
     *
     * @param numero  El número a evaluar.
     * @return        true si es par, false si es impar.
     */
    public static boolean esPar(int numero) {
        return (numero % 2 == 0); // % es el operador módulo (resto de la división)
    }

    // ── MÉTODO 5: método con ciclo interno ────────────────────
    /**
     * Imprime la tabla de multiplicar de un número dado.
     *
     * @param numero  El número del que se generará la tabla.
     */
    public static void imprimirTabla(int numero) {
        System.out.println("--- Tabla del " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // ── MAIN: punto de entrada del programa ───────────────────
    public static void main(String[] args) {

        // Llamada a método sin parámetros
        mostrarBienvenida();

        // Llamada a método con un parámetro String
        saludar("Carlos");
        saludar("María");

        // Llamada a método que retorna un valor double
        double resultado = calcularArea(8.5, 3.0);
        System.out.println("Área del rectángulo: " + resultado + " m²");

        // Llamada a método que retorna boolean
        int num = 14;
        if (esPar(num)) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }

        // Llamada a método con ciclo interno
        imprimirTabla(7);
    }
}

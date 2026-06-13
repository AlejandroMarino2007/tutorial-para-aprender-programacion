/**
 * ============================================================
 *  Tema 4: Listas (ArrayList)
 *  Ingeniería en TI - Primer Semestre
 * ============================================================
 *  Demuestra el uso de:
 *    - ArrayList<String> y ArrayList<Integer>
 *    - Métodos: add(), get(), size(), remove(), contains()
 *    - Comparación conceptual con arreglos estáticos
 * ============================================================
 */
import java.util.ArrayList;  // importación necesaria para usar ArrayList

public class Listas {

    public static void main(String[] args) {

        // ── DIFERENCIA CLAVE ─────────────────────────────────────
        //  Arreglo estático: tamaño FIJO, definido al crearlo.
        //      String[] frutas = new String[3];  →  solo 3 elementos
        //
        //  ArrayList: tamaño DINÁMICO, crece y encoge según se necesite.
        //      ArrayList<String> frutas = new ArrayList<>();

        // ── 1. CREAR un ArrayList vacío ─────────────────────────
        ArrayList<String> frutas = new ArrayList<>();
        System.out.println("=== Lista de frutas ===");

        // ── 2. ADD: agregar elementos ────────────────────────────
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Mango");
        frutas.add("Piña");
        System.out.println("Lista inicial: " + frutas);

        // ── 3. SIZE: obtener el número de elementos ──────────────
        System.out.println("Cantidad de frutas: " + frutas.size());

        // ── 4. GET: acceder a un elemento por índice ─────────────
        // Los índices empiezan en 0, igual que los arreglos
        System.out.println("Primera fruta (índice 0): " + frutas.get(0));
        System.out.println("Tercera fruta (índice 2): " + frutas.get(2));

        // ── 5. REMOVE: eliminar un elemento ─────────────────────
        frutas.remove("Banano");           // elimina por valor
        System.out.println("Después de eliminar 'Banano': " + frutas);

        frutas.remove(0);                  // elimina por índice (elimina "Manzana")
        System.out.println("Después de eliminar índice 0: " + frutas);

        // ── 6. CONTAINS: verificar si existe un elemento ─────────
        System.out.println("¿Existe 'Mango'? " + frutas.contains("Mango"));
        System.out.println("¿Existe 'Uva'?   " + frutas.contains("Uva"));

        // ── 7. AGREGAR en posición específica ────────────────────
        frutas.add(0, "Fresa");            // inserta "Fresa" en el índice 0
        System.out.println("Después de insertar 'Fresa' al inicio: " + frutas);

        // ── 8. RECORRER con for-each ─────────────────────────────
        System.out.println("\nRecorrido con for-each:");
        for (String fruta : frutas) {
            System.out.println("  - " + fruta);
        }

        // ── 9. ArrayList de enteros ──────────────────────────────
        System.out.println("\n=== Lista de números pares hasta 20 ===");
        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = 2; i <= 20; i += 2) {
            pares.add(i);
        }
        System.out.println("Pares: " + pares);
        System.out.println("Total: " + pares.size() + " números");

        // ── 10. LIMPIAR la lista ─────────────────────────────────
        pares.clear();
        System.out.println("Lista después de clear(): " + pares);
        System.out.println("¿Está vacía? " + pares.isEmpty());
    }
}

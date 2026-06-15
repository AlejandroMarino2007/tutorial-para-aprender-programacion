# Aprende Java desde Cero — Tutorial para Principiantes

¿Nunca has programado en tu vida? Perfecto, este tutorial es para vos.

Acá no se asume que sabés nada de programación. Cada concepto se explica desde el principio, con ejemplos de la vida real, y el código se desglosa línea por línea para que no tengas que adivinar qué hace cada parte. Si algo no lo entendés a la primera, releelo con calma — la programación no es difícil, solo requiere paciencia.

Al terminar este tutorial vas a entender cinco conceptos fundamentales que se usan en prácticamente cualquier programa del mundo real.

---

## Tabla de contenidos

| # | Tema | Archivo en el repositorio |
|---|------|--------------------------|
| 1 | [Ciclos (bucles)](#1-ciclos-bucles) | [Ciclos.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Ciclos.java) |
| 2 | [Métodos (funciones)](#2-métodos-funciones) | [Metodos.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Metodos.java) |
| 3 | [Vectores y Matrices](#3-vectores-y-matrices) | [VectoresMatrices.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/VectoresMatrices.java) |
| 4 | [Listas (ArrayList)](#4-listas-arraylist) | [Listas.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Listas.java) |
| 5 | [Manejo de archivos](#5-manejo-de-archivos) | [ManejoArchivos.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/ManejoArchivos.java) |
| + | [Cómo compilar y ejecutar](#cómo-compilar-y-ejecutar-el-proyecto) | [Main.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Main.java) |

---

## 1. Ciclos (Bucles)

### La idea sin tecnicismos

Imaginá que tu profesor de educación física te dice: *"Haz 10 lagartijas"*. Vos no te quedás parado pensando en hacer 10 movimientos distintos — simplemente repetís el mismo movimiento una y otra vez hasta llegar a 10.

Eso es exactamente un ciclo en programación: **una instrucción que se repite automáticamente** una cantidad de veces o hasta que se cumpla alguna condición. Sin ciclos, para imprimir los números del 1 al 100 tendrías que escribir 100 líneas de código. Con un ciclo, se hace en 3.

Java tiene tres tipos de ciclos: `for`, `while` y `do-while`. Cada uno se usa en situaciones distintas.

---

### Ciclo `for` — cuando sabés cuántas veces repetir

#### Sintaxis y qué significa cada parte

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("Repetición número: " + i);
}
```

Desglose palabra por palabra:

- `for` → le dice a Java "voy a repetir algo"
- `int i = 1` → crea un contador llamado `i` que empieza en 1. `int` significa número entero.
- `i <= 10` → la condición: "repetí mientras `i` sea menor o igual a 10"
- `i++` → al final de cada repetición, sumá 1 a `i`. Es lo mismo que escribir `i = i + 1`
- Las llaves `{ }` → todo lo que esté entre ellas se repite
- `System.out.println(...)` → imprime algo en la pantalla. `println` viene de "print line" (imprimir línea)

#### Ejemplo completo: tabla de multiplicar

```java
public class Ciclos {
    public static void main(String[] args) {

        System.out.println("=== Tabla del 5 ===");

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

    }
}
```

#### Explicación línea por línea

```
public class Ciclos {
```
Todo programa Java vive dentro de una "clase". `Ciclos` es el nombre de esta clase — tiene que coincidir exactamente con el nombre del archivo (`Ciclos.java`).

```
    public static void main(String[] args) {
```
Este es el punto de inicio del programa. Java busca este método `main` para saber por dónde empezar a ejecutar. Por ahora no te preocupes por qué dice `public static void` — lo veremos en el tema 2. Lo importante es que sin esta línea, el programa no arranca.

```
        System.out.println("=== Tabla del 5 ===");
```
Imprime el texto `=== Tabla del 5 ===` en la pantalla y baja una línea. Los textos siempre van entre comillas dobles `" "`.

```
        for (int i = 1; i <= 10; i++) {
```
Inicia el ciclo. Crea el contador `i` en 1, y va a repetir todo lo que esté adentro mientras `i` no supere 10.

```
            System.out.println("5 x " + i + " = " + (5 * i));
```
Esta es la línea que se repite. El `+` entre textos y números los une para mostrarlos juntos. `(5 * i)` multiplica 5 por el valor actual de `i`.

```
        }
```
Cierra el ciclo. Aquí Java vuelve al inicio del `for`, suma 1 a `i`, y verifica si sigue cumpliendo la condición.

#### Salida en pantalla

```
=== Tabla del 5 ===
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

---

### Ciclo `while` — cuando no sabés cuántas veces repetir

El `while` se usa cuando la repetición depende de una condición que puede cambiar, no de un contador fijo.

Analogía: seguís cocinando mientras el agua no hierva. No sabés exactamente cuántos minutos va a tardar — simplemente esperás hasta que la condición se cumpla.

```java
int contador = 5;

while (contador >= 1) {
    System.out.println("Cuenta: " + contador);
    contador--; // resta 1. Es lo mismo que contador = contador - 1
}

System.out.println("¡Despegue!");
```

Desglose:
- `while (contador >= 1)` → "repetí mientras `contador` sea mayor o igual a 1"
- `contador--` → le resta 1 al contador en cada vuelta

Salida:
```
Cuenta: 5
Cuenta: 4
Cuenta: 3
Cuenta: 2
Cuenta: 1
¡Despegue!
```

---

### Ciclo `do-while` — cuando necesitás ejecutar al menos una vez

La diferencia con `while` es sutil pero importante: el `do-while` ejecuta el bloque **primero** y verifica la condición **después**. Esto garantiza que el código se ejecute al menos una vez, sin importar la condición.

```java
int numero = 1;
int suma = 0;

do {
    suma = suma + numero;
    numero++;
} while (numero <= 10);

System.out.println("La suma del 1 al 10 es: " + suma);
```

Salida:
```
La suma del 1 al 10 es: 55
```

---

### Error común: el bucle infinito

Este es el error más clásico de principiantes con `while`:

```java
// MAL — bucle infinito, el programa nunca para
int x = 1;
while (x <= 10) {
    System.out.println(x);
    // ¡Se olvidaron de escribir x++ aquí!
}
```

Si olvidás modificar la variable dentro del `while`, la condición nunca se vuelve falsa y el programa se congela. Siempre verificá que la variable que controla el ciclo cambie dentro del bloque.

[Ver código completo en GitHub](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Ciclos.java)

---

## 2. Métodos (Funciones)

### La idea sin tecnicismos

Pensá en una receta de cocina. La receta para hacer arroz está escrita una sola vez en el libro, pero la podés usar todas las veces que quieras sin volver a inventarla. Además, alguien puede seguir la receta sin saber nada de cocina.

Un **método** funciona igual: es un bloque de código al que le ponés un nombre, lo escribís una vez, y lo podés usar (llamar) desde cualquier parte del programa cuantas veces necesites. Esto se llama **modularización** — dividir el programa en partes pequeñas y manejables.

---

### Anatomía de un método

```java
public static double calcularArea(double base, double altura) {
    double area = base * altura;
    return area;
}
```

Desglose palabra por palabra:

- `public` → el método es accesible desde cualquier parte del programa
- `static` → podés llamar al método sin necesitar crear un "objeto". En primer semestre, casi siempre vas a usar `static` porque trabajamos dentro de una sola clase
- `double` → el tipo de dato que el método va a **devolver** (en este caso, un número decimal). Si el método no devuelve nada, se escribe `void` (vacío)
- `calcularArea` → el nombre que le damos al método. Podés ponerle cualquier nombre descriptivo
- `(double base, double altura)` → los **parámetros**: datos que el método necesita recibir para trabajar. Es como decirle a la receta "necesito que me des los ingredientes"
- `return area` → devuelve el resultado al lugar que llamó al método

---

### Ejemplo completo con varios tipos de métodos

```java
public class Metodos {

    // Método sin parámetros y sin retorno
    public static void mostrarBienvenida() {
        System.out.println("¡Bienvenido al curso de Java!");
    }

    // Método con parámetro y sin retorno
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // Método con parámetros y con retorno
    public static double calcularArea(double base, double altura) {
        double area = base * altura;
        return area;
    }

    // Método que retorna verdadero o falso (boolean)
    public static boolean esPar(int numero) {
        return (numero % 2 == 0);
    }

    public static void main(String[] args) {

        mostrarBienvenida();

        saludar("María");
        saludar("Carlos");

        double resultado = calcularArea(6.0, 4.5);
        System.out.println("Área: " + resultado + " m²");

        int num = 14;
        if (esPar(num)) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }
    }
}
```

### Explicación línea por línea

```
public static void mostrarBienvenida() {
```
Define un método llamado `mostrarBienvenida`. Los paréntesis `()` están vacíos porque no necesita que le pasen ningún dato. `void` indica que no devuelve nada — solo hace algo.

```
    System.out.println("¡Bienvenido al curso de Java!");
```
Lo único que hace este método: imprimir un mensaje. Simple y directo.

```
public static void saludar(String nombre) {
```
Este método sí recibe un dato: `nombre`, que es un texto (`String`). `String` siempre se escribe con S mayúscula.

```
public static double calcularArea(double base, double altura) {
    double area = base * altura;
    return area;
}
```
Recibe dos números decimales (`double`), los multiplica, guarda el resultado en la variable `area` y lo devuelve con `return`. El que llame a este método va a recibir ese número de vuelta.

```
return (numero % 2 == 0);
```
`%` es el operador módulo: devuelve el resto de una división. Si `numero % 2` da 0, significa que el número no tiene resto al dividirse entre 2, o sea, es par. `==` compara si dos valores son iguales.

```
mostrarBienvenida();
```
Así se llama (usa) un método. Solo escribís su nombre seguido de paréntesis.

```
double resultado = calcularArea(6.0, 4.5);
```
Llama al método y guarda lo que devuelve en la variable `resultado`.

#### Salida en pantalla

```
¡Bienvenido al curso de Java!
Hola, María!
Hola, Carlos!
Área: 27.0 m²
14 es par.
```

---

### Error común: confundir `void` con un tipo de retorno

```java
// MAL — dice void pero intenta retornar algo
public static void calcular(int a, int b) {
    return a + b; // Error: un método void no puede retornar valores
}

// BIEN — si querés devolver un valor, declarás el tipo correcto
public static int calcular(int a, int b) {
    return a + b;
}
```

Si un método necesita devolver un resultado, el tipo de dato del resultado debe reemplazar a `void` en la declaración.

[Ver código completo en GitHub](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Metodos.java)

---

## 3. Vectores y Matrices

### La idea sin tecnicismos

**Vector (arreglo 1D):** Imaginá una hilera de casilleros numerados en un vestuario: casillero 0, casillero 1, casillero 2... Cada casillero guarda una cosa. Un vector es exactamente eso: una fila de espacios numerados donde cada uno guarda un valor del mismo tipo.

**Matriz (arreglo 2D):** Ahora imaginá un estacionamiento con filas y columnas. Para encontrar tu auto necesitás dos datos: la fila (A, B, C) y el número de columna (1, 2, 3). Una matriz funciona igual: necesitás dos índices para acceder a un valor — fila y columna.

Un detalle importante que confunde al principio: **los índices empiezan en 0, no en 1**. El primer elemento siempre es el elemento número 0.

---

### Vectores (arreglos unidimensionales)

#### Sintaxis

```java
// Forma 1: declarar el tamaño y luego asignar valores
double[] calificaciones = new double[5];
calificaciones[0] = 85.5;
calificaciones[1] = 92.0;

// Forma 2: declarar y asignar valores al mismo tiempo
double[] calificaciones = {85.5, 92.0, 78.3, 95.1, 60.7};
```

Desglose de `double[] calificaciones = new double[5]`:
- `double[]` → un arreglo que guarda números decimales. Los corchetes `[]` indican que es un arreglo, no un solo número
- `calificaciones` → el nombre de la variable
- `new double[5]` → crea espacio en memoria para 5 números decimales. `new` es la palabra que reserva ese espacio

#### Ejemplo completo

```java
public class VectoresMatrices {
    public static void main(String[] args) {

        // Declarar e inicializar el vector
        double[] calificaciones = {85.5, 92.0, 78.3, 95.1, 60.7};

        System.out.println("=== Calificaciones del grupo ===");

        // Recorrer el vector con un for
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
        }

        // Calcular el promedio
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }
        double promedio = suma / calificaciones.length;
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}
```

#### Explicación línea por línea

```
double[] calificaciones = {85.5, 92.0, 78.3, 95.1, 60.7};
```
Crea un vector con 5 valores ya asignados. Los valores van separados por comas dentro de llaves `{}`.

```
for (int i = 0; i < calificaciones.length; i++) {
```
Recorre el vector. `calificaciones.length` devuelve automáticamente el tamaño del vector (5). El contador `i` empieza en 0 (primer índice) y llega hasta 4 (último índice). Se usa `<` en lugar de `<=` porque el último índice válido es `length - 1`.

```
System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
```
`calificaciones[i]` accede al valor en la posición `i`. Se escribe `(i + 1)` para mostrar "Estudiante 1" en lugar de "Estudiante 0", porque visualmente es más natural.

```
System.out.printf("Promedio: %.2f%n", promedio);
```
`printf` permite formatear la salida. `%.2f` significa "mostrar el número con 2 decimales". `%n` es un salto de línea.

#### Salida

```
=== Calificaciones del grupo ===
Estudiante 1: 85.5
Estudiante 2: 92.0
Estudiante 3: 78.3
Estudiante 4: 95.1
Estudiante 5: 60.7
Promedio: 82.32
```

---

### Matrices (arreglos bidimensionales)

```java
// Crear una matriz de 3 filas y 3 columnas
int[][] tabla = new int[3][3];

// Llenar con ciclos anidados
for (int fila = 0; fila < 3; fila++) {
    for (int columna = 0; columna < 3; columna++) {
        tabla[fila][columna] = (fila + 1) * (columna + 1);
    }
}

// Imprimir la matriz
System.out.println("Tabla de multiplicar 3x3:");
for (int fila = 0; fila < 3; fila++) {
    for (int columna = 0; columna < 3; columna++) {
        System.out.printf("%-4d", tabla[fila][columna]);
    }
    System.out.println(); // salto de línea al terminar cada fila
}
```

El ciclo externo (`fila`) controla en qué fila estamos. El ciclo interno (`columna`) recorre todas las columnas de esa fila antes de pasar a la siguiente. `%-4d` imprime el número alineado a la izquierda en un espacio de 4 caracteres, para que la tabla quede prolija.

Salida:
```
Tabla de multiplicar 3x3:
1   2   3   
2   4   6   
3   6   9   
```

---

### Error común: salirse del rango del arreglo

```java
double[] notas = {90.0, 85.0, 78.0}; // 3 elementos: índices 0, 1, 2

System.out.println(notas[3]); // ERROR: no existe el índice 3
```

Java lanza un error llamado `ArrayIndexOutOfBoundsException` (índice fuera de rango). Recordá siempre que el último índice válido es `tamaño - 1`. Para un arreglo de 3 elementos, el último índice es 2.

[Ver código completo en GitHub](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/VectoresMatrices.java)

---

## 4. Listas (ArrayList)

### La idea sin tecnicismos

Los vectores tienen un problema: cuando los creás, tenés que decidir cuántos elementos van a tener y ese número no puede cambiar. Es como comprar una caja de 10 huevos: si necesitás 11, no entran.

Un `ArrayList` es como una bolsa que se estira sola: podés agregar elementos sin preocuparte por el tamaño, y también podés sacar elementos del medio sin que queden espacios vacíos. El ArrayList crece y se achica automáticamente según lo necesites.

---

### Diferencia clave entre arreglo y ArrayList

| | Arreglo `String[]` | Lista `ArrayList<String>` |
|---|---|---|
| Tamaño | Fijo, definido al crearlo | Dinámico, crece y decrece |
| Agregar elemento | No se puede | `lista.add("algo")` |
| Eliminar elemento | No se puede | `lista.remove("algo")` |
| Leer elemento | `arreglo[0]` | `lista.get(0)` |
| Conocer el tamaño | `arreglo.length` | `lista.size()` |

---

### Ejemplo completo

```java
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {

        // Crear un ArrayList vacío que guarda textos (String)
        ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Mango");
        frutas.add("Piña");

        System.out.println("Lista completa: " + frutas);
        System.out.println("Cantidad de frutas: " + frutas.size());
        System.out.println("Segunda fruta: " + frutas.get(1));

        // Eliminar por nombre
        frutas.remove("Banano");
        System.out.println("Después de eliminar Banano: " + frutas);

        // Verificar si existe un elemento
        System.out.println("¿Existe Mango? " + frutas.contains("Mango"));

        // Recorrer con for-each
        System.out.println("\nRecorriendo la lista:");
        for (String fruta : frutas) {
            System.out.println("  - " + fruta);
        }

        // Vaciar la lista
        frutas.clear();
        System.out.println("¿Lista vacía? " + frutas.isEmpty());
    }
}
```

### Explicación línea por línea

```
import java.util.ArrayList;
```
Antes de usar ArrayList hay que "importarlo" — decirle a Java que vamos a usar esa herramienta. Esta línea va siempre al principio del archivo, antes de la clase.

```
ArrayList<String> frutas = new ArrayList<>();
```
Crea una lista vacía. `<String>` indica el tipo de dato que va a guardar (en este caso, textos). Podría ser `<Integer>` para números enteros, `<Double>` para decimales, etc.

```
frutas.add("Manzana");
```
Agrega "Manzana" al final de la lista. Cada `add` agrega en la última posición disponible.

```
frutas.size()
```
Devuelve cuántos elementos tiene la lista en ese momento. A diferencia de los arreglos que usan `.length`, las listas usan `.size()`.

```
frutas.get(1)
```
Devuelve el elemento en la posición 1 (el segundo, porque los índices empiezan en 0).

```
frutas.remove("Banano")
```
Busca "Banano" en la lista y lo elimina. Los demás elementos se reorganizan solos, sin dejar huecos.

```
for (String fruta : frutas) {
```
Esto se llama "for-each" o "for mejorado". Lee como: "para cada `fruta` que haya en `frutas`, hacé esto". Es más simple que el for con contador cuando no necesitás el índice.

#### Salida en pantalla

```
Lista completa: [Manzana, Banano, Mango, Piña]
Cantidad de frutas: 4
Segunda fruta: Banano
Después de eliminar Banano: [Manzana, Mango, Piña]
¿Existe Mango? true
Recorriendo la lista:
  - Manzana
  - Mango
  - Piña
¿Lista vacía? true
```

---

### Error común: olvidar el `import`

```java
// MAL — olvidaron importar ArrayList
public class Listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(); // Error de compilación
    }
}

// BIEN — con el import al principio
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(); // Funciona
    }
}
```

Si ves el error `cannot find symbol: class ArrayList`, lo primero que revisás es si tenés el `import` al principio del archivo.

[Ver código completo en GitHub](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Listas.java)

---

## 5. Manejo de Archivos

### La idea sin tecnicismos

Hasta ahora, todo lo que el programa imprime desaparece cuando lo cerrás. El **manejo de archivos** permite guardar información en un archivo de texto real en tu computadora, que podés abrir con el Bloc de notas y que persiste aunque apagues el programa.

Pensalo como escribir en un cuaderno: primero abrís el cuaderno (abrís el archivo), escribís (guardás datos), y cerrás el cuaderno (cerrás el archivo). Si alguien necesita leer lo que escribiste, vuelve a abrir el cuaderno y lee.

Pero a diferencia de escribir en papel, trabajar con archivos puede fallar: el archivo puede no existir, podría estar en uso por otro programa, o el disco podría estar lleno. Por eso se usa `try-catch`: un mecanismo para manejar esos errores sin que el programa se caiga.

---

### El bloque try-catch explicado

```java
try {
    // Código que PODRÍA fallar
    // Si algo sale mal aquí, Java salta directo al catch
} catch (IOException e) {
    // Qué hacer si algo falló
    // 'e' contiene la información del error
    System.out.println("Ocurrió un error: " + e.getMessage());
}
```

- `try` → "intentá ejecutar esto"
- `catch` → "si algo falla, agarrá el error y hacé esto"
- `IOException` → el tipo de error que pueden lanzar las operaciones con archivos (Input/Output Exception)
- `e.getMessage()` → devuelve un texto describiendo qué salió mal

---

### Ejemplo completo: escribir y leer un archivo

```java
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ManejoArchivos {

    // Método para escribir un archivo
    public static void escribirArchivo(String nombreArchivo) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivo))) {

            escritor.println("=== Registro de Notas ===");
            escritor.println("Ana García     | 92.5");
            escritor.println("Luis Torres    | 78.0");
            escritor.println("María López    | 85.3");

            System.out.println("Archivo creado: " + nombreArchivo);

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    // Método para leer un archivo
    public static void leerArchivo(String nombreArchivo) {
        System.out.println("--- Contenido del archivo ---");

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {

            String linea;
            int numeroLinea = 1;

            while ((linea = lector.readLine()) != null) {
                System.out.println(numeroLinea + ". " + linea);
                numeroLinea++;
            }

        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }

        System.out.println("--- Fin del archivo ---");
    }

    // Método para agregar contenido sin borrar lo que ya hay
    public static void agregarAlArchivo(String nombreArchivo, String contenido) {
        try (FileWriter escritor = new FileWriter(nombreArchivo, true)) {
            escritor.write(contenido + "\n");
            System.out.println("Línea agregada correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String archivo = "estudiantes.txt";

        escribirArchivo(archivo);
        leerArchivo(archivo);

        agregarAlArchivo(archivo, "Pedro Salas    | 88.0");

        System.out.println("\nArchivo actualizado:");
        leerArchivo(archivo);
    }
}
```

### Explicación línea por línea

```
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
```
Importamos las herramientas necesarias para trabajar con archivos. Cada una tiene un rol específico: `FileWriter` abre el archivo para escribir, `PrintWriter` facilita escribir con formato, `FileReader` abre el archivo para leer, `BufferedReader` lee eficientemente línea por línea, `IOException` es el tipo de error que pueden lanzar estas operaciones.

```
try (PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivo))) {
```
Esto es `try-with-resources`: al poner la creación del archivo dentro del paréntesis del `try`, Java lo cierra automáticamente cuando termina el bloque, aunque haya un error. No hay que acordarse de cerrarlo manualmente.

```
escritor.println("Ana García     | 92.5");
```
Escribe una línea de texto en el archivo, igual que `System.out.println` pero en lugar de imprimir en pantalla, escribe en el archivo.

```
try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
```
Abre el archivo para leer. `BufferedReader` es más eficiente para leer líneas de texto que leer carácter por carácter.

```
while ((linea = lector.readLine()) != null) {
```
`readLine()` lee una línea del archivo y la guarda en `linea`. Cuando llega al final del archivo, devuelve `null`. Entonces el ciclo continúa mientras haya líneas por leer.

```
new FileWriter(nombreArchivo, true)
```
El segundo parámetro `true` activa el **modo append** (agregar). Sin ese `true`, el archivo se sobreescribe desde cero cada vez. Con `true`, el contenido nuevo se agrega al final del archivo existente.

#### Salida en pantalla

```
Archivo creado: estudiantes.txt
--- Contenido del archivo ---
1. === Registro de Notas ===
2. Ana García     | 92.5
3. Luis Torres    | 78.0
4. María López    | 85.3
--- Fin del archivo ---
Línea agregada correctamente.

Archivo actualizado:
--- Contenido del archivo ---
1. === Registro de Notas ===
2. Ana García     | 92.5
3. Luis Torres    | 78.0
4. María López    | 85.3
5. Pedro Salas    | 88.0
--- Fin del archivo ---
```

> El archivo `estudiantes.txt` se crea en la misma carpeta desde donde ejecutás el programa. Podés abrirlo con el Bloc de notas para verificar su contenido.

---

### Error común: intentar leer un archivo que no existe

```java
// Si el archivo "datos.txt" no existe, esto lanza una excepción
try (BufferedReader lector = new BufferedReader(new FileReader("datos.txt"))) {
    // ...
} catch (IOException e) {
    // Sin el catch, el programa se caería con un error feo
    System.out.println("El archivo no fue encontrado: " + e.getMessage());
}
```

Siempre usá `try-catch` al trabajar con archivos. Nunca asumas que el archivo existe o que tenés permisos para escribirlo.

[Ver código completo en GitHub](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/ManejoArchivos.java)

---

## Cómo compilar y ejecutar el proyecto

Esta sección explica cómo hacer funcionar el código en tu computadora desde cero.

### Paso 1: instalar Java

Necesitás el **JDK** (Java Development Kit) — es el paquete que incluye todo lo necesario para escribir y ejecutar programas Java.

1. Entrá a [adoptium.net](https://adoptium.net)
2. Descargá la versión más reciente para tu sistema operativo (Windows, Mac o Linux)
3. Instalalo como cualquier programa
4. Para verificar que quedó bien instalado, abrí la terminal y escribí:

```bash
java -version
```

Si ves algo como `openjdk version "21.0..."`, está todo bien.

---

### Paso 2: abrir la terminal

- **Windows:** presioná `Windows + R`, escribí `cmd` y presioná Enter
- **Mac:** buscá "Terminal" en Spotlight (`Cmd + Espacio`)
- **Linux:** `Ctrl + Alt + T`

---

### Paso 3: navegar hasta la carpeta del proyecto

La terminal empieza en tu carpeta personal. Tenés que moverte hasta donde está el proyecto. El comando `cd` (change directory) te mueve entre carpetas:

```bash
# Ejemplo: si descargaste el proyecto en Escritorio/java-tutorial
cd Escritorio/java-tutorial
```

Para ver qué archivos hay en la carpeta actual:
```bash
# En Windows
dir

# En Mac o Linux
ls
```

---

### Paso 4: compilar los archivos Java

**Compilar** significa traducir el código que escribiste (que los humanos leen) a un formato que la computadora puede ejecutar. El compilador de Java se llama `javac`.

```bash
# Compilar todos los archivos de la carpeta src/ y guardar los compilados en out/
javac src/*.java -d out/
```

Si hay errores de sintaxis en el código, `javac` te los muestra aquí. Si no aparece ningún mensaje, la compilación fue exitosa.

---

### Paso 5: ejecutar el programa

```bash
# Ejecutar una clase específica (ejemplo: Ciclos)
java -cp out Ciclos

# Ejecutar otra clase
java -cp out Metodos
java -cp out VectoresMatrices
java -cp out Listas
java -cp out ManejoArchivos

# Ejecutar la demo completa
java -cp out Main
```

Desglose del comando:
- `java` → ejecuta el programa
- `-cp out` → le dice a Java que busque los archivos compilados en la carpeta `out/`
- `Ciclos` → el nombre de la clase que querés ejecutar (sin extensión)

---

### Resumen rápido de los comandos

```bash
# 1. Entrar a la carpeta del proyecto
cd ruta/del/proyecto

# 2. Compilar
javac src/*.java -d out/

# 3. Ejecutar
java -cp out NombreClase
```

Si en algún momento ves el error `'javac' is not recognized` en Windows, significa que el JDK no quedó en el PATH del sistema. La solución más simple es reinstalar el JDK y marcar la opción "Add to PATH" durante la instalación.

---

*Tutorial de Java — Fundamentos de Programación · Primer Semestre · Ingeniería en TI*
*Repositorio: [github.com/AlejandroMarino2007/tutorial-para-aprender-programacion](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion)*

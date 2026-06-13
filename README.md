# Tutorial de Java — Fundamentos de Programación

Armé este repositorio como material de estudio para el supletorio. Los ejemplos los fui probando en mi computadora (JDK 21 en Windows), así que si algo no compila en una versión anterior puede ser por alguna sintaxis menor. Cualquier duda se puede abrir un Issue.

---

## Contenido

| Tema | Archivo |
|------|---------|
| [1. Ciclos](#1-ciclos) | `Ciclos.java` |
| [2. Métodos](#2-métodos) | `Metodos.java` |
| [3. Vectores y Matrices](#3-vectores-y-matrices) | `VectoresMatrices.java` |
| [4. Listas](#4-listas) | `Listas.java` |
| [5. Manejo de archivos](#5-manejo-de-archivos) | `ManejoArchivos.java` |

Para compilar y probar cualquier ejemplo:

```bash
javac src/Ciclos.java -d out/
java -cp out Ciclos
```

O si quieres ver todo junto:

```bash
javac src/*.java -d out/
java -cp out Main
```

Necesitas tener instalado el JDK. Lo descargué de [adoptium.net](https://adoptium.net) que es gratis y open source.

---

## 1. Ciclos

Los ciclos sirven para repetir instrucciones. La diferencia principal entre `for` y `while` es que el `for` se usa cuando ya sabes cuántas repeticiones necesitas, y el `while` cuando dependes de una condición que puede cambiar durante la ejecución.

El error más común al empezar es olvidarse de modificar la variable dentro del `while` y hacer un bucle infinito. Me pasó varias veces.

```java
// for: recorre del 1 al 10 incrementando i en cada vuelta
for (int i = 1; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}

// while: repite mientras contador sea mayor o igual a 1
int contador = 5;
while (contador >= 1) {
    System.out.println("Cuenta: " + contador);
    contador--; // si se te olvida esta línea, el programa nunca para
}
```

Lo que imprime en consola:

```
=== Tabla de multiplicar del 5 (for) ===
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50

=== Cuenta regresiva desde 5 (while) ===
Cuenta: 5
Cuenta: 4
Cuenta: 3
Cuenta: 2
Cuenta: 1
¡Despegue!

Suma del 1 al 10 = 55
```

[Código completo → src/Ciclos.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Ciclos.java#L1-L60)

---

## 2. Métodos

Un método es básicamente ponerle nombre a un bloque de código para poder reutilizarlo. En lugar de escribir la misma lógica tres veces en lugares distintos, la escribís una sola vez en un método y la llamás cuando la necesitás.

En Java los métodos de práctica de primer semestre casi siempre llevan `static` porque así los podés llamar directamente desde el `main` sin necesitar crear objetos.

```java
// Este método recibe dos números y devuelve el área
public static double calcularArea(double base, double altura) {
    return base * altura;
}

// Lo usás así — el resultado queda guardado en "resultado"
double resultado = calcularArea(8.5, 3.0);
System.out.println("Área: " + resultado);
```

La diferencia entre `void` y un tipo de dato en el retorno: si el método dice `void` no devuelve nada (solo hace algo), si dice `double` o `int` o `boolean` sí devuelve un valor que podés guardar en una variable.

Salida:

```
¡Bienvenido al tutorial de Java!
Hola, Hernan! Que tengas un buen día.
Área del rectángulo: 25.5 m²
14 es par.
--- Tabla del 7 ---
7 x 1 = 7
...
7 x 10 = 70
```

[Código completo → src/Metodos.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Metodos.java#L1-L85)

---

## 3. Vectores y Matrices

Un vector es una lista de valores del mismo tipo guardados en una sola variable. Una matriz es lo mismo pero en dos dimensiones (filas y columnas). El índice siempre empieza en 0, eso confunde bastante al principio.

```java
// Vector de 5 calificaciones
double[] calificaciones = {85.5, 92.0, 78.3, 95.1, 60.7};

// Para recorrerlo:
for (int i = 0; i < calificaciones.length; i++) {
    System.out.println("Estudiante " + (i+1) + ": " + calificaciones[i]);
}
```

Para matrices, necesitás dos ciclos anidados: el de afuera controla la fila y el de adentro la columna. Al principio parece raro pero después se vuelve mecánico.

```java
int[][] tabla = new int[3][3];

for (int f = 0; f < 3; f++) {
    for (int c = 0; c < 3; c++) {
        tabla[f][c] = (f + 1) * (c + 1);
        System.out.printf("%-4d", tabla[f][c]);
    }
    System.out.println();
}
```

Salida:

```
Estudiante 1: 85.5
Estudiante 2: 92.0
...
Promedio del grupo: 82.32

Matriz 3x3:
1   2   3   
2   4   6   
3   6   9   
```

[Código completo → src/VectoresMatrices.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/VectoresMatrices.java#L1-L75)

---

## 4. Listas

La diferencia práctica entre un arreglo y un ArrayList: el arreglo tiene tamaño fijo (lo definís cuando lo creás y ya no cambia), el ArrayList crece y se achica solo según lo que le vayas agregando o quitando.

| | Arreglo `String[]` | ArrayList `<String>` |
|---|---|---|
| Tamaño | Fijo | Dinámico |
| Leer elemento | `arr[0]` | `lista.get(0)` |
| Agregar | No se puede | `lista.add("algo")` |
| Eliminar | No se puede | `lista.remove("algo")` |

```java
ArrayList<String> materias = new ArrayList<>();

materias.add("Matemáticas");
materias.add("Física");
materias.add("Programación");

System.out.println(materias);         // [Matemáticas, Física, Programación]
System.out.println(materias.size());  // 3
materias.remove("Física");
System.out.println(materias);         // [Matemáticas, Programación]
```

Salida del ejercicio completo:

```
Lista inicial: [Manzana, Banano, Mango, Piña]
Cantidad de frutas: 4
Después de eliminar 'Banano': [Manzana, Mango, Piña]
¿Existe 'Mango'? true
Pares hasta 20: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
```

[Código completo → src/Listas.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/Listas.java#L1-L80)

---

## 5. Manejo de archivos

Para leer y escribir archivos en Java se usan clases del paquete `java.io`. Lo importante es siempre envolver el código en un bloque `try-catch` porque si el archivo no existe o hay un problema de permisos, el programa lanza una excepción y se cae.

La forma más cómoda es `try-with-resources`: el archivo se cierra automáticamente cuando termina el bloque, no hay que acordarse de cerrarlo a mano.

```java
// Escribir
try (PrintWriter pw = new PrintWriter(new FileWriter("notas.txt"))) {
    pw.println("Ana García | 92.5");
    pw.println("Luis Torres | 78.0");
} catch (IOException e) {
    System.out.println("No se pudo escribir: " + e.getMessage());
}

// Leer línea por línea
try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {
    String linea;
    while ((linea = br.readLine()) != null) {
        System.out.println(linea);
    }
} catch (IOException e) {
    System.out.println("No se pudo leer: " + e.getMessage());
}
```

El archivo se crea en la misma carpeta desde donde ejecutás el programa. Si no aparece, revisá en qué directorio estás parado en la terminal.

Salida:

```
Archivo escrito: estudiantes.txt
--- Contenido ---
1. Ana García           | 92.5
2. Luis Torres          | 78.0
3. María López          | 85.3
Línea agregada correctamente.
```

[Código completo → src/ManejoArchivos.java](https://github.com/AlejandroMarino2007/tutorial-para-aprender-programacion/blob/main/src/ManejoArchivos.java#L1-L100)

---

## Estructura del repo

```
java-tutorial-ti/
├── README.md
├── src/
│   ├── Main.java               ← ejecuta todos los temas juntos
│   ├── Ciclos.java
│   ├── Metodos.java
│   ├── VectoresMatrices.java
│   ├── Listas.java
│   └── ManejoArchivos.java
└── out/                        ← carpeta de .class, no subir a git
```

Podés compilar cada clase por separado para probar un solo tema, o usar `Main.java` para ver todo de corrido.

---

*Tarea opcional para examen supletorio — Fundamentos de Programación, primer semestre ITI*

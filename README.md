<div align="center">

<br>

### `6 misiones · 2 partes · 1 exploradora.`

<br>

![Java](https://img.shields.io/badge/JAVA-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white&labelColor=555555)
![Paquete](https://img.shields.io/badge/PAQUETE-JAVA.UTIL-2F4B9A?style=for-the-badge&labelColor=555555)
![UTA](https://img.shields.io/badge/UTA-INGENIER%C3%8DA%20EN%20SOFTWARE-A51C30?style=for-the-badge&labelColor=555555)
![Semestre](https://img.shields.io/badge/PRIMER%20SEMESTRE-PARALELO%20B-1F3A78?style=for-the-badge&labelColor=555555)
![Ejercicios](https://img.shields.io/badge/EJERCICIOS-6%2F6-2EA44F?style=for-the-badge&labelColor=555555)

<br>

**SW-AyLP-APE-06 · Algoritmos y Lógica de Programación · Ciclo julio – diciembre 2026**

</div>

---

## 🎯 La misión

Aprender a manejar **arreglos** (`int[]`, `double[]`, `String[]`) para almacenar y procesar muchos datos con un solo nombre de variable: recorrerlos, filtrarlos, buscar valores, trabajar con **arreglos paralelos** y apoyarse en la clase `java.util.Arrays`.

La guía se divide en dos partes:

- **Primera parte:** recorrido de arreglos, sumas condicionadas, promedios y validación de datos.
- **Segunda parte (Día 2 · Grupo 6):** búsqueda y conteo, máximo y mínimo con arreglos paralelos y métodos de `Arrays`.

---

## 🗺️ Las misiones

| # | Misión | Parte | Clase | Concepto clave |
|:-:|--------|:-----:|-------|----------------|
| 1 | Control de gastos semanales y ajuste por inflación | 1 | [`Ejercicio1_GastosSemanales`](src/Ejercicio1_GastosSemanales.java) | `double[]`, acumulador, recorrido inverso |
| 2 | Filtro y suma condicionada de producción | 1 | [`Ejercicio2_ProduccionPiezas`](src/Ejercicio2_ProduccionPiezas.java) | índices pares, condiciones combinadas |
| 3 | Análisis de asistencia y rendimiento | 1 | [`Ejercicio3_AsistenciaRendimiento`](src/Ejercicio3_AsistenciaRendimiento.java) | validación con `do-while`, división entera |
| 4 | Búsqueda y conteo | 2 | [`Ejercicio4_BusquedaConteo`](src/Ejercicio4_BusquedaConteo.java) | contador, `posicion = -1` |
| 5 | Máximo y mínimo con arreglos paralelos | 2 | [`Ejercicio5_MaxMinParalelos`](src/Ejercicio5_MaxMinParalelos.java) | `posMax`, `posMin`, arreglos paralelos |
| 6 | Integrador con `java.util.Arrays` | 2 | [`Ejercicio6_IntegradorArrays`](src/Ejercicio6_IntegradorArrays.java) | `copyOf`, `sort`, `toString`, `binarySearch` |

---

## 📁 Estructura del proyecto

````text
APE6/
├── assets/
│   └── banner.svg
├── src/
│   ├── Ejercicio1_GastosSemanales.java
│   ├── Ejercicio2_ProduccionPiezas.java
│   ├── Ejercicio3_AsistenciaRendimiento.java
│   ├── Ejercicio4_BusquedaConteo.java
│   ├── Ejercicio5_MaxMinParalelos.java
│   └── Ejercicio6_IntegradorArrays.java
└── README.md
````

---

## ▶️ Cómo ejecutarlo

Requiere **JDK 21** (o superior).

````bash
# Compilar todo
javac -d out src/*.java

# Ejecutar una misión
java -cp out Ejercicio1_GastosSemanales
````

También se puede ejecutar desde **VS Code** con el botón ▶ *Run* de cada clase.

---

## 🧪 Ejemplos de ejecución

<details>
<summary><b>Misión 1 · Gastos semanales</b></summary>

````text
Gasto del dia 1: $10
Gasto del dia 2: $20
Gasto del dia 3: $30
Gasto del dia 4: $15
Gasto del dia 5: $25
Gasto del dia 6: $40
Gasto del dia 7: $5

Gasto total: $145.00
Promedio diario: $20.71

Arreglo actualizado (orden inverso):
Dia 7: $5.00
Dia 6: $44.00
Dia 5: $27.50
Dia 4: $15.00
Dia 3: $33.00
Dia 2: $20.00
Dia 1: $10.00

Dias que sufrieron el incremento del 10%: 3
````

</details>

<details>
<summary><b>Misión 2 · Producción de piezas</b></summary>

````text
Suma de piezas en indices pares: 59
Turnos con cantidad impar y mayor a 15: 2
Promedio general de produccion: 11.60
````

</details>

<details>
<summary><b>Misión 3 · Asistencia y rendimiento</b></summary>

````text
Promedio general del curso: 13.60
Estudiantes aprobados (>= 14): 3
Estudiantes reprobados: 2

Estudiantes con nota por debajo del promedio:
Estudiante 2 (nota 12)
Estudiante 4 (nota 9)
````

</details>

<details>
<summary><b>Misión 4 · Búsqueda y conteo</b></summary>

````text
Ingrese el numero a buscar: 7
El numero 7 aparece 2 vez/veces.
Primera posicion: 1

Ingrese el numero a buscar: 99
No existe
````

</details>

<details>
<summary><b>Misión 5 · Máximo y mínimo con arreglos paralelos</b></summary>

````text
Nota mas alta: Marta con 18
Nota mas baja: Luis con 8
Promedio: 13.00
````

</details>

<details>
<summary><b>Misión 6 · Integrador con Arrays</b></summary>

````text
Original: [14, 7, 25, 3, 18]
Copia ordenada: [3, 7, 14, 18, 25]
Segundo numero mayor: 18
Posicion del 14 en la copia: 2
````

</details>

---

## 🧠 Lo que se aprendió

- Un arreglo guarda varios datos del mismo tipo y sus posiciones empiezan en **0**.
- Para promediar sin perder decimales hay que convertir a `double` **antes** de dividir.
- Los arreglos paralelos comparten la misma posición: `nombres[i]` va con `notas[i]`.
- `Arrays.copyOf` crea una copia **independiente**; ordenar la copia no altera el original.
- `Arrays.binarySearch` solo funciona sobre arreglos **ya ordenados**.

---

## 👩‍💻 Créditos

| | |
|---|---|
| **Estudiante** | Joselyn Maribel Guaman Sagñay |
| **Docente** | Ing. José Rubén Caiza Caizabuano |
| **Carrera** | Ingeniería en Software · Primer semestre · Paralelo B |
| **Universidad** | Universidad Técnica de Ambato (UTA) |

<div align="center">

<sub>SW-AyLP-APE-06 · Arreglos y Listas · Hecho con ☕ y Java</sub>

</div>
````
````

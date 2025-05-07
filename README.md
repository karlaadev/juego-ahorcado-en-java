# Juego del Ahorcado en Java

## Descripción

Este proyecto es una implementación simple del clásico juego del Ahorcado en Java. El juego selecciona aleatoriamente una palabra relacionada con la programación de una lista predefinida, y el jugador debe adivinarla letra por letra antes de agotar sus intentos.

## Características

-   Selección aleatoria de palabras de una lista predefinida
-   10 intentos para adivinar la palabra completa
-   Muestra el progreso de las letras adivinadas
-   Indica el número de intentos restantes
-   Interfaz por consola sencilla y fácil de usar

## Requisitos

-   Java JDK 8 o superior
-   Cualquier entorno de desarrollo Java (Eclipse, IntelliJ IDEA, etc.) o compilador Java

## Instrucciones de uso

1.  Compile el archivo `Ahorcado.java`
    
    ```
    javac Ahorcado.java
    ```
    
2.  Ejecute el programa
    
    ```
    java Ahorcado
    ```
    
3.  Siga las instrucciones en pantalla para jugar:
    -   El programa mostrará la palabra a adivinar representada con guiones bajos (_)
    -   Ingrese una letra y presione Enter
    -   Si la letra está en la palabra, se revelará su posición
    -   Si la letra no está en la palabra, perderá un intento
    -   El juego termina cuando adivine la palabra o agote todos sus intentos

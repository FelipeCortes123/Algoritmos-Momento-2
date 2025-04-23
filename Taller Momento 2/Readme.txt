Ejercicio 1: Temperaturas del mes
Descripción del problema: El programa debe solicitar al usuario ingresar las temperaturas máximas de cada uno de los 30 días del mes. Después, debe calcular la temperatura máxima, mínima, promedio y contar cuántos días superaron los 25 °C.

Estrategia de resolución:

Primero declaré un array de tipo double para almacenar las 30 temperaturas.

Usé un ciclo for para recorrer los 30 días y pedirle al usuario cada temperatura.

Declaré variables auxiliares: una para sumar las temperaturas (para luego sacar el promedio), otra para almacenar la temperatura máxima y una más para la mínima.

Inicialicé la temperatura máxima con Double.MIN_VALUE y la mínima con Double.MAX_VALUE para asegurarme de que se actualizaran correctamente con cualquier dato ingresado.

También usé un contador para contar los días con temperatura mayor a 25 grados.

Luego recorrí el arreglo con otro for para calcular el promedio, comparar máximos y mínimos y contar los días cálidos.

Finalmente imprimí todos los resultados.

Estructuras utilizadas:

Un array de tipo double para almacenar las temperaturas.

Un ciclo for para entrada y procesamiento de datos.

Condicionales if para comparar valores y contar días calurosos.

Ejercicio 2: Calificaciones de estudiantes
Descripción del problema: Crear un programa que permita registrar las calificaciones de tres exámenes para un número variable de estudiantes, calcular el promedio de cada estudiante y determinar cuántos aprobaron (promedio ≥ 6.0) y cuántos no.

Estrategia de resolución:

Primero pedí al usuario que ingresara cuántos estudiantes tiene la clase.

Usé una matriz (array bidimensional) de tipo double con filas igual al número de estudiantes y columnas igual a 3 (un examen por columna).

Utilicé un for anidado para llenar la matriz con las calificaciones.

Luego recorrí la matriz con otro ciclo para calcular el promedio de cada estudiante, el cual almacené en un arreglo unidimensional.

Usé una condicional if para determinar si cada promedio era mayor o igual a 6.0 y conté los aprobados y reprobados.

Finalmente mostré los promedios y el resultado total de aprobados y reprobados.

Estructuras utilizadas:

Una matriz double[][] para almacenar calificaciones.

Un arreglo double[] para guardar los promedios.

Ciclos anidados para llenar la matriz y calcular promedios.

Condicionales para determinar quién aprueba o reprueba.

Ejercicio 3: Puntuaciones de jugadores
Descripción del problema: Pedir al usuario las puntuaciones de 5 jugadores, almacenarlas en un arreglo, mostrar todas las puntuaciones y encontrar cuál fue la más alta.

Estrategia de resolución:

Declaré un arreglo de tipo int con tamaño 5 para guardar las puntuaciones.

Utilicé un ciclo for para pedir al usuario que ingresara las 5 puntuaciones.

Al mismo tiempo, comparé cada puntuación ingresada con una variable maximo que iba guardando la mayor puntuación encontrada.

Luego usé otro ciclo for para imprimir todas las puntuaciones con el número del jugador correspondiente.

Finalmente mostré la puntuación más alta.

Estructuras utilizadas:

Un arreglo de tipo int[] para almacenar las puntuaciones.

Un ciclo for para entrada de datos.

Otro ciclo for para mostrar los resultados.

Un if para encontrar la puntuación más alta.
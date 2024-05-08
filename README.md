https://github.com/NicolodeL/Finalfinalclase.git
# Ej1
## 1.1 
b
## 1.2
b
## 1.3
b
## 1.4
b
## 1.5
a
# Ej2
## 2.2
Una de las principales diferencias de estas tablas son como almacenan los elementos, mientras la tabla árbol los matiene ordenados por jerarquía la tabla Hash mantiene sus elemento de manera desorganizada. Otra diferencia es la manera de encontrar los elementos una utiliza una función para calcular un indice en el que buscará un elemento especifico, mientras que la otra buscará por un cojunto de nodos conectados segun una jeraquía.
La tabla hash es más recomendable para guardar elementos como mucha información de forma desorganizada como por ejemplo un cache ya que este no tiene que seguir un orden concreto en cuanto al almacenamiento de datos, por las misma razón sería util para la creacion de bases de datos. Por otro lado la tabla árbol son más utiles cuando tiene que haber un orden presente como en los sistemas de archivos.
## 2.3
La principal diferencia ente una pila y una cola es el orden en el que eliminan los archivos y las posiciones en la que los insertan, el último elemento que se añade a la pila es el primero en ser eliminado mientras que el primer elemento que se añade a la cola es el primero en ser eliminado, cada una inserta los archivos en el lado contrario a la otra, la pila los inserta de primeros y la cola de ultimos. La cola es recomendable usarla cuando es necesario guardar el orden en el que se fueron añadiendo los archivos, en cambio la pila puede servir a la hora de ver el funcionamiento de una funcion ya que la ultima función utilizada también será la primera en terminar.
## 2.4
El el método de inserción funciona comparando los elementos de una lista de datos, va comparando de dos en dos tomando como referencia el primero de los datos, si el con el que compara su dato de referencia es menor cambia los elementos y repite el proceso durante toda la lista, cuando llega al final repite nuevamente el proceso hasta que no produzca nuevos cambios.
El proceso de iteracion en 50 20 84 13 22 16 89 85 es el siguiente: primero toma el 50 como referencia y lo compara con el 20 al ser este menor los intercambia, ahora toma el 50 de referencia y lo compara cone el 84, al ser este mayor no lo cambio, sigue repitiendo este proceso hasta que la lista queda 20 50 13 22 16  84 85 89, y ahora vuelve a empezar el priceso quedando la lista al finalizar nuevamente este como 20 13 22 16 50 84 85 89, de nuevo repetiría el mismo proceso comparado los elementos e intercambiandolos hasta que la lista quedase asi: 13 16 20 22 50 84 85 89
## 2.5
Para calcular esto necesitamos resolver la siguiente operación: 1024n < 16n^3, su resultado es n > 8, lo que da a enterder que para n > 8, la función A es más eficiente que la función B.
# Ej3
## a)
El codigo no compila debido a que la función recursiva se llama a sí misma indefinidamente cuando b es negativo. La solucin pordría ser cambiar la linea numero 13 a else if (a == 0 || b < 0) ya que asi el codigo imprimira 0 y no tendra problemas porque b sea negativo ya que agregué una condicion para cuando lo sea.
## b)
El codigo esta calculando "a" elevado a la potencia de "b".
En cuanto a la recursividad empleada se utiliza la recursividad lineal.

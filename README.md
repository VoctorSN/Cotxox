StockX ASCII
============

StockX nació en Detroit, y allí siguen haciendo las cosas de manera tradicional, robustas y con alma, en ASCII en la CLI.

Implementa las historias de usuario de las GUI proporcionadas en la carpeta [historias de usuaria GUI](https://github.com/dfleta/stockx-ascii/tree/master/historias_de_usuaria_GUI), pero en ASCII.

![Interfaz de usuario](./historias_de_usuaria_GUI/US_01.jpg "GUI edu.badpals.stockx.Stockx")

La lógica tras cada historia de usuario está descrita en el `main` de la clase principal `edu.badpals.stockx.Stockx.java`. 

Si tienes dudas, puedes interactuar con la webapp based in London que sí que tiene (G)UI
[www.stockx.com](https://stockx.com/air-jordan-1-retro-high-dark-mocha)



 ## Salida de la aplicación

Intenta que la salida del programa por CLI sea lo más parecida posible a las imágenes que se proporcionan. Cada una de ellas se corresponde con una de las historias de usuario que se detallan en los epígrafes siguientes.

!["Historias de usuario"](./salida_CLI/ui_01.png "sneaker info ASCII CLI")

!["Historias de usuario"](./salida_CLI/ui_02.png "all bids and asks CLI")

!["Historias de usuario"](./salida_CLI/ui_03.png "sneaker max ask info CLI")

!["Historias de usuario"](./salida_CLI/ui_04.png "sneaker min bid info CLI")

!["Historias de usuario"](./salida_CLI/ui_05.png "All sales CLI")

!["Historias de usuario"](./salida_CLI/ui_06.png "sneaker info last sale CLI")

!["Historias de usuario"](./salida_CLI/ui_07.png "All sales, bids, min bid, max ask size 9.5 CLI")

!["Historias de usuario"](./salida_CLI/ui_08.png "sneaker info size 9.5 CLI")


## Diagrama de clases UML / Arquitectura de la app.

Sigue el diagrama de clase UML proporcionado para construir la aplicación.
Si añades algún componente, dibújalo a mano alzada sobre el diagrama.

!["Diagrama de clases UML"](./diagrama_clases_UML_inked.jpg)


## Historias de usuario /casos de uso

Las historias de usuario están enunciadas en el script principal `edu.badpals.stockx.Stockx.java`

1. El usuario/a solicita la info del `sneaker` en todas las tallas (ultima `sale`, máxima `bid`, mínima `ask`, `name` y estilo o `style`)

!["Historias de usuario"](./historias_de_usuaria_GUI/US_01.jpg "printar sneaker")

2. El usuario/a lista todas las bids de una sneaker para conocer cuál es la `minima bid`.

!["Historias de usuario"](./historias_de_usuaria_GUI/US_02.jpg "sneaker bids")

3. El usuario/a lista todas las asks de una sneaker para conocer cuál es la `maxima ask`.

!["Historias de usuario"](./historias_de_usuaria_GUI/US_03.jpg "sneaker asks")

4. El usuario/a lista todas las `sales` de una sneaker para averiguar cuál es la última venta o `last sale`.

!["Historias de usuario"](./historias_de_usuaria_GUI/US_04.jpg "sneaker sales")


5. El usuario/a solicita la info del sneaker en todas las tallas (ultima venta, máxima bid, mínima ask, nombre y estilo) = Historia de usuario 1.

6. El usuario/a lista la info del sneaker en una determinada talla o `size`.

!["Historias de usuario"](./historias_de_usuaria_GUI/US_05.jpg "sneaker info size 9.5")

7. El usuario/a lista todas las sales de una sneaker en una determinada talla o `size` para averiguar cuál es la última venta.

!["Historias de usuario"](./historias_de_usuaria_GUI/US_06.jpg "sneaker sales")

8. El usuario/a lista todas las bids de una sneaker en una determinada `size` para conocer cuál es la mínima bid.

!["Historias de usuario"](./historias_de_usuaria_GUI/US_07.jpg "sneaker bids")

9. El usuario/a lista todas las asks de una sneaker en un determinada `size` para conocer cuál es la máxima ask.

!["Historias de usuario"](./historias_de_usuaria_GUI/US_08.jpg "sneaker asks")

## Prepara el proyecto

 1. Crea un nuevo repo PRIVADO en tu cuenta en **Github** y compártelo con el usuario dfleta.
 2. Crea un nuevo directorio en tu equipo y **clona el repositorio** de Github.
 3. Abre VSCode /Eclipse /Netbeans /IntelIJ y **establece como workspace** el directorio que has clonado.
 4. Crea un proyecto **Gradle** o **Maven**.
 5. Pon el proyecto en seguimiento en **Git** y configura `.gitignore`.
 6. Copia y pega la función principal `edu.badpals.stockx.Stockx.java`. Utilízala como guía en el proceso TDD. **No puedes modificar su código**, pero sí puedes comentar aquellas partes que aun no hayas implementado.
 7. Completa las clases que aquí se indican **implementando los casos test que necesites**. Practica **TDD**.
 8. **Realiza `commits` como mínimo cada vez que termines una historia de usuario**. Sin commit periódicos, no corrijo el examen.


 ## Cómo entregar el código

 1. Crea un repo PRIVADO en tu GitHub y compártelo con el usuario dfleta.
 2. **Realiza commits periódicamente** mientras avanzas en el desarrollo de la aplicación. Sin commit periódicos, no corrijo el examen.
 3. Realiza un `push` al repo remoto en GitHub **SOLO cuando hayas terminado el proyecto**.
 3. Si quieres, si vas a dormir mejor, desde Eclipse /Netbeans /IntelIJ exporta el proyecto a un fichero. En VSCode, comprime en un ZIP la carpeta del proyecto. Envíame el archivo ZIP por correo electrónico. **No se admiten ficheros .rar**.



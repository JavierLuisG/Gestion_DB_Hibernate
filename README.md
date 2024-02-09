![Estado del Proyecto](https://img.shields.io/badge/Proyecto%20en%20curso-Brightgreen)

## Proyecto con Hibernate en Eclipse - Gestión de Base de Datos

### Descripción
Este proyecto consiste en una aplicación que utiliza Hibernate para la gestión de una base de datos. 
Se implementan operaciones de persistencia utilizando HQL (Hibernate Query Language) para eliminar y actualizar datos, así como métodos para obtener y crear registros.

### Características
- Utilización de Hibernate para la gestión de la base de datos.
- Implementación de operaciones de persistencia utilizando HQL.
- Creación de métodos para eliminar, actualizar, obtener y crear registros en la base de datos.
- Uso de anotaciones para mapear las variables de la clase con las columnas de la base de datos.
- Incorporación de archivo de configuración de Hibernate.
- Integración de librerías de Hibernate y mysql-connector.

### Tecnologías Utilizadas
- Java: Lenguaje de programación principal utilizado en el desarrollo del proyecto.
- Hibernate: Framework de mapeo objeto-relacional para el manejo de la persistencia en la base de datos.
- MySQL: Sistema de gestión de bases de datos relacional utilizado para almacenar datos.
- MySQL Workbench: Herramienta utilizada para el diseño y administración de la base de datos MySQL.

### Instalación
Para ejecutar este proyecto, sigue estos pasos:
1. Asegúrate de tener Java instalado en tu máquina. Puedes descargar la última versión de [Java SE](https://www.oracle.com/co/java/technologies/downloads/#java17).
2. Descarga este proyecto clonándolo en un directorio existente o descárgalo como ZIP y descomprime el archivo ZIP si es necesario.
3. Abre tu IDE Eclipse y carga el proyecto.
4. Descargar el hibernate 5.6.5 que contiene las librerias necesarias [aquí](https://sourceforge.net/projects/hibernate/files/hibernate-orm/5.6.5.Final/hibernate-release-5.6.5.Final.zip/download).
5. Incorpora el archivo hibernate.cfg.xml que encontraras en el archivo de hibernatte.
6. Descarga el conector MySQL JDBC desde [aquí](https://dev.mysql.com/downloads/connector/j/).
7. Instala y configura MySQL, un sistema de gestión de bases de datos relacional. Puedes descargar MySQL desde [aquí](https://dev.mysql.com/downloads/file/?id=526408).
8. Instala y configura MySQL Workbench, una herramienta de diseño de bases de datos y administración para MySQL. Puedes descargar MySQL Workbench desde [aquí](https://dev.mysql.com/downloads/workbench/).

### Uso
1. Ejecuta la aplicación desde tu IDE Eclipse. Asegúrate de tenerlo configurado con una version igual o superior a JDK 17.
2. Ejecuta MySQL Workbench donde podras gestionar la base de datos. Ejecuta los comandos que se encuentran en el archivo hlf en el paquete database.

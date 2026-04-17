NTT DATA E2E TEST
=================

TECNOLOGÍAS
-----------
Java             1.8 (JDK 8)
Maven            3.9.1
SerenityBDD      3.9.8
Cucumber         7.14.0
JUnit            4.13.2
WebDriverManager 5.6.3
Google Chrome    última versión estable

PRERREQUISITOS
--------------
- Java JDK 1.8 instalado con JAVA_HOME configurado
- Maven 3.9.1 instalado con MAVEN_HOME y %MAVEN_HOME%\bin en el PATH
- Google Chrome instalado (ChromeDriver se descarga automáticamente)

EJECUCIÓN
---------
Desde la raíz del proyecto:

    mvn clean verify

REPORTES
--------
Cucumber JSON : target/cucumber-reports/cucumber.json
Serenity HTML : target/site/serenity/index.html

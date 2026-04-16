# NTT Data E2E Test

Proyecto de automatización de pruebas end-to-end utilizando **SerenityBDD** con el patrón **ScreenPlay** y **Cucumber BDD**.

## Descripción

Este proyecto automatiza el flujo completo de compra en [SauceDemo](https://www.saucedemo.com/), incluyendo:

- Login con credenciales de usuario
- Agregar dos productos al carrito
- Visualizar el carrito
- Completar el formulario de compra (nombre, apellido, código postal)
- Verificar el mensaje de confirmación: **"THANK YOU FOR YOUR ORDER"**

## Tecnologías utilizadas

| Tecnología       | Versión                        |
| ---------------- | ------------------------------ |
| Java             | 1.8 (JDK 8)                    |
| Maven            | 3.9.1                          |
| SerenityBDD      | 3.9.8                          |
| Cucumber         | 7.14.0                         |
| JUnit            | 4.13.2                         |
| WebDriverManager | 5.6.3                          |
| Navegador        | Google Chrome (última versión) |

## Prerrequisitos

Antes de ejecutar el proyecto, asegurarse de tener instalado:

1. **Java JDK 1.8** — con la variable de entorno `JAVA_HOME` configurada
2. **Maven 3.9.1** — con la variable de entorno `MAVEN_HOME` y `%MAVEN_HOME%\bin` en el `PATH`
3. **Google Chrome** — última versión estable

> **Nota:** No es necesario instalar ChromeDriver manualmente. WebDriverManager lo descarga y configura automáticamente.

## Cómo ejecutar los tests

Desde la raíz del proyecto, ejecutar:

```bash
mvn clean verify
```

Este comando:

1. Limpia los artefactos anteriores (`clean`)
2. Compila el proyecto
3. Ejecuta todos los tests E2E en Chrome
4. Genera los reportes de Cucumber

## Reportes generados

Luego de ejecutar `mvn clean verify`, los reportes se encuentran en:

| Reporte                | Ubicación                                            | Descripción                              |
| ---------------------- | ---------------------------------------------------- | ---------------------------------------- |
| Cucumber JSON          | `target/cucumber-reports/cucumber.json`              | Datos raw del resultado                  |
| Cucumber HTML          | `target/cucumber-reports/cucumber.html`              | Reporte HTML estándar                    |
| Cucumber HTML mejorado | `target/cucumber-html-reports/feature-overview.html` | Reporte HTML con estadísticas detalladas |

Para abrir el reporte HTML mejorado, navegar a la carpeta `target/cucumber-html-reports/` y abrir el archivo `feature-overview.html` en el navegador.

## Estructura del proyecto

```
src/
└── test/
    ├── java/com/nttdata/e2e/
    │   ├── screenplay/
    │   │   ├── tasks/          # Tareas de alto nivel (Login, AddToCart, etc.)
    │   │   ├── actions/        # Interacciones UI de bajo nivel
    │   │   ├── questions/      # Clases de aserción
    │   │   ├── pages/          # Definiciones de localizadores (Targets)
    │   │   └── model/          # Clases de dominio (User, Product, BuyerInfo)
    │   ├── stepdefinitions/    # Step definitions de Cucumber
    │   ├── runners/            # Runner de JUnit + Cucumber
    │   └── testdata/           # Utilidades para leer datos de prueba
    └── resources/
        ├── features/           # Archivos .feature de Gherkin
        ├── testdata/           # Archivos JSON con datos de prueba
        └── serenity.conf       # Configuración de SerenityBDD
```

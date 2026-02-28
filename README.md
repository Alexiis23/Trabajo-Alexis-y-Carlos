# Trabajo grupal — Refactorización y Control de Versiones (DAW)

## Integrantes
Alexis
 Carlos

## Proyecto
Proyecto Java sencillo con clases Employee y Manager para practicar refactorización y flujo Git (ramas, PR y revisión).

## Estructura del repositorio
  src/entornos_trabajo/ → código fuente
  MEMORIA.md→ documentación del trabajo y evidencias
  gitignore → exclusión de binarios/archivos del IDE
  docs/capturas/ → capturas usadas en la memoria (si aplica)

## Flujo de trabajo Git utilizado
  Rama principal: master (protegida)
  Rama de integración: develop
  Ramas de trabajo: feature/*
  Integración mediante Pull Request hacia develop con revisión del compañero

## Refactorizaciones aplicadas
**Encapsulate Field**
Se cambiaron atributos públicos a privados en Employee y se añadieron getters/setters.
**Replace duplication with inheritance**
Manager pasa a heredar de Employee y elimina duplicación de campos comunes.
**Replace print with return value**
calcularSalarioAnual() deja de imprimir y devuelve un double.

## Cómo ejecutar
1. Importar el proyecto en Eclipse como “Existing project”.
2. Ejecutar desde Eclipse (o compilar con javac) según configuración del proyecto.

## Documentación JavaDoc
Se añadió JavaDoc a clases y métodos principales (ver sección 4 de MEMORIA.md).

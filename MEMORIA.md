# MEMORIA — Trabajo Grupal (Refactorización + Git)

## 0. Datos del equipo
- Integrantes: Alexis y Carlos
- Repositorio: https://github.com/Alexiis23/Trabajo-Alexis-y-Carlos.git
- Rama principal: `master`
- Rama de integración: `develop`
---

## 1. Configuración del repositorio (Tarea 1)

### 1.1 Creación del repositorio
Se creó un repositorio en GitHub y se subió el código inicial del proyecto.

- Captura del repo recién creado.
<img width="662" height="337" alt="image" src="https://github.com/user-attachments/assets/2de28a7e-cfb8-49ae-a1ac-48e40285b002" />



### 1.2 Estructura de ramas
Se definió:
- `master` (principal y protegida)
- `develop` (integración)
- `feature/*` (una por cada refactorización)

- Captura del listado de ramas.

<img width="1400" height="540" alt="image" src="https://github.com/user-attachments/assets/482fe300-4c21-4386-a322-387cba93c5a1" />
<img width="1421" height="375" alt="image" src="https://github.com/user-attachments/assets/b0df8b30-3c36-46a3-a70c-4951f2b02006" />



### 1.3 Protección de `master`
Se configuró protección en `master` para obligar Pull Request y evitar commits directos.

- Captura de la regla de protección.

<img width="574" height="306" alt="image" src="https://github.com/user-attachments/assets/f86cafda-ce5d-4c2a-92a1-03064e9dd31f" />


### 1.4 Colaboradores
Se añadieron los miembros del grupo como colaboradores del repositorio.


- Captura del apartado “Collaborators".

<img width="1341" height="726" alt="image" src="https://github.com/user-attachments/assets/fc6ef05e-dc82-4a92-a7e5-2480bf3406df" />


### 1.5 Flujo Git
Para cada refactor:
1. Se crea rama `feature/*` desde `develop`
2. Se implementa la refactorización
3. Commit atómico
4. Push
5. Pull Request hacia `develop`
6. Revisión del compañero con comentarios
7. Merge a `develop`

- Captura de una PR con comentario.

<img width="563" height="602" alt="image" src="https://github.com/user-attachments/assets/d6caab44-a3b2-41c6-8d6a-4e473c67bd8a" />

---

## 2. Identificación de problemas (Tarea 2)

### Problema 1: Campos públicos
Los atributos eran públicos, rompiendo la encapsulación.
**Refactor propuesto:** Encapsulate Field.

### Problema 2: Duplicación en Manager
`Manager` duplicaba campos ya presentes en `Employee`.
**Refactor propuesto:** Replace duplication with inheritance.

### Problema 3: Método imprime resultados
`calcularSalarioAnual()` imprimía por consola, mezclando lógica con salida.
**Refactor propuesto:** Replace print with return value.

---

## 3. Implementación (Tarea 3)

### Refactorización 1 — Encapsulate Field
se cambiaron atributos a `private` y se añadieron getters/setters (y constructor).
mejora encapsulación.


- Código antes/después.

<img width="1511" height="778" alt="image" src="https://github.com/user-attachments/assets/98c1dd7f-e4cc-4b60-99d6-cf104e71b887" />
<img width="1513" height="713" alt="image" src="https://github.com/user-attachments/assets/fad24b82-8662-46d8-9a7f-067204f91c6b" />
<img width="1507" height="745" alt="image" src="https://github.com/user-attachments/assets/5f194a36-60f5-4c1d-a6f9-58e0a6092e1b" />
<img width="1503" height="729" alt="image" src="https://github.com/user-attachments/assets/43910e1f-21e9-4c9a-944a-d12f0f3c0428" />


### 3.2 Refactorización 2 — Herencia para eliminar duplicación
`Manager` ahora `extends Employee` y conserva solo `empleadosACargo`.
 menos duplicación y mejor estructura.


- Código antes/después.
  
<img width="1503" height="795" alt="image" src="https://github.com/user-attachments/assets/e12e2079-adac-4b5d-b1c2-1a2b8c401ca7" />
<img width="1503" height="781" alt="image" src="https://github.com/user-attachments/assets/cdfbf04c-8e40-463f-8df5-193f12d6d129" />


### 3.3 Refactorización 3 — Devolver valor en lugar de imprimir
`calcularSalarioAnual()` pasa de `void` con `println` a `double` con `return`.
lógica separada de la salida y mejor reutilización.

- Código antes/después.

<img width="1533" height="378" alt="image" src="https://github.com/user-attachments/assets/c6bd78de-6244-4fc7-ae05-d85fb6e321ef" />
<img width="1508" height="763" alt="image" src="https://github.com/user-attachments/assets/d2476054-f227-4978-a9ff-e620317fe194" />
<img width="1505" height="758" alt="image" src="https://github.com/user-attachments/assets/ce66e530-026b-4cb4-a000-db34699e1183" />


---

## 4. JavaDoc y documentación (Tarea 4)
Se añadió JavaDoc a clases y métodos principales para describir su propósito y parámetros.
Se generó documentación HTML desde el IDE.


- Captura del código con JavaDoc.

<img width="504" height="195" alt="image" src="https://github.com/user-attachments/assets/81b20043-425e-47e4-8640-ad7ef586d75a" />

---

## 5. Reparto del trabajo

Alexis Refactor 1 + PR/revisión
Carlos Refactor 2 y 3 + PR/revisión
Ambos Configuración Git + Memoria + JavaDoc

---

## 6. Conclusiones
Se aplicó un flujo Git basado en ramas feature y Pull Requests con revisión.
Las refactorizaciones mejoraron encapsulación, eliminaron duplicación y separaron lógica de salida.
Se nos quedó un PR atrasado.

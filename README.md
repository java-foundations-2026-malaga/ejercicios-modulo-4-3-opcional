# JFo 4.3 - La clase String

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige el uso incorrecto de length
02. Corrige un índice fuera de rango
03. Corrige una llamada incorrecta a charAt
04. Corrige un substring mal planteado
05. Corrige una comparación de cadenas con operador incorrecto
06. Obtén la longitud de un nombre
07. Muestra caracteres concretos
08. Busca el primer guion de un teléfono
09. Busca el segundo guion de un teléfono
10. Extrae nombre y apellido
11. Genera iniciales
12. Normaliza un código de producto
13. Crea un generador de usuario
14. Ordena dos palabras lexicográficamente
15. Procesa una línea de pedido

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.

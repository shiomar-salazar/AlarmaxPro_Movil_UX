# AlarmaxPro_Movil_UX
Repositorio para la entrega final del Proyecto MISW-4302-2023-14 Version Movil

## Integrantes:

|   Nombre                         |   Correo                      |
|----------------------------------|-------------------------------|
| Shiomar Alberto Salazar Castillo | s.salazarc@uniandes.edu.co    |
| Haiber Humberto Galindo Sanchez  | h.galindos@uniandes.edu.co    |

## Tabla de contenido
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Diferencias con MockUps](#diferencias-con-mockups)
- [Pasos para hacer Build](#pasos-para-hacer-build)
- [Pasos para Generar APK](#pasos-para-generar-apk)
- [Pasos para Ejecutar en Dispositvo Fisico de Pruebas](#pasos-para-ejecutar-en-dispositivo-fisico-de-pruebas)
- [Pasos para Ejecutar en Dispositivo Emulado de Pruebas](#pasos-para-ejecutar-en-dispositivo-emulado-de-pruebas)

### Estructura del Proyecto
![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/e3f20d3d-990e-403e-9299-5142169244bc)

### Diferencias con MockUps

| Diferencia  | Imagen del Mockup | Imagen del Maquetado | Justificacion del Cambio |
|-------------|-------------------|----------------------|--------------------------|
| Color de Boton de Cancelar | ![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/06589d32-e923-48ba-8817-07f73364663e) | ![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/2650e7bf-ba84-451d-a68d-ec9c5ebb054c) | Se considero que el Tono de rojo del MockUp no tenia suficiente contraste, por eso se eligio el color del maquetado. |
| Colores en iconos y botones de la barra de navegacion inferior | ![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/6c9a6832-7fd1-498f-8fff-308e783e8f6c) | ![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/4b361190-5933-43cb-bf3f-131b1a3f8ff2) | Limitacion de Material Desgin, para lograr ese efecto se necesitava un mayor grado de experiencia tecnica y de tiempo de desarrollo para usar un MenuBuilder que nos permita crear una desviacion de la propuesta de Material. |
| Colores e Iconos de menu desplegable de Opciones | ![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/890ec660-cb21-4c29-aa8b-92cb1b56e015) | ![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/e2e67148-d0fe-4d3f-bcbb-c3a4881bcab3) | Limitacion de Material Desgin, para lograr ese efecto se necesitava un mayor grado de experiencia tecnica y de tiempo de desarrollo para usar un MenuBuilder que nos permita crear una desviacion de la propuesta de Material. |
| Colores e Iconos de menu desplegable superior | ![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/9fee28f1-0ad1-463e-abea-302a379ffa94) | ![image](https://github.com/shiomar-salazar/AlarmaxPro_Movil_UX/assets/111320185/a926c7e7-36c8-44db-bbd9-73684f8b17d7) | Limitacion de Material Desgin, para lograr ese efecto se necesitava un mayor grado de experiencia tecnica y de tiempo de desarrollo para usar un MenuBuilder que nos permita crear una desviacion de la propuesta de Material. |
  
### Pasos para hacer Build
1. En Android Studio con el proyecto abierto, hacer click en el boton del martillo, que aparecera en la parte superior derecha:
![image](https://user-images.githubusercontent.com/111320185/233865682-1ca9af38-93d0-4431-9a5b-7d350207dcf3.png)

2. Esperar una salida de la consola similar a la siguiente imagen:
![image](https://user-images.githubusercontent.com/111320185/233865668-8f7fb211-7f3d-466b-bf92-f685cb5f418c.png)

### Pasos para Generar APK
1. En Android Studio con el proyecto abierto, hacer click en Build -> Build Bundle(s)/APK(s) -> Build APK(s)
![image](https://user-images.githubusercontent.com/111320185/233865758-dbd50bf5-ea78-4ace-b8c2-d7c3729fb458.png)

2. Esperar hasta que Android Studio avise que termine la generacion y hacer click en "Locate":
![image](https://user-images.githubusercontent.com/111320185/233865815-5c5aff7b-c984-44c7-b1c2-52ca6c66c060.png)

3. Te dirigirá a la ubicacion donde se genero al APK:
![image](https://user-images.githubusercontent.com/111320185/233865897-c63c9890-b809-4566-b918-b48255c763e1.png)

### Pasos para Ejecutar en Dispositivo Fisico de Pruebas
1. En Android Studio con el proyecto abierto y el dispositvo a usar conectado (con la opcion de desarrollador activada):
![image](https://user-images.githubusercontent.com/111320185/233866031-0e14953a-3d34-4ee2-8408-bdea278d41b3.png)

2. Hacer click en la flecha verde del menu superior derecho:
![image](https://user-images.githubusercontent.com/111320185/233866050-726b2b33-1d10-4a1e-80ac-6466c5dc2c81.png)

3. Esperar a que en la terminal aparezca el siguiente mensaje:
![image](https://user-images.githubusercontent.com/111320185/233866097-3baf22e0-ac9e-461b-a4e3-43d5608373d0.png)

### Pasos para Ejecutar en Dispositivo Emulado de Pruebas
#### Crear Dispositivo Virual
1. Ir al menu Tool seleccionar la opción Device Manager.

![image](https://user-images.githubusercontent.com/65821560/235392026-e4e0b271-b9c3-4f3b-aad3-d4407338a730.png)

2. Seleccionar la Opción Virtual y luego dar click en el botón "Create Device"

![image](https://user-images.githubusercontent.com/65821560/235392155-7a760fac-4b16-47bb-8e19-6d8d11a92b8b.png)

3. Seleccionar el Tipo de dispositivo, Modelo y tamaño de pantalla, luego dar click en Next.

![image](https://user-images.githubusercontent.com/65821560/235392213-c3112663-1683-46b4-b6db-1314b7914d79.png)

4. Seleccionar la imagen del sistema Operativo a usar en el dispositivo virtual y dar click en Next.

![image](https://user-images.githubusercontent.com/65821560/235392267-cba3741e-4be2-4c08-bf9a-b8f4c7fcc6a2.png)

5. Seleccionar la oritentación del dispositivo y dar click en Finish.

![image](https://user-images.githubusercontent.com/65821560/235392388-b7753b2e-d719-4139-83e9-8a44b89c6823.png)

6. En la panrtalla se mostraran los dispositivos virtuales creados.

![image](https://user-images.githubusercontent.com/65821560/235392477-c5ac132c-c548-42c7-aaef-53bf3c63b576.png)

7. En la Barra de herramientas se debe seleccionar el proyecto, seleccionar el dispositivo a usar y dar click en el boton compilar.

![image](https://user-images.githubusercontent.com/65821560/235392561-111310d5-5c08-4462-86f2-d85fbdda010a.png)

8. Iniciara el despliegue de la aplicación en el dispositivo seleccionado y estara listo para la prueba.

![image](https://user-images.githubusercontent.com/65821560/235392625-71b12950-d05a-454d-b659-05c9a4ff3960.png)


# RVC Studio AI — starter Android project

Interfaz inicial nativa en Kotlin para Android: tema negro/verde neón, selector de audio, importación de archivos de modelo, controles de parámetros y elección entre modo local/online.

## Estado real
Esta entrega es un **prototipo de interfaz**, no una app de conversión completa. Todavía NO incluye un motor de inferencia RVC, separación vocal/instrumental, carga real de modelos en memoria, subida de archivos al servidor, ni exportación de covers. La pantalla informa de esta limitación en la propia app. No se ha compilado ni probado un APK en este entorno.

## Abrir y compilar
1. Extrae el ZIP.
2. Abre la carpeta `RVCStudioAI` en Android Studio.
3. Deja que Gradle sincronice; se requiere conexión para descargar las dependencias.
4. Compila con `Build > Build APK(s)`.

## Siguiente trabajo para lograr covers reales
- Definir y desplegar un backend seguro con RVC y dependencias compatibles.
- Implementar subida de audio/modelos con límites de tamaño, autenticación y borrado de temporales.
- Implementar separación vocal/instrumental (por ejemplo, Demucs) y mezcla/exportación.
- Evaluar un motor RVC ejecutable en Android para modo local; no todos los modelos `.pth` funcionan directamente en Android.
- Añadir progreso, cancelación, gestión de errores y licencias de los componentes.

Usa únicamente voces y audios para los que tengas permiso.

## Build an installable APK using only your Android phone

This starter includes a GitHub Actions workflow at `.github/workflows/android-apk.yml`.

1. On your phone, create/sign in to a GitHub account and create a **public or private repository**.
2. Upload the contents of this `rvcstudio` folder to the repository (the `.github` folder must be included) and use the branch name `main`.
3. Open the repository's **Actions** tab and select **Build Android APK**. Tap **Run workflow** if it has not started automatically.
4. When the workflow finishes successfully, open its run and download the artifact named `RVCStudioAI-debug-apk`.
5. Extract the ZIP artifact and install `app-debug.apk`. Android may ask you to allow installs from your browser/file manager.

This workflow only compiles the current starter app. It does **not** mean RVC conversion or a backend server is implemented yet; those require additional integration and testing. Only install APKs you built yourself or trust.

def call() {
    println "🚀 [Deploy] Iniciando despliegue en Windows..."

    // Ejemplo: copiar artefactos a una carpeta local
    // Ajusta la ruta según tu necesidad
    bat 'if not exist C:\\deploy\\app mkdir C:\\deploy\\app'
    bat 'xcopy /Y /E build\\* C:\\deploy\\app\\'

    println "🚀 [Deploy] Despliegue completado en C:\\deploy\\app"
}

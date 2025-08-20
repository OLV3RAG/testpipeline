def call() {
    println "🧪 [UnitTest] Ejecutando pruebas unitarias en Windows..."
    // Ejecuta pruebas
    bat 'npm test'
    println "🧪 [UnitTest] Pruebas completadas."
}

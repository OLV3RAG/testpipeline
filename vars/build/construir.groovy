def call() {
    println "📦 [Build] Iniciando construcción del proyecto en Windows..."
    // Instala dependencias y compila
    bat 'npm install'
    bat 'npm run build'
    println "📦 [Build] Construcción finalizada."
}

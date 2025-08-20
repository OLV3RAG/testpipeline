def call(String message) {
    echo "📩 Enviando notificación: ${message}"
    // aquí puedes poner emailext u otro notifier real
    // emailext(to: 'team@example.com', subject: 'Pipeline result', body: message)
}

public class Server implements Computer {
    @Override
    public void start() {
        System.out.println("Serveur démarre.");
        // Implémentation spécifique pour le démarrage d'un serveur
    }

    @Override
    public void shutdown() {
        System.out.println("Serveur s'arrête.");
        // Implémentation spécifique pour l'arrêt d'un serveur
    }
}
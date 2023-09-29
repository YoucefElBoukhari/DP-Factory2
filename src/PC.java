public class PC implements Computer {
    @Override
    public void start() {
        System.out.println("Ordinateur personnel (PC) démarre.");
        // Implémentation spécifique pour le démarrage d'un PC
    }

    @Override
    public void shutdown() {
        System.out.println("Ordinateur personnel (PC) s'arrête.");
        // Implémentation spécifique pour l'arrêt d'un PC
    }
}
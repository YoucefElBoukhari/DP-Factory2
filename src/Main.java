public class Main {
    public static void main(String[] args) {
        // Utilisation d'une Factory Method pour créer un PC
        ComputerFactory pcFactory = new PCFactory();
        Computer pc = pcFactory.createComputer();

        pc.start();
        pc.shutdown();

        // Utilisation d'une Factory Method pour créer un serveur
        ComputerFactory serverFactory = new ServerFactory();
        Computer server = serverFactory.createComputer();

        server.start();
        server.shutdown();
    }
}

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();
        // Primeiro estado da TV
        System.out.println("Tv ligada: " + tv.power);

        // Ligar e desligar a TV
        tv.turnOn();
        System.out.println("Apertei o botão de power, ligou? " + tv.power);
        tv.turnOff();
        System.out.println("Apertei o botão de power, continua ligada? " + tv.power);
        tv.turnOn();
        System.out.println("Se não deixar ligada não funciona né? \n" + tv.$power);

        System.out.println("Volume inicial: " + tv.volume);
        // Aumentei o volume 2x
        tv.volumeUp();
        tv.volumeUp();
        System.out.println("Volume atual: " + tv.volume);
        // Abaixei o volume 2x
        tv.volumeDown();
        tv.volumeDown();
        System.out.println("Volume atual: " + tv.volume);

        // Mudei o canal
        System.out.println("Canal inicial: " + tv.canal);
        tv.changeCanal(14);
        System.out.println("Novo Canal: " + tv.canal);

    }
}

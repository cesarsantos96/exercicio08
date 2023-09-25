public class Main {
    public static void main(String[] args) {

        Baralho baralho = new Baralho();
        baralho.embaralhar();

        Carta carta1 = baralho.distribuirCarta();
        Carta carta2 = baralho.distribuirCarta();


        System.out.println("Carta 1: " + carta1);
        System.out.println("Carta 2: " + carta2);
        System.out.println("Cartas restantes no baralho:" + baralho.tamanho());
    }
}
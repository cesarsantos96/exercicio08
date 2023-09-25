import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho(){
        cartas = new ArrayList<>();

        String [] naipes = { "Copas", "Espadas", "Ouros", "Paus"};
        String [] valores = {"Ás", "1","2", "3","4","5","6","7","8","9","10","Valete", "Dama", "Rei"};

        for (String naipe : naipes){
            for (String valor : valores){
                cartas.add(new Carta(valor, naipe));
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }
    public Carta distribuirCarta(){
        if (cartas.isEmpty()){
            throw new IllegalStateException("O baralhoe está vazio. Não é possível distribuir mais cartas");
        }
        return cartas.remove(0);
    }
    public int tamanho(){
        return cartas.size();
    }
}

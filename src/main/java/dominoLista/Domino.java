/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominoLista;

import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class Domino {

    private ArrayList<FichaDomino> listaFichas;

    public Domino() {

        listaFichas = new ArrayList<>();

    }

    public ArrayList rellenarArrayList(ArrayList<FichaDomino> lista) {

        lista.add(FichaDomino.aleatoria());

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == lista.get(i + 1)) {

            }
        }

        return lista;
    }

}

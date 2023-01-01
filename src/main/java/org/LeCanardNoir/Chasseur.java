package org.LeCanardNoir;

public class Chasseur {
    private OutilDeChasse outil;

    public Chasseur(OutilDeChasse outil) {
        this.outil = outil;
    }

    public void leurrerProie(){
        this.outil.emitterUnSon();
    }
}

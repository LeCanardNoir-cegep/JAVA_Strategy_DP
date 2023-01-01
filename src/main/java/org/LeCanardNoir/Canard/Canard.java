package org.LeCanardNoir.Canard;

import org.LeCanardNoir.ComportementCancan.ComportementCancan;
import org.LeCanardNoir.ComportementVol.ComportementVol;

public abstract class Canard {
    ComportementVol comportementVol;
    ComportementCancan comportementCancan;

    public Canard(){

    }

    public abstract void afficher();
    public void effectuerVol(){
        comportementVol.voler();
    }
    public void effectuerCancan(){
        comportementCancan.cancaner();
    }
    public void nager(){
        System.out.println("Tous les canards flottent, même les leurres!");
    }

    public void setComportementVol(ComportementVol cv) {
        this.comportementVol = cv;
    }

    public void setComportementCancan(ComportementCancan cc) {
        this.comportementCancan = cc;
    }
}

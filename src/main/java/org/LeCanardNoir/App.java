package org.LeCanardNoir;

import org.LeCanardNoir.Canard.Canard;
import org.LeCanardNoir.Canard.Colvert;
import org.LeCanardNoir.Canard.PrototypeCanard;
import org.LeCanardNoir.ComportementCancan.Cancan;
import org.LeCanardNoir.ComportementCancan.Coincoin;
import org.LeCanardNoir.ComportementVol.PropulsionAReaction;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        System.out.println("colvert");
        Canard colvert = new Colvert();
        colvert.effectuerCancan();
        colvert.effectuerVol();
        System.out.println();

        System.out.println("proto");
        Canard proto = new PrototypeCanard();
        proto.effectuerVol();
        proto.setComportementVol(new PropulsionAReaction());
        proto.effectuerVol();
        System.out.println();

        System.out.println("Chasseur");
        Appeau appeau = new Appeau(new Coincoin());
        Chasseur chasseur = new Chasseur(appeau);
        chasseur.leurrerProie();
        appeau.setSon(new Cancan());
        chasseur.leurrerProie();
    }
}

package org.LeCanardNoir;

import org.LeCanardNoir.ComportementCancan.ComportementCancan;
import org.LeCanardNoir.OutilDeChasse;

public class Appeau implements OutilDeChasse {

    private ComportementCancan son;
    public void setSon(ComportementCancan son) {
        this.son = son;
    }

    public Appeau(ComportementCancan son) {
        this.setSon(son);
    }

    public void emitterUnSon() {
        this.son.cancaner();
    }
}

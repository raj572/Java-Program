package habitations;

public interface Imposable {
    public float impot();}

Class Habitation package habitations;

    /*
     * cette classe est une classe abstract car la méthode abstraite
     * impot de l'interface Imposable n'a pas redéfinir
     */
    public abstract class Habitation implements Imposable {
        private Adresse adr;
        private String proprietaire;
        protected float surface;
        protected static float impotM2; // le même impôt de toutes
les Habitations

        //////////////////////////
        public Habitation(Adresse adr, String proprietaire, float surface) {
            super();
            this.adr = adr;
            this.proprietaire = proprietaire;
            this.surface = surface;
        }

        ///////////////////////////////
        public static void setImpotM2(float impotM2) {
            Habitation.impotM2 = impotM2;
        }

        //////////////////////////
public boolean equals(Object h)
{if(h==null)return false;
if(!(h instanceof Habitation))return false;
Habitation hab=(Habitation)h;
if(this.proprietaire==null||hab.proprietaire==null)
return false;
return
this.proprietaire.equals(hab.proprietaire)&&this.adr.equals(hab.a
dr);
    }

    ////////////////////////////////////
@Override
public String toString() {
return adr +"/" +proprietaire+"/"+surface+"/";
}

Class Individuelle package habitations;

    public class Individuelle extends Habitation {
        private int nbrePieces;
        private static float impotPiece;

        //////////////////////////////////////////////
        public Individuelle(Adresse adr, String proprietaire, float surface, int nbrePieces) {
            super(adr, proprietaire, surface);
            this.nbrePieces = nbrePieces;
        }

        //////////////////////////////////////////
        public static void setImpotPiece(float impotPiece) {
            Individuelle.impotPiece = impotPiece;
        }

        /////////// redéfinition de la méthode impot///////////
        public float impot() {
            // TODO Auto-generated method stub
            return impotPiece * nbrePieces + Habitation.impotM2 * super.surface;
        }

        /////////////////////// toString//////////////////
        public String toString() {
            return super.toString() + nbrePieces;
        }
    }

Class Professionnelle package habitations;

    public class Professionnelle extends Habitation {
        private int nbEmployes;

        ////////////////////////////////
        public Professionnelle(Adresse adr, String proprietaire, float surface, int nbEmployes) {
            super(adr, proprietaire, surface);
            this.nbEmployes = nbEmployes;
        }

        // Le mot-clé « super » peut également être utilisé pour appeler le constructeur
        // de laclasse mère.

        ////////////////////// toString()///////////////////
        public String toString() {
            return super.toString() + nbEmployes;
        }

        /*
         * Le mot-clé « super » peut également être utilisé pour appeler la méthode de
         * la
         * classe mère. Elle doit être utilisée si la sous-classe contient la même
         * méthode que la
         * classe mère. En d’autres termes, il est utilisé si la méthode est surchargée.
         */
        /////////// redéfinition de la méthode impot///////////
        public float impot() {
            // TODO Auto-generated method stub
            return Habitation.impotM2 * surface * nbEmployes / 10;
        }
}

Class Commune package communes
;

import habitations.Imposable;

public class Commune {
    private Imposable[] tabHabitations = new Imposable[1000];
    private int nombre = 0;

    ///////////////// ajouter//////////////
    public boolean ajouter(Imposable h) {
        if (h == null)
            return false;
        if (nombre == 1000)
            return false;
        // recherche duplicata
        for (int i = 0; i < nombre; i++)
            if (tabHabitations[i].equals(h))
                return false;
        tabHabitations[nombre++] = h;
        return true;
    }

    ///////// Imposable[ ] chercher (float impot)
    public Imposable[] chercher(float impot) {
        Imposable[] tabImpSup = new Imposable[nombre];
        for (int i = 0, j = 0; i < nombre; i++)
            if (tabHabitations[i].impot() > impot)
                tabImpSup[j++] = tabHabitations[i];
        return tabImpSup;
    }

    ///////////////////// float getImpotTotal( ) ////////////////
    public float getImpotTotal() {
        float s = 0;
        for (Imposable i : tabHabitations)
            if (i != null)
                s += i.impot();
        return s;
    }

    //////////////// String toString() /////////
    public String toString() {
        String chaine = "Commune:\n";
        for (Imposable i : tabHabitations)
            if (i != null)
                chaine += i.getClass().getSimpleName() + i + "\n";
        return chaine;
    }

    ////// float[] getImpotsHabitations(Commune c)
    public static float[] getImpotsHabitations(Commune c) {
        float[] tabImp = new float[c.nombre + 1];
        int i;
        for (i = 0; i < c.nombre; i++)
            tabImp[i] = c.tabHabitations[i].impot();
        tabImp[i] = c.getImpotTotal();
        return tabImp;
    }
}

Class Test
package tests
;

import communes.Commune;
import habitations.*;

public class Test {
    public static void main(String[] args) {
        // création d'une commune c1
        Commune c1 = new Commune();
        // création de deux objets "Individuelle"
        Habitation i1 = new Individuelle(new Adresse(14, "kkkk", "Tunis"),
                "Salah Abid", 120.4f, 3);
        Habitation i2 = new Individuelle(new Adresse(10, "mmmm", "Sfax"),
                "Ahlem Mhiri", 90.2f, 2);
        // création de deux objets "Professionnelle"
        Imposable p1 = new Professionnelle(new Adresse(11, "klll", "Tunis"),
                "Tarek Abidi", 111.1f, 5);
        Habitation p2 = new Professionnelle(new Adresse(88, "dddd", "Sousse"), "Samir Hadrich", 66.7f, 2);
        //
        Habitation.setImpotM2(30);
        Individuelle.setImpotPiece(46);
        //////////////// 6-a////////////////////////
        c1.ajouter(i1);
        c1.ajouter(i2);
        c1.ajouter(p1);
        c1.ajouter(p2);
        /////////////// 6-b////////////////////////
        System.out.println(c1);
        ///////////////// 6-c/////////////////////
        System.out.println("la somme des impots=" + c1.getImpotTotal());
        for (Imposable h : c1.chercher(100))
            if (h != null)
                System.out.println(h);
        /////////////////// 6-d//////////////////////
        int i = 0;
        for (float f : Commune.getImpotsHabitations(c1)) {
            if (i == Commune.getImpotsHabitations(c1).length - 1)
                System.out.println("Total=" + f);
            else
                System.out.println(f);
            i++;
        }
    }
}
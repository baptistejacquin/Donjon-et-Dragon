package main.java.donjon;

public abstract class Personnage {
    protected String nom;
    protected String image;

    public String toString(){
        return "\nNom : "+nom;
    }

    public abstract void modif();
    public abstract void affiche();
}

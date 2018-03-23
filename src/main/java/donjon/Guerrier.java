package main.java.donjon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Guerrier.
 */
public class Guerrier extends Personnage{
    private String image;
    private String type = " Guerrier";
    private int niveau;
    private int force;
    /**
     * The Armes.
     */
    protected ArrayList<Arme> armes = new ArrayList<>();

    public void  modif() {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        do {
            System.out.println("Modification du :\n" +
                    "1.Nom : " + this.getNom()+
                    "\n2.Force : " + this.getForce()+
                    "\n3.Niveau de vie : " + this.getNiveau()+
                    "\n4.Arme : "+ this.armes.get(0).getNom()+
                    "\n5.Dégat de l'arme : "+ this.armes.get(0).getAttaque()+
                    "\n6.Quitter");
            choix=input.nextInt();
            input.nextLine();
            if (choix ==1){
                System.out.println("Choisit son Nom :");
                this.setNom(input.nextLine());
            }else if (choix==2){
                System.out.println("Choisit la Force :");
                this.setForce(input.nextInt());
            }else if (choix==3){
                System.out.println("Choisit son Niveau de vie:");
                int newpv = input.nextInt();
                if (newpv > 100){
                    newpv =100;
                    this.setNiveau(newpv);
                }else if (newpv < 0){
                    newpv = 0;
                    this.setNiveau(newpv);
                }else {
                    this.setNiveau(newpv);
                }
            }else if (choix ==4){
                System.out.println("Choisit Son arme :");
                this.armes.get(0).setNom(input.nextLine());
            }else if (choix ==5){
                System.out.println("Choisit le dégat de l'arme :");
                this.armes.get(0).setAttaque(input.nextInt());
            }
        }while (choix != 6);
    }

    public String toString(){
        return "\nType :"+type+super.toString()+ "\nNiveau : "+ niveau + "\nForce : "+ force +"\nArme : "+armes.get(0).getNom()+"\nDégat arme : "+armes.get(0).getAttaque()+"\n\n";
    }

    /**
     * Gets force.
     *
     * @return the force
     */
    public int getForce() {
        return force;
    }

    /**
     * Sets force.
     *
     * @param force the force
     */
    public void setForce(int force) {
        this.force = force;
    }

    /**
     * Gets niveau.
     *
     * @return the niveau
     */
    public int getNiveau() {

        return niveau;
    }

    /**
     * Sets niveau.
     *
     * @param niveau the niveau
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {

        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}

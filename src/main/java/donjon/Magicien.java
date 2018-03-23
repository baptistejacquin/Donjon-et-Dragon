package main.java.donjon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Magicien.
 */
public class Magicien extends Personnage {
    private String image;
    private String type = " Magicien";
    private int vie;
    private int attaque;
    /**
     * The Sorts.
     */
    protected ArrayList<Sort> sorts = new ArrayList<>();


    public String toString(){
        return "\n\nType :"+type+super.toString()+ "\nNiveau de Vie : "+ vie + "\nNiveau d'attaque : "+ attaque +"\nSort : "+sorts.get(0).getNom()+"\nDégat du sort : "+sorts.get(0).getAttaque()+"\n\n";
    }

    public void  modif() {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        do {
            System.out.println("Modification du :\n" +
                    "1.Nom :\n" +
                    "2.Vie :\n" +
                    "3.Attaque :\n" +
                    "4.Sort :\n"+
                    "5.Dégat Sort \n"+
                    "6.Quittter :\n");
            choix=input.nextInt();
            input.nextLine();
            if (choix ==1){
                System.out.println("Choisit son Nom :");
                this.setNom(input.nextLine());
            }else if (choix==2){
                System.out.println("Choisit ses Points de vie :");
                int newpv =input.nextInt();
                if (newpv > 100){
                    newpv=100;
                    this.setVie(newpv);
                }else if (newpv <0){
                    newpv =0;
                    this.setVie(newpv);
                }else{
                    this.setVie(newpv);
                }
            }else if (choix==3){
                System.out.println("Choisit ses points d'attaque :");
                this.setAttaque(input.nextInt());
            }else if (choix ==4){
                System.out.println("Choisit Son sort :");
                this.sorts.get(0).setNom(input.nextLine());
            }else if (choix ==5){
                System.out.println("Choisit le dégat du sort :");
                this.sorts.get(0).setAttaque(input.nextInt());
            }
        }while (choix != 6);
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
     * Gets vie.
     *
     * @return the vie
     */
    public int getVie() {
        return vie;
    }

    /**
     * Sets vie.
     *
     * @param vie the vie
     */
    public void setVie(int vie) {
        this.vie = vie;
    }

    /**
     * Gets attaque.
     *
     * @return the attaque
     */
    public int getAttaque() {
        return attaque;
    }

    /**
     * Sets attaque.
     *
     * @param attaque the attaque
     */
    public void setAttaque(int attaque) {
        this.attaque = attaque;
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

package main.java.donjon;

import java.util.Scanner;

public class Magicien extends Personnage {
    private String image;
    private String type = " Guerrier";
    private int vie;
    private int attaque;
    private Sort[] sorts;

    public void affiche(){
        System.out.println("Type :");
        System.out.println("Magicien");
        System.out.println("Nom :");
        System.out.println(this.nom);
        System.out.println("Vie :");
        System.out.println(this.vie);
        System.out.println("Attaque :");
        System.out.println(this.attaque);
    }

    public void  modif() {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        do {
            System.out.println("Modification du :\n" +
                    "1.Nom :\n" +
                    "2.Vie :\n" +
                    "3.Attaque :\n" +
                    "4.Quittter :\n");
            choix=input.nextInt();
            input.nextLine();
            if (choix ==1){
                System.out.println("Choisit son Nom :");
                this.setNom(input.nextLine());
            }else if (choix==2){
                System.out.println("Choisit ses Points de vie :");
                this.setVie(input.nextInt());
            }else if (choix==3){
                System.out.println("Choisit ses points d'attaque :");
                this.setAttaque(input.nextInt());
            }
        }while (choix != 4);
    }

    public String toString(){
        return "Type :"+type+super.toString()+ "\nNiveau de Vie : "+ vie + "\nNiveau d'attaque : "+ attaque;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

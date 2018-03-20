package main.java.donjon;

import java.util.Scanner;

public class Guerrier extends Personnage{
    private String image;
    private String type = " Magicien";
    private int niveau;
    private int force;

    public void affiche(){
        System.out.println("Type :");
        System.out.println("Guerrier");
        System.out.println("Nom :");
        System.out.println(this.nom);
        System.out.println("Niveau :");
        System.out.println(this.niveau);
        System.out.println("Force :");
        System.out.println(this.force);
    }

    public void  modif() {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        do {
            System.out.println("Modification du :\n" +
                    "1.Nom :\n" +
                    "2.Force :\n" +
                    "3.Niveau :\n" +
                    "4.Quittter :\n");
            choix=input.nextInt();
            input.nextLine();
            if (choix ==1){
                System.out.println("Choisit son Nom :");
                this.setNom(input.nextLine());
            }else if (choix==2){
                System.out.println("Choisit la Force :");
                this.setForce(input.nextInt());
            }else if (choix==3){
                System.out.println("Choisit son Niveau :");
                this.setNiveau(input.nextInt());
            }
        }while (choix != 4);
    }

    public String toString(){
        return "Type :"+type+super.toString()+ "\nNiveau : "+ niveau + "\nForce : "+ force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getNiveau() {

        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getImage() {

        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

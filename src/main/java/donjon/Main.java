package main.java.donjon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personnage tabPerso[] = new Personnage[20];
        int nb = 0;
        Scanner input = new Scanner(System.in);
        String sortie = null;
        int choixperso = 0;
        int choixMenu = 0;
        int choixAffichage = 0;
        Magicien mag = null;
        Guerrier guerr = null;
        do {
            System.out.println("1.Créer un perso ? \n" + "2.Afficher votre perso\n" + "3.Liste des personnage existant \n" + "4.Modification de personnages \n");
            choixMenu = input.nextInt();

            if (choixMenu == 1) {
                System.out.println("Magicien ou Guerrier ? (1/2)" + "\n1.Magicien " + "\n2.Guerrier");
                choixperso = input.nextInt();
                input.nextLine();
                if (choixperso == 2) {
                    guerr = creationGuerrier();
                    tabPerso[nb] = guerr;
                    nb++;

                } else if (choixperso == 1) {
                    mag = creationMagicien();
                    tabPerso[nb] = mag;
                    nb++;
                }

                System.out.println("Afficher votre perso ? (1.oui/2.non)");
                choixAffichage = input.nextInt();
                if (choixAffichage == 1) {
                    if (mag != null) {
                        mag.affiche();
                    } else {
                        guerr.affiche();
                    }
                }
            } else if (choixMenu == 2) {
                if (mag != null) {
                    mag.affiche();
                } else {
                    guerr.affiche();
                }
            } else if (choixMenu == 3) {
                for (int i = 0; i < tabPerso.length; i++) {
                    if (tabPerso[i] != null) {
                        System.out.println(tabPerso[i]);
                        System.out.println("");
                    }
                }
            } else if (choixMenu == 4) {
                System.out.println("Choisir son personnage grâce au numero");
                for (int i = 0; i < tabPerso.length; i++) {
                    if (tabPerso[i] != null) {
                        System.out.println("Numero " + i);
                        System.out.println(tabPerso[i].nom);
                        System.out.println("");
                    }
                }
                int choixModif = input.nextInt();
                    tabPerso[choixModif].modif();
                    System.out.println("Voulez-vous affichez les modifications ? oui(1)/non(2)");
                    if (input.nextInt() ==1){
                        tabPerso[choixModif].affiche();
                    }
            }
            System.out.println("Voulez vous sortir du programme ? (y/n)");
            sortie = input.next();
        } while (!sortie.equals("y"));
//
//        Arme amre1 = new Arme();
//        amre1.setNom("katana");
//        amre1.setAttaque(6);
//        guerrier1.setNiveau(guerrier1.getNiveau() + amre1.getAttaque());
//        System.out.println(amre1.getNom());
//        System.out.println(amre1.getAttaque());
//        System.out.println(guerrier1.getNiveau());
    }

    private static Magicien creationMagicien() {
        Scanner input = new Scanner(System.in);
        Magicien magicien1 = new Magicien();
        System.out.println("Vous avez choisit un Magicien Noob! ");
        System.out.println("Donnez lui un nom !");
        magicien1.setNom(input.nextLine());
        System.out.println("Donnez lui sont niveau de vie !");
        magicien1.setVie(input.nextInt());
        System.out.println("Donnez lui son niveau d'attaque! ");
        magicien1.setAttaque(input.nextInt());
        return magicien1;
    }

    private static Guerrier creationGuerrier() {
        Scanner input = new Scanner(System.in);
        Guerrier guerrier1 = new Guerrier();
        System.out.println("Vous avez choisit un Guerrier Noob! ");
        System.out.println("Donnez lui un nom !");
        guerrier1.setNom(input.nextLine());
        System.out.println("Donnez lui sa force !");
        guerrier1.setForce(input.nextInt());
        System.out.println("Donnez lui son niveau ! ");
        guerrier1.setNiveau(input.nextInt());
        return guerrier1;
    }
}

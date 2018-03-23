package main.java.donjon;

import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    private static Personnage tabPerso[] = new Personnage[20];
    private static Scanner input = new Scanner(System.in);
    private static int choixAffichage = 0;
    private static int choixperso = 0;
    private static int nb = 0;
    private static Magicien mag = null;
    private static Guerrier guerr = null;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int choixMenu = 0;
        do {
            System.out.println("1.Créer un perso ? \n"
                    + "2.Liste des personnage existant \n"
                    + "3.Modification de personnages \n"
                    + "4.Supprimer perso \n"
                    + "5.Quitter le programme");
            choixMenu = testScanner.nextInt(input);
            if (choixMenu == 1) {
                choixMenu1();
            } else if (choixMenu == 2) {
                choixMenu2();
            } else if (choixMenu == 3) {
                choixMenu3();
            } else if (choixMenu == 4) {
                choixMenu4();
            }
        } while (choixMenu != 5);
    }


    private static void choixMenu1() {
        do {
            System.out.println("Magicien ou Guerrier ? (1/2)" + "\n1.Magicien " + "\n2.Guerrier" + "\n3.Annuler");
            choixperso = testScanner.nextInt(input);
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
        } while (choixperso != 3);
        if (choixperso != 3) {
            System.out.println("Afficher votre perso ? (1.oui/2.non)");
            choixAffichage = input.nextInt();
            if (choixAffichage == 1) {
                if (mag != null) {
                    System.out.println(mag.toString());
                } else {
                    System.out.println(guerr.toString());
                }
            }
        }
    }


//    private static void choixMenu2() {
//        if (mag != null) {
//            System.out.println(mag.toString());
//        } else {
//            System.out.println(guerr.toString());
//        }
//    }

    private static void choixMenu2() {
        for (int i = 0; i < tabPerso.length; i++) {
            if (tabPerso[i] != null) {
                System.out.println(tabPerso[i].toString());
            }
        }
    }

    private static void choixMenu3() {
        System.out.println("Choisir son personnage grâce au numero");
        for (int i = 0; i < tabPerso.length; i++) {
            if (tabPerso[i] != null) {
                System.out.println("Numero " + i);
                System.out.println(tabPerso[i].nom);
                System.out.println("");
            }
        }
        int choixModif = testScanner.nextInt(input);
        tabPerso[choixModif].modif();
        System.out.println("Voulez-vous affichez les modifications ? oui(1)/non(2)");
        if (testScanner.nextInt(input) == 1) {
            System.out.println(tabPerso[choixModif].toString());
        }
    }

    private static void choixMenu4() {
        System.out.println("Séléctionner le personnages à supprimer");
        for (int i = 0; i < tabPerso.length; i++) {
            if (tabPerso[i] != null) {
                System.out.println("Numero " + (i+1));
                System.out.println(tabPerso[i].nom);
                System.out.println("");
            }
        }
        int choixModif = testScanner.nextInt(input) -1;
        if (choixModif < nb && choixModif >= 0) {
            System.out.println("Voulez-vous supprimer " + tabPerso[choixModif].nom + " ? oui(1)/non(2)");
            if (testScanner.nextInt(input) == 1) {
                tabPerso[choixModif] = null;
            }
        }else {
            System.out.println("Veuillez choisir un personnage existant Jean Charles \n");
        }
    }

    private static Magicien creationMagicien() {
        Scanner input = new Scanner(System.in);
        Magicien magicien1 = new Magicien();
        System.out.println("Vous avez choisit un Magicien Noob! ");
        System.out.println("Donnez lui un nom !");
        magicien1.setNom(input.nextLine());
        System.out.println("Donnez lui sont niveau de vie !");
        magicien1.setVie(testScanner.nextInt(input));
        System.out.println("Donnez lui son niveau d'attaque! ");
        magicien1.setAttaque(testScanner.nextInt(input));
        input.nextLine();
        System.out.println("Donnez lui un sort");
        Sort sort1 = new Sort();
        sort1.setNom(input.nextLine());
        System.out.println("Dégats du sort ");
        sort1.setAttaque(testScanner.nextInt(input));
        magicien1.sorts.add(sort1);
        return magicien1;
    }

    private static Guerrier creationGuerrier() {
        Scanner input = new Scanner(System.in);
        Guerrier guerrier1 = new Guerrier();
        System.out.println("Vous avez choisit un Guerrier Noob! ");
        System.out.println("Donnez lui un nom !");
        guerrier1.setNom(input.nextLine());
        System.out.println("Donnez lui sa force !");
        guerrier1.setForce(testScanner.nextInt(input));
        System.out.println("Donnez lui son niveau ! ");
        guerrier1.setNiveau(testScanner.nextInt(input));
        input.nextLine();
        System.out.println("Donnez lui une Arme");
        Arme arme1 = new Arme();
        arme1.setNom(input.nextLine());
        System.out.println("Dégats de l'arme ");
        arme1.setAttaque(testScanner.nextInt(input));
        guerrier1.armes.add(arme1);
        return guerrier1;
    }

//    private static void affichagePersoDispo() {
//        for (int i = 0; i < tabPerso.length; i++) {
//            if (tabPerso[i] != null) {
//                System.out.println("Numero " + i);
//                System.out.println(tabPerso[i].nom);
//                System.out.println("");
//            }
//        }
//    }
}

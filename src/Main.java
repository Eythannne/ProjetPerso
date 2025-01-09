import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nom;
        String question;
        int jeux = 0;


        System.out.println("Quel est ton nom : ");
        nom = scan.nextLine();

        sautLigne();
        System.out.println("Bonjour à toi " + nom + ", Bienvenue dans mon projet !\n"+
                "tu te trouve la dans un projet qui regroupe la plupart de mes projet que j'ai eu a faire.\n"+
                "Ici tu retrouvera des programmes pour jouer, calculer, plein de type de programme en gros.\n"+
                "Prends le temps d'explorer, et n'oublie pas de tout lire pour ne rien louper.\n"+
                "Bonne découverte !");

        System.out.println("Veux tu joués a un jeux ? :");
        question = scan.nextLine();

        if (question.equals("oui")) {
            System.out.println("Liste des Jeux disponible :\n"+
                    "1 - bataille navalle\n"+
                    "2 - master mind\n");
        }else{
            System.out.println("tant pis");
        }

        System.out.println("A quel jeux veux tu jouer ? :");
        jeux = scan.nextInt();

        switch (jeux) {
            case 1:
                System.out.println("Lancement du jeux bataille navalle\n");
                batailleNavalle();
                break;
            case 2:
                System.out.println("Lancement du jeux master mind\n");
                masterMind();
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }

    // Fonction pour sauter des lignes
    public static void sautLigne() {
        for (int i = 0; i < 40; i++) {
            System.out.println(" ");
        }
    }

    // Fonction pour afficher la grille
    public static void afficherGrille(char[][] grille) {
        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < grille.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < grille[i].length; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fonction Jeux Bataille Navalle
    public static void batailleNavalle() {

        final int TAILLE_GRILLE = 10;
        char[][] grilleJoueur1 = new char[TAILLE_GRILLE][TAILLE_GRILLE];
        char[][] grilleJoueur2 = new char[TAILLE_GRILLE][TAILLE_GRILLE];
        int[] bateauxJoueur1 = {5, 4, 3, 3, 2};
        int[] bateauxJoueur2 = {5, 4, 3, 3, 2};
        int nbPartie = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < TAILLE_GRILLE; i++) {
            for (int j = 0; j < TAILLE_GRILLE; j++) {
                grilleJoueur1[i][j] = ' ';
                grilleJoueur2[i][j] = ' ';
            }
        }
        System.out.println("Entrez le nom du joueur 1:");
        String joueur1 = scanner.nextLine();
        System.out.println("Entrez le nom du joueur 2:");
        String joueur2 = scanner.nextLine();

        afficherGrille(grilleJoueur1);
        for (int i = 0; i < bateauxJoueur1.length; i++) {
            int tailleBateau = bateauxJoueur1[i];
            System.out.println(joueur1 + ", placez un bateau de taille " + tailleBateau);
            boolean bateauPlace = false;
            while (!bateauPlace) {
                System.out.println("Entrez les coordonnées du bateau (ex: A1H / H pour horizontal, V pour vertical) :");
                String coord = scanner.nextLine();
                int x = coord.charAt(1) - '0';
                int y = coord.charAt(0) - 'A';
                String orientation = coord.substring(2).toUpperCase();

                if (orientation.equals("H") && y + tailleBateau <= TAILLE_GRILLE) {
                    boolean valid = true;
                    for (int j = 0; j < tailleBateau; j++) {
                        if (grilleJoueur1[x][y + j] != ' ') {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        for (int j = 0; j < tailleBateau; j++) {
                            grilleJoueur1[x][y + j] = '#';
                        }
                        bateauPlace = true;
                        afficherGrille(grilleJoueur1);
                    }
                } else if (orientation.equals("V") && x + tailleBateau <= TAILLE_GRILLE) {
                    boolean valid = true;
                    for (int j = 0; j < tailleBateau; j++) {
                        if (grilleJoueur1[x + j][y] != ' ') {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        for (int j = 0; j < tailleBateau; j++) {
                            grilleJoueur1[x + j][y] = '#';
                        }
                        bateauPlace = true;
                        afficherGrille(grilleJoueur1);
                    }
                }
                if (!bateauPlace) {
                    System.out.println("Placement invalide, essayez à nouveau.");
                }
            }
        }
        int temp = 40;
        for (int i = 0; i < temp; i++) {
            System.out.println(" ");
        }
        afficherGrille(grilleJoueur2);
        for (int i = 0; i < bateauxJoueur2.length; i++) {
            int tailleBateau = bateauxJoueur2[i];
            System.out.println(joueur2 + ", placez un bateau de taille " + tailleBateau);
            boolean bateauPlace = false;
            while (!bateauPlace) {
                System.out.println("Entrez les coordonnées du bateau (ex: A1H / H pour horizontal, V pour vertical) :");
                String coord = scanner.nextLine();
                int x = Character.getNumericValue(coord.charAt(1)); // Lecture directe sans décalage

                int y = coord.charAt(0) - 'A';
                String orientation = coord.substring(2).toUpperCase();

                if (orientation.equals("H") && y + tailleBateau <= TAILLE_GRILLE) {
                    boolean valid = true;
                    for (int j = 0; j < tailleBateau; j++) {
                        if (grilleJoueur2[x][y + j] != ' ') {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        for (int j = 0; j < tailleBateau; j++) {
                            grilleJoueur2[x][y + j] = '#';
                        }
                        bateauPlace = true;
                        afficherGrille(grilleJoueur2);
                    }
                } else if (orientation.equals("V") && x + tailleBateau <= TAILLE_GRILLE) {
                    boolean valid = true;
                    for (int j = 0; j < tailleBateau; j++) {
                        if (grilleJoueur2[x + j][y] != ' ') {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        for (int j = 0; j < tailleBateau; j++) {
                            grilleJoueur2[x + j][y] = '#';
                        }
                        bateauPlace = true;
                        afficherGrille(grilleJoueur2);
                    }
                }
                if (!bateauPlace) {
                    System.out.println("Placement invalide, essayez à nouveau.");
                }
            }
        }
        for (int i = 0; i < temp; i++) {
            System.out.println(" ");
        }

        // Lancement de la partie
        boolean partieEnCours = true;
        int tour = 0;
        while (partieEnCours) {
            String joueurActuel = (tour % 2 == 0) ? joueur1 : joueur2;
            char[][] grilleActuelle = (tour % 2 == 0) ? grilleJoueur2 : grilleJoueur1;
            System.out.println(joueurActuel + ", à vous de jouer !");

            System.out.println("  A B C D E F G H I J");
            for (int i = 0; i < TAILLE_GRILLE; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < TAILLE_GRILLE; j++) {
                    if (grilleActuelle[i][j] == '#') {
                        System.out.print("  ");
                    } else {
                        System.out.print(grilleActuelle[i][j] + " ");
                    }
                }
                System.out.println();
            }

            System.out.println("Entrez les coordonnées du tir (ex: A5) :");
            String tir = scanner.nextLine();
            int x = tir.charAt(1) - '0';
            int y = tir.charAt(0) - 'A';

            if (x < 0 || x >= TAILLE_GRILLE || y < 0 || y >= TAILLE_GRILLE) {
                System.out.println("Coordonnées invalides. Essayez à nouveau.");
                continue;
            }

            if (grilleActuelle[x][y] == 'X' || grilleActuelle[x][y] == 'O') {
                System.out.println("Vous avez déjà tiré ici !");
                continue;
            }

            if (grilleActuelle[x][y] == '#') {
                grilleActuelle[x][y] = 'X';
                System.out.println("Touché !");
            } else if (grilleActuelle[x][y] == ' ') {
                grilleActuelle[x][y] = 'O';
                System.out.println("Plouf !");
            }

            // Vérification de la victoire
            boolean victoire = true;
            for (int i = 0; i < TAILLE_GRILLE; i++) {
                for (int j = 0; j < TAILLE_GRILLE; j++) {
                    if (grilleActuelle[i][j] == '#') {
                        victoire = false;
                        break;
                    }
                }
            }

            if (victoire) {
                System.out.println(joueurActuel + " a gagné !");
                partieEnCours = false;

                System.out.println("Voulez-vous rejouer ? (O/N)");
                String reponse = scanner.nextLine().toUpperCase();
                if (reponse.equals("O")) {
                    System.out.println("ok");
                    return;
                } else {
                    System.out.println("Merci d'avoir joué ! À bientôt.");
                    scanner.close();
                    return;
                }
            }

            tour++;
        }
        scanner.close();

    }

    // Fonction Jeux Master Mind
    public static void masterMind() {

        Scanner scanner = new Scanner(System.in);
        String rejouer;

        do {
            // Permettre à un deuxième joueur de définir la séquence secrète
            int[] sequenceSecrete = new int[5];
            boolean[] utilise = new boolean[10]; // Pour vérifier si un chiffre est déjà utilisé

            System.out.println("Joueur 2 : Entrez une séquence secrète de 5 chiffres uniques entre 1 et 9 (séparés par des espaces) :");
            for (int i = 0; i < 5; i++) {
                int chiffre;
                do {
                    chiffre = scanner.nextInt();
                    if (chiffre < 1 || chiffre > 9 || utilise[chiffre]) {
                        System.out.println("Chiffre invalide ou déjà utilisé. Essayez à nouveau :");
                    }
                } while (chiffre < 1 || chiffre > 9 || utilise[chiffre]);

                sequenceSecrete[i] = chiffre;
                utilise[chiffre] = true;
            }
            scanner.nextLine(); // Consommer le saut de ligne restant

            System.out.println("La séquence secrète a été définie par le joueur 2 !");

            int tentativesRestantes = 12;
            boolean victoire = false;

            while (tentativesRestantes > 0 && !victoire) {
                System.out.println("\nIl vous reste " + tentativesRestantes + " tentative(s).");
                System.out.println("Proposez une séquence de 5 chiffres (séparés par des espaces) :");

                // Lire la proposition du joueur
                int[] proposition = new int[5];
                for (int i = 0; i < 5; i++) {
                    proposition[i] = scanner.nextInt();
                }

                // Vérifier la proposition
                int bienPlaces = 0;
                int malPlaces = 0;
                boolean[] utiliseDansSecrete = new boolean[5];
                boolean[] utiliseDansProposition = new boolean[5];

                // Vérifier les chiffres bien placés
                for (int i = 0; i < 5; i++) {
                    if (proposition[i] == sequenceSecrete[i]) {
                        bienPlaces++;
                        utiliseDansSecrete[i] = true;
                        utiliseDansProposition[i] = true;
                    }
                }

                // Vérifier les chiffres corrects mais mal placés
                for (int i = 0; i < 5; i++) {
                    if (!utiliseDansProposition[i]) {
                        for (int j = 0; j < 5; j++) {
                            if (!utiliseDansSecrete[j] && proposition[i] == sequenceSecrete[j]) {
                                malPlaces++;
                                utiliseDansSecrete[j] = true;
                                break;
                            }
                        }
                    }
                }

                if (bienPlaces == 5) {
                    victoire = true;
                    System.out.println("\nFélicitations ! Vous avez deviné la séquence secrète !");
                } else {
                    System.out.println("\nIndices :");
                    System.out.println("- Chiffres bien placés : " + bienPlaces);
                    System.out.println("- Chiffres mal placés : " + malPlaces);
                }

                tentativesRestantes--;
            }

            if (!victoire) {
                System.out.println("\nVous avez épuisé toutes vos tentatives. La séquence secrète était : ");
                for (int chiffre : sequenceSecrete) {
                    System.out.print(chiffre + " ");
                }
                System.out.println();
            }

            System.out.println("\nVoulez-vous rejouer ? (oui/non)");
            scanner.nextLine(); // Consommer le saut de ligne restant
            rejouer = scanner.nextLine().trim().toLowerCase();

        } while (rejouer.equals("oui"));

        System.out.println("Merci d'avoir joué au MasterMind. À bientôt !");
        scanner.close();

    }


}
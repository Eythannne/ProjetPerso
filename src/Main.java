//TODO fonction dans une fonction
//TODO variable temporaire (pour prendre une donnée d'un switch)
//TODO corriger les fautes
//TODO passer switch (int) --> (String)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nom = "";
        String question = "";
        String fin = "";
        int jeux = 0;

        System.out.println("Quel est ton nom : ");
        nom = scan.nextLine();
        //sautLigne();
        System.out.println("Bonjour à toi " + nom + ", Bienvenue dans mon projet !\n" +
                "Tu te trouve la dans un projet qui regroupe la plupart de mes projets que j'ai eu à faire.\n" +
                "Ici tu retrouvera des programmes pour jouer, calculer, plein de types de programmes en gros.\n" +
                "Prends le temps d'explorer, et n'oublie pas de tout lire pour ne rien louper.\n" +
                "Bonne découverte !\n");

        //entrer();

        while (!fin.equals("RIEN")){
            System.out.println("Que veux tu faire ? :\n" +
                    "- Apprendre\n" +
                    "- Jeux\n" +
                    "- Calculatrice\n" +
                    "- Moyenne\n" +
                    "- Rien");
            fin = scan.nextLine().toUpperCase();
            //sautLigne();
        if (fin.equals("APPRENDRE")) {
            while (question.equals("JAVA") || question.equals("PHP") || !question.equals("RIEN")) {
                System.out.println("Que veux tu apprendre ?\n" +
                        "- JAVA\n" +
                        "- PHP\n" +
                        "- RIEN");
                question = scan.nextLine().toUpperCase();
                if (question.equals("JAVA")) {
                    java();
                }
                else if (question.equals("PHP")) {
                    php();
                }
                else if (question.equals("RIEN")) {
                    //sautLigne();
                }
            }
        }
            else if (fin.equals("JEUX")) {
                System.out.println("Voici la liste des Jeux disponible :\n" +
                        "- BatailleNavale\n" +
                        "- MasterMind\n" +
                        "- Pendu\n" +
                        "- JustePrix\n" +
                        "- Morpion\n");

                System.out.println("A quel jeux veux tu jouer ? :");
                question = scan.nextLine().toUpperCase();
                if (question.equals("BATAILLENAVALE")) {
                    jeux = 1;
                }
                else if (question.equals("MASTERMIND")) {
                    jeux = 2;
                }
                else if (question.equals("PENDU")) {
                    jeux = 3;
                }
                else if (question.equals("JUSTEPRIX")) {
                    jeux = 4;
                }
                else if (question.equals("MORPION")) {
                    jeux = 5;
                }
                typeJeux(jeux);
            }
            else if (fin.equals("CALCULATRICE")) {
                System.out.println("pouf voici une calculatrice");

            }
            else if (fin.equals("MOYENNE")) {
                calculMoyenne();

            }
            else if (fin.equals("RIEN")) {
                System.out.println("Pas de problème, revient quand tu veux.\n" +
                        "A très vite " + nom + " !");
                scan.close();
                return;
            }
            else {
                System.out.println(" ");
            }
        }
    }


    //---------------FONCTION---------------//

    //Fonction apprendre JAVA
    public static void java() {

        Scanner scan = new Scanner(System.in);
        String question = "";

        System.out.println("Allons apprendre le JAVA\n");

        while (!question.equals("NON")) {

            //sautLigne();
            System.out.println("Que veux tu apprendre en JAVA ? :\n" +
                    "- Variable\n" +
                    "- Fonction\n" +
                    "- Condition\n" +
                    "- Boucle\n" +
                    "- Tableau");
            question = scan.nextLine().toUpperCase();
            //sautLigne();
            themeJava(question);
            scan.nextLine();

            System.out.println("veux tu voir quelque chose d'autre en JAVA ? :");

            question = scan.nextLine().toUpperCase();

            if (question.equals("OUI")) {
                System.out.println("voyons quelque chose d'autre ensemble !");
            }
            else if (question.equals("NON")) {

                System.out.println("ok à plus tard !");
            }
        }
    }

    //Fonction apprendre PHP
    public static void php() {

        Scanner scan = new Scanner(System.in);
        String question = "";
        int php = 0;

        System.out.println("Allons apprendre le PHP\n");

        while (!question.equals("NON")) {
            //sautLigne();
            System.out.println("Que veux tu apprendre en PHP ? :\n" +
                    "- Variable\n" +
                    "- Fonction\n" +
                    "- Condition\n" +
                    "- Boucle\n" +
                    "- Tableau");
            question = scan.nextLine().toUpperCase();
            if (question.equals("VARIABLE")) {
                php = 1;
            }
            else if (question.equals("FONCTION")) {
                php = 2;
            }
            else if (question.equals("CONDITION")) {
                php = 3;
            }
            else if (question.equals("BOUCLE")) {
                php = 4;
            }
            else if (question.equals("TABLEAU")) {
                php = 5;
            }
            //sautLigne();
            themePhp(php);
            scan.nextLine();

            System.out.println("veux tu voir quelque chose d'autre en PHP ? :");

            question = scan.nextLine().toUpperCase();

            if (question.equals("OUI")) {
                System.out.println("voyons quelque chose d'autre ensemble !");
            } else if (question.equals("NON")) {

                System.out.println("ok à plus tard !");
            }
        }
    }

    //Fonction thème JAVA
    public static void themeJava(String java) {

        switch (java) {
            case "VARIABLE":
                System.out.println("Lancement du module Variable\n");
                System.out.println("à remplir");
                System.out.println("Exemple de theme :\n"+
                        "1) definition\n"+
                        "2) explication a quoi ça sert\n"+
                        "3) differents type de 'theme'\n"+
                        "4) exemple d'utilisation (dans un code)\n");
                //entrer();
                break;

            case "FONCTION":
                System.out.println("Lancement du module Fonction\n");
                System.out.println("à remplir");
                //entrer();
                return;

            case "CONDITION":
                System.out.println("Lancement du module Condition\n");
                System.out.println("à remplir");
                //entrer();
                return;

            case "BOUCLE":
                System.out.println("Lancement du module Boucle\n");
                System.out.println("à remplir");
                //entrer();
                return;

            case "TABLEAU":
                System.out.println("Lancement du module tableau\n");
                System.out.println("à remplir");
                //entrer();
        }
    }

    //Fonction thème PHP
    public static void themePhp(int php) {

        switch (php) {
            case 1:
                System.out.println("Lancement du module Variable\n");
                System.out.println("à remplir");
                System.out.println("Exemple de theme :\n"+
                        "1) definition\n"+
                        "2) explication a quoi ça sert\n"+
                        "3) differents type de 'theme'\n"+
                        "4) exemple d'utilisation (dans un code)\n");
                break;
            case 2:
                System.out.println("Lancement du module Fonction\n");
                System.out.println("à remplir");
                return;
            case 3:
                System.out.println("Lancement du module Condition\n");
                System.out.println("à remplir");
                return;
            case 4:
                System.out.println("Lancement du module Boucle\n");
                System.out.println("à remplir");
                return;
            case 5:
                System.out.println("Lancement du module tableau\n");
                System.out.println("à remplir");
        }
    }

    // Fonction touche entrer
    public static void entrer() {
        Scanner scan = new Scanner(System.in);
        String entrer = "";

        System.out.println("[--- TOUCHE ENTRER ---]");
        entrer = scan.nextLine();
    }

    // Fonction pour sauter des lignes
    public static void sautLigne() {
        for (int i = 0; i < 40; i++) {
            System.out.println(" ");
        }
    }

    //Fonction type jeux
    public static void typeJeux(int jeux){

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
                System.out.println("Lancement du jeux du pendu\n");
                pendu();
                break;
            case 4:
                System.out.println("Lancement du jeux juste prix\n");
                justePrix();
                break;
            case 5:
                System.out.println("Lancement du jeux morpion\n");
                morpion();
                break;

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

    //Fonction Jeux Pendu
    public static void pendu() {
        Scanner scanner = new Scanner(System.in);

        // Étape 1 : Joueur 1 entre le mot à deviner
        System.out.print("Joueur 1, entrez un mot à deviner : ");
        String motADeviner = scanner.nextLine().toUpperCase();
        System.out.print("Confirmez-vous le mot '" + motADeviner + "' ? (oui/non) : ");
        String confirmation = scanner.nextLine().toLowerCase();

        while (!confirmation.equals("oui")) {
            System.out.print("Entrez un nouveau mot : ");
            motADeviner = scanner.nextLine().toUpperCase();
            System.out.print("Confirmez-vous le mot '" + motADeviner + "' ? (oui/non) : ");
            confirmation = scanner.nextLine().toLowerCase();
        }

        char[] motCache = new char[motADeviner.length()];
        for (int i = 0; i < motCache.length; i++) {
            motCache[i] = '_';
        }

        int essaisRestants = 9;
        boolean motTrouve = false;
        String lettresProposees = "";

        // Étape 2 : Joueur 2 essaie de deviner le mot
        while (essaisRestants > 0 && !motTrouve) {
            System.out.println("\nMot à deviner (" + essaisRestants + " essais restants) : " + new String(motCache));
            afficherPendu(9 - essaisRestants); // Affiche le dessin du pendu
            System.out.print("1 - proposer une lettre");
            System.out.print("\n2 - proposer un mot");
            System.out.print("\nJoueur 2, à votre tour, vous voulez proposer une lettre ou un mot (1/2): ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            if (choix == 1) {
                System.out.print("Proposez une lettre : ");
                char lettre = scanner.nextLine().toUpperCase().charAt(0);

                if (lettresProposees.indexOf(lettre) != -1) {
                    System.out.println("Cette lettre a déjà été proposée.");
                    continue;
                }

                lettresProposees += lettre;
                boolean lettreTrouvee = false;
                for (int i = 0; i < motADeviner.length(); i++) {
                    if (motADeviner.charAt(i) == lettre) {
                        motCache[i] = lettre;
                        lettreTrouvee = true;
                    }
                }

                if (!lettreTrouvee) {
                    essaisRestants--;
                }
            } else if (choix == 2) {
                System.out.print("Proposez un mot : ");
                String motPropose = scanner.nextLine().toUpperCase();

                if (motPropose.equals(motADeviner)) {
                    motTrouve = true;
                    break;
                } else {
                    System.out.println("Le mot proposé est incorrect.");
                    essaisRestants--;
                }
            } else {
                System.out.println("Choix invalide.");
            }

            motTrouve = new String(motCache).equals(motADeviner);
        }

        // Fin de la partie
        if (motTrouve) {
            System.out.println("\nFélicitations ! Joueur 2 a trouvé le mot : " + motADeviner);
        } else {
            afficherPendu(9);
            System.out.println("\nDommage ! Le mot à deviner était : " + motADeviner);
        }

        // Relancer une nouvelle partie
        System.out.print("Voulez-vous relancer une partie ? (oui/non) : ");
        String relancer = scanner.nextLine().toLowerCase();
        if (relancer.equals("oui")) {
            //System.out.println("ok");
            pendu();
        } else {
            System.out.println("C'est la fin du jeu, j'espère que tu as passés un bon moment !");
            System.out.println("Tu peux revenir jouer dès que tu le veux.");
            System.out.println("A très vite ! :)");
        }
    }

    // Méthode pour afficher le dessin du pendu
    public static void afficherPendu(int etape) {
        switch (etape) {
            case 1:
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("       ");
                System.out.println("       ");
                System.out.println("    ===");
                break;
            case 2:
                System.out.println("     +");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 3:
                System.out.println(" +---+");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 4:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    ---");
                break;
            case 5:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 6:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 7:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 8:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("    ===");
                break;
            case 9:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("    ===");
                break;
        }
    }

    //Fonction Jeux Juste prix
    public static void justePrix(){

        System.out.println("Jeux du juste prix en cour de developpement");
    }

    //Fonction Jeux Morpion
    public static void morpion(){

        System.out.println("Jeux du morpion en cour de developpement");
    }

    //Fonction Calcul de moyenne
    public static void calculMoyenne(){

        Scanner scanner = new Scanner(System.in);

//variable
        int nombreEleve;
        int nombreNote;
        String temp;


//Code
        System.out.println("Bonjour, combien d'élève y a t-il ?");
        nombreEleve = scanner.nextInt();
        String[] nomEtudiant = new String[nombreEleve];
        double [] moyenne = new double[nombreEleve];
        System.out.println("d'accord il y aura "+nombreEleve+" élèves");
        System.out.println("Maintenant combien de notes auront ces élèves ?");
        nombreNote = scanner.nextInt();
        double [][] note = new double[nombreEleve][nombreNote];
        double [][] coef = new double[nombreEleve][nombreNote];
        System.out.println("donc il y aura "+nombreEleve+" élèves et "+nombreNote+" notes par élèves.");

        for (int i = 0; i < nombreEleve; i++) {
            System.out.println("Entrez le nom de l'élève n°" + (i + 1) + " :");
            scanner.skip("\n");
            nomEtudiant[i] = scanner.nextLine();

            double sommeNote = 0;
            double sommeCoef = 0;

            System.out.println("Entrez les notes et coefficients de " + nomEtudiant[i] + " :");
            for (int j = 0; j < nombreNote; j++) {
                System.out.println("Entrez la note " + (j + 1) + " :");
                note[i][j] = scanner.nextDouble();
                System.out.println("Entrez le coefficient de la note " + (j + 1) + " :");
                coef[i][j] = scanner.nextDouble();

                sommeNote += note[i][j] * coef[i][j];
                sommeCoef += coef[i][j];
            }

            moyenne[i] = sommeNote / sommeCoef;
        }

        for (int i = 0; i < nombreEleve; i++) {
            System.out.println("Elève : " + nomEtudiant[i]);
            for (int j = 0; j < nombreNote; j++) {
                System.out.println("Note " + (j + 1) + " - " + note[i][j] + " / Coef - " + coef[i][j]);
            }
            System.out.println("Moyenne : " + moyenne[i]);
            System.out.println();
        }

        for (int i = 0; i < nombreEleve - 1; i++) {
            for (int j = i + 1; j < nombreEleve; j++) {
                if (moyenne[i] < moyenne[j]) {

                    String echangeNom = nomEtudiant[i];
                    nomEtudiant[i] = nomEtudiant[j];
                    nomEtudiant[j] = echangeNom;

                    double echangeMoyenne = moyenne[i];
                    moyenne[i] = moyenne[j];
                    moyenne[j] = echangeMoyenne;

                    double[] echangeNote = note[i];
                    note[i] = note[j];
                    note[j] = echangeNote;

                    double[] echangeCoef = coef[i];
                    coef[i] = coef[j];
                    coef[j] = echangeCoef;
                }
            }
        }


        System.out.println("Voici le classement des élève de la meilleure à la moins bonne moyenne :");
        for (int i = 0; i < nombreEleve; i++) {
            System.out.println((i + 1) + ". " + nomEtudiant[i] + " : " + moyenne[i]);
        }
        System.out.println("touche \"entrer\" pour passer");
        temp = scanner.nextLine();
        scanner.nextLine();

    }



}
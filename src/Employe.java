import java.util.ArrayList;
import java.util.Scanner;

public class Employe {



    // atrubiuts
    private int matricule;
    private String nom;
    private String prenom;
    private int age;
    private double salaire;

    // constructer

    public Employe(int matricule, String nom, String prenom, int age, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }

    // getters and setters

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule() {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return
                "      - matricule  = " + matricule + '\n' +
                        "      - nom        = " + nom + '\n' +
                        "      - prenom     = " + prenom + '\n' +
                        "      - age        = " + age + '\n' +
                        "      - salaire    = " + salaire + '\n'
                ;
    }


    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employe> array = new ArrayList<>();


    // method pour afficher le menu
    public static void menu() {
        System.out.print("                menu        \n"
                + " 1 - Ajouter un nouvel employé\n"
                + " 2 - Modifier un employé\n"
                + " 3 - Supprimer un employé\n"
                + " 4 - Afficher un employé\n"
                + " 5 - Afficher tous les employés\n"
                + " 6 - Calculer le nombre des employés ayant un salaire qui dépasse 10000.\n"
                + " 7 - Afficher l’employé le plus âgé.\n"
                + " 8 - Afficher l’employé le moins âgé.\n"
                + " 9 - Quitter\n" + "\n"
                + " -donner votre chiox : ");


    }

    // ------------------------ 1 - Ajouter un nouvel employé -----------------------------------------------------------------------------------

    // method pour remplaire les informatrion nom , prenom , age , salaire :
    static void remplaire(int matricule) {
        System.out.print("donner votre nom : ");
        String nom = sc.next();
        System.out.print("donner votre prenom : ");
        String prenom = sc.next();
        System.out.print("donner votre age : ");
        int age = sc.nextInt();
        System.out.print("donner votre salaire : ");
        double salaire = sc.nextDouble();
        System.out.print("\n");
        Employe em = new Employe(matricule, nom, prenom, age, salaire);
        array.add(em);
    }

    // method pour ajouter un employe
    static void Ajouter(){
        if(array.isEmpty()) {
            System.out.print("donner votre matricule : ");
            int matricule = sc.nextInt();
            remplaire(matricule);
        }else{

            //verifier que se matricule n'est existe deja
            for (int i =0 ;i<array.size() ;i++) {
                System.out.print("donner votre matricule : ");
                int matricule = sc.nextInt();
                while (matricule == array.get(i).getMatricule()) {
                    System.out.print("se matricule se trouve deja s'il vous plais donner le matricule correct : ");
                    matricule = sc.nextInt();
                }
                remplaire(matricule);
                break;
            }
        }
    }
    // -------------------------------- 2 - Modifier un employé ---------------------------------------------
    // method pour modifier le nom
    static void  ModifierNom(){
        for (int i = 0; i < array.size(); i++) {
            System.out.println("le nom actuelle est : " + array.get(i).getNom());
            System.out.print("donner le neveau nom : ");
            String nom = sc.next();
            System.out.println("\n");

            Employe em = new Employe(array.get(i).getMatricule(), nom, array.get(i).getPrenom(), array.get(i).getAge(), array.get(i).getSalaire());
            array.set(i, em);
        }
    }

    // method pour modifier le prenom :
    static void  ModifierPrenom(){
        for (int i = 0; i < array.size(); i++) {
            System.out.println("le prenom actuelle est : " + array.get(i).getPrenom());
            System.out.print("donner le neveau prenom : ");
            String prenom = sc.next();
            System.out.println("\n");

            Employe em = new Employe(array.get(i).getMatricule(), array.get(i).getNom(), prenom, array.get(i).getAge(), array.get(i).getSalaire());
            array.set(i, em);
        }
    }

    // method pour modifier l'age  :
    static void  ModifierAge(){
        for (int i = 0; i < array.size(); i++) {
            System.out.println("l'age actuelle est : " + array.get(i).getAge());
            System.out.print("donner le neveau age : ");
            int age = sc.nextInt();
            System.out.println("\n");

            Employe em = new Employe(array.get(i).getMatricule(), array.get(i).getNom(), array.get(i).getPrenom(), age, array.get(i).getSalaire());
            array.set(i, em);
        }
    }

    // method pour modifier le salaire :
    static void  ModifierSalaire(){
        for (int i = 0; i < array.size(); i++) {
            System.out.println("le salaire actuelle est : " + array.get(i).getSalaire());
            System.out.print("donner le neveau salaire : ");
            int salaire = sc.nextInt();
            System.out.println("\n");

            Employe em = new Employe(array.get(i).getMatricule(), array.get(i).getNom(), array.get(i).getPrenom(), array.get(i).getAge(), salaire);
            array.set(i, em);
        }
    }


    // method pour modifier tots les information d'un employé
    static void ModifierTouts() {
        ModifierNom();
        ModifierPrenom();
        ModifierAge();
        ModifierSalaire();
        System.out.print("\n");
    }

    // method pour afficher le menu de modufication d'un employe
    public static String menuModifier() {
        return "                menu de modufication       \n"
                + " 1 - pour modifier le nom\n"
                + " 2 - pour modifier le prenom\n"
                + " 3 - pour modifier l'age\n"
                + " 4 - pour modifier le salaire\n"
                + " 5 - pour modifier tout les information \n"
                + " 6 - Quitter\n";

    }

    // method de la moduficatipn
    public static void Modifier() {
        if (array.isEmpty()) {
            System.out.println("la base de donne est vide: ");
            System.out.print("\n");

        } else {
            System.out.print("donner le matricule de l'employer modifier : ");
            int matricule = sc.nextInt();

            for (int i = 0; i < array.size(); i++) {
                if (matricule != array.get(i).getMatricule()) {
                    System.out.print("se matricule ne trouve pas s'il vous plais donner le matricule correct : ");
                    matricule = sc.nextInt();
                    System.out.println("\n");
                }

                System.out.println(Employe.menuModifier());
                System.out.print("donner votre chiox de modufication  : ");
                int chiox = sc.nextInt();
                while (chiox < 1 || chiox > 6) {
                    System.out.print("-donner un chiox entre 1 et 6: ");
                    chiox = sc.nextInt();
                    System.out.print("\n");
                }
                while (chiox >= 1 && chiox <= 6) {

                    if (chiox >= 1 && chiox <= 5) {
                        switch (chiox) {
                            case 1:
                                ModifierNom();
                                System.out.println(Employe.menuModifier());
                                break;
                            case 2:
                                ModifierPrenom();
                                System.out.println(Employe.menuModifier());
                                break;
                            case 3:
                                ModifierAge();
                                System.out.println(Employe.menuModifier());
                                break;
                            case 4:
                                ModifierSalaire();
                                System.out.println(Employe.menuModifier());
                                break;
                            case 5:
                                ModifierTouts();
                                System.out.println(Employe.menuModifier());
                                break;
                        }
                        System.out.print("-donner votre chiox de modufication: ");
                        chiox = sc.nextInt();
                        System.out.print("\n");

                        while (chiox < 1 || chiox > 6) {
                            System.out.print("-donner un chiox entre 1 et 6: ");
                            chiox = sc.nextInt();
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("la modification est fini \n");
                        break;
                    }
                }

            }
        }
    }

    // -------------------------------- 3 - Supprimer un employé ------------------------------------------
    public static void Supprimer() {
        if (array.isEmpty()) {
            System.out.println("la base de donner est vide ");
            System.out.print("\n");
        } else {
            System.out.print("donner le matricule de l'employer suprimer : ");
            int matricule = sc.nextInt();

            for (int i = 0; i < array.size(); i++) {
                if (matricule == array.get(i).getMatricule()) {
                    array.remove(i);
                    System.out.print("l'employer a ete suppremer  : ");
                } else {
                    System.out.print("se matricule n'exeste pas \n");
                    System.out.print("\n");
                }
            }
        }
    }

    // -------------------------------- 4 - Afficher un employé ------------------------------------------
    public static void Afficherunemploye() {
        if (array.isEmpty()) {
            System.out.println("la base de donner est vide \n");

        } else {
            System.out.print("donner le matricule afficher : ");
            int matricule = sc.nextInt();

            for (int i =0 ;i<array.size() ;i++) {

                if(matricule != array.get(i).getMatricule()) {
                    System.out.print("se matricule se trouve deja s'il vous plais donner le matricule correct : ");
                    matricule = sc.nextInt();
                }
                System.out.println(array.get(i));
                break;
            }

        }
    }

    // -------------------------------- 5 - Afficher tous les employés ------------------------------------------
    static void AfficherTous() {
        int nb = 0;
        if (array.isEmpty()) {
            System.out.println("la base de donner est vide \n");

        } else {

            for (int i = 0; i < array.size(); i++) {
                nb += 1;
                System.out.println("les iformation de l'employe "+ nb +" sont :");
                System.out.println(array.get(i));
                System.out.print("\n");

            }
        }
    }

    // -------------------------------- 6 - Calculer le nombre des employés ayant un salaire qui dépasse 10000. ------------------------------------------
    static void Affichersalair() {
        if (array.isEmpty()) {
            System.out.println("la base de donner est vide \n");

        } else {
            int nb = 0;
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).getSalaire() > 10000) {
                    nb += 1;
                }
            }
            System.out.println("le nombre des employés ayant un salaire qui dépasse 10000 est : " + nb+"\n");
        }
    }

    // -------------------------------- 7 - Afficher l’employé le plus âgé. ------------------------------------------
    static void plusage() {
        if (array.isEmpty()) {
            System.out.println("la base de donner est vide \n");

        } else {
            int age = 0;
            int i;
            int e = 0;
            for (i = 0; i < array.size(); i++) {
                if (array.get(i).getAge() > age) {
                    age = array.get(i).getAge();
                    e = i;
                }
            }
            System.out.println("employé le plus âgé est : " + array.get(e));
        }
    }

    // -------------------------------- 8 - Afficher l’employé le moins âgé. ------------------------------------------
    static void moinsage() {
        if (array.isEmpty()) {
            System.out.println("la base de donner est vide \n");

        } else {
            int age = 1000;
            int e = 0;
            int i;
            for (i = 0; i < array.size(); i++) {
                if (array.get(i).getAge() < age) {
                    age = array.get(i).getAge();
                    e = i;
                }
            }
            System.out.println("employé le moins âgé est : \n" + array.get(e));
        }
    }

}








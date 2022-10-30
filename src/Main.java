import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employe> array = new ArrayList<>();

    public static void main(String[] args) {


        Employe.menu();
        int chiox = sc.nextInt();
        System.out.print("\n");

        while (chiox < 1 || chiox > 9) {
            System.out.print(" -donner un chiox entre 1 et 9: ");
            chiox = sc.nextInt();
            System.out.print("\n");
        }

        boolean quitte=true;
        while (quitte) {
            switch (chiox) {
                case 1 -> Employe.Ajouter();
                case 2 -> Employe.Modifier();
                case 3 -> Employe.Supprimer();
                case 4 -> Employe.Afficherunemploye();
                case 5 -> Employe.AfficherTous();
                case 6 -> Employe.Affichersalair();
                case 7 -> Employe.plusage();
                case 8 -> Employe.moinsage();
                case 9 -> quitte=false;
            }
            Employe.menu();
             chiox = sc.nextInt();
            System.out.print("\n");

            while (chiox < 1 || chiox > 9) {
                System.out.print(" -donner un chiox entre 1 et 9: ");
                chiox = sc.nextInt();
                System.out.print("\n");
            }

            }
        System.out.println("le programme a ete quitter : ");
        }


}






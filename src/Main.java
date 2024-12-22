import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        int choix ;
        do {
            System.out.println("***********Menu*************");
            System.out.println("1-Ajoutter un livre : ");
            System.out.println("2- Afficher les livre :");
            System.out.println("3- Rechercher un livre : ");
            System.out.println("4- Modifier un livre: ");
            System.out.println(" 5- Supprimer un livre : ");
            System.out.println("6- Quitter");
            System.out.println("entrer un choix entre 1 et 6 :");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    book.ajouter();
                    break;
                case 2:
                    book.afficherts();
                    break;
                case 3:
                    book.recherche();
                    break;
                case 4:
                    book.modifier();
                    break;
                case 5:
                    book.supprimer();
                    break;
                case 6:
                    System.out.println("tu finish le progrrame :");
                    break;
                default:
                    System.out.println("chose a number from the menu ");
            }
        }
        while (choix != 6);

    }
}



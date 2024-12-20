import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        int choix = 6;
        System.out.println("1-Ajoutter un livre : ");
        System.out.println("2- Afficher les livre :");
        System.out.println("3- Rechercher un livre : ");
        System.out.println("4- Modifier un livre: ");
        System.out.println(" 5- Supprimer un livre : ");
        System.out.println("6- Quitter");
        System.out.println("entrer un choix entre 1 et 6");
        Scanner scanner = new Scanner(System.in);
        choix = scanner.nextInt();
        switch (choix) {
            case 1:
                book.ajouter();
                break;
            case 2:
                book.afficher();
                break;
            case 3:
                book.recherche();
            case 4 :
                book.supprimer();
        }
    }
}


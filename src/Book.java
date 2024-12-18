import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String titre;
    String auteur;
   String isdn;
    boolean desponibilite;
    ArrayList<Book>books = new ArrayList<Book>();

void Ajouter() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("entrer le titre : ");
     titre = scanner.nextLine();
    System.out.print("entrer le nom de l'auteur : ");
     auteur = scanner.nextLine();
    System.out.print("entrer isdn :");
     isdn = scanner.nextLine();
    System.out.print("entrer la disponibilité  :");
    desponibilite = scanner.nextBoolean();
}
public void Afficher(){
    System.out.println("le titre " +titre);
    System.out.println("l'auter " +auteur);
    System.out.println("isdn " +isdn);
    System.out.println("desponibilite " +desponibilite);
}




}

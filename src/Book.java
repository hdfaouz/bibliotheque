import java.util.Scanner;

public class Book {
    String titre;
    String auteur;
    double isdn;
    String desponibilite;

public void Ajouter() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("entrer le titre : ");
    String titre = scanner.next();
    System.out.println("entrer le nom de l'auteur : ");
    String auteur = scanner.next();
    System.out.println("entrer prix :");
    double isdn = scanner.nextDouble();
    System.out.println("entrer la disponibilité :");
    String desponibilite = scanner.next();
}





}

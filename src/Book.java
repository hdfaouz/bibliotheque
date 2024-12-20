import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    Scanner scanner = new Scanner(System.in);


    private String titre;
    private String auteur;
    private String isbn;
    private boolean desponibilite;
    ArrayList<Book> books = new ArrayList<Book>();

    //Constructeur
    public Book(String titre, String auteur, String isbn, boolean disonibilte) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.desponibilite = disonibilte;
    }

    Book() {
    }


    // getters
    public String getTitre() {
        return this.titre;
    }

    // setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;

    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getDesponibilite() {
        return this.desponibilite;
    }

    public void setDesponibilite(Boolean desponibilite) {
        this.desponibilite = desponibilite;
    }


    // CRUD functions
    void ajouter() {

        System.out.print("entrer le titre : ");
        titre = scanner.nextLine();
        System.out.print("entrer le nom de l'auteur : ");
        auteur = scanner.nextLine();
        System.out.print("entrer isbn :");
        isbn = scanner.nextLine();
        System.out.print("entrer la disponibilité oui  :");
        desponibilite = scanner.nextBoolean();
        books.add(new Book(titre, auteur, isbn, desponibilite));
    }

    public void afficher() {
        System.out.println("le titre " + titre);
        System.out.println("l'auter " + auteur);
        System.out.println("isdn " + isbn);
        System.out.println("desponibilite " + desponibilite);
    }

    public void afficherts() {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).afficher();
        }
    }


    public Book recherche() {
        System.out.println("entrer l'isbn  : ");
        String isbn=scanner.nextLine();
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            } else {
                System.out.println("isbn non trouvé");
            }
        }
        return null;

        }
    public void supprimer() {

        Book book = recherche();
        if (book != null){
            books.remove(book);
        }
        else System.out.println("book non trouvé");

    }
}











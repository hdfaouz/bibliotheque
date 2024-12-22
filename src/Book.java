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
    public Book(String titre, String auteur, String isbn, boolean desponibilte) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.desponibilite = desponibilte;
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

        System.out.println("entrer le titre : ");
        String titre = scanner.nextLine();
        setTitre(titre);
        System.out.println("entrer le nom de l'auteur : ");
        String auteur = scanner.nextLine();
        setAuteur(auteur);
        System.out.println("entrer isbn :");
         String isbn = scanner.nextLine();
         setIsbn(isbn);
        System.out.println("entrer la disponibilité (true/false)  :");
        boolean desponibilite = scanner.nextBoolean();
        setDesponibilite(desponibilite);
        books.add(new Book(titre, auteur, isbn, desponibilite));
        scanner.nextLine();
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
                System.out.println("livre trouvé");
                book.afficher();
                return book;
            }
        }
        System.out.println("isbn non trouvé");
        return null;
        }

    public void supprimer() {

        Book book = recherche();
        if (book != null){
            books.remove(book);
            System.out.println("livre supprimé avec succés ");
        }
        else {
            System.out.println("book non trouvé");
        }

    }
    public void modifier(){

        Book book = recherche();
        if(book!=null){
            System.out.println("entrer le nouveau titre : ");
            String titre = scanner.nextLine();

            System.out.println("entrer le nouvel auteur :");
            String auteur =scanner.nextLine();

            System.out.println("entre le nouvel isbn :");
            String isbn = scanner.nextLine();

            System.out.println("entrer la nouvelle disponibilite (true/false");
            boolean desponibilite =scanner.nextBoolean();
            scanner.nextLine();

            book.setTitre(titre);
            book.setAuteur(auteur);
            book.setIsbn(isbn);
            book.setDesponibilite(desponibilite);

            System.out.println("livre modifier avec succés.");
        }
        else {
            System.out.println("modification impossible!!");
        }





    }

    @Override
    public String toString() {

            return "Book : {" +
                    "  titre='" + titre +
                    '\'' +
                    ", auteur='" + auteur +
                    '\'' +
                    ", isbn='" + isbn +
                    '\'' +
                    ", desponibilite=" + desponibilite +
                    '}';
        }


}











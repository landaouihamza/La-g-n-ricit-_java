package gn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Test {
    public static <scanner> void main(String[] args) {
    MetierProduitImpl m = new MetierProduitImpl();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\n **** MENU ****");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher tous les produits");
            System.out.println("3. Trouver un produit par ID");
            System.out.println("4. Supprimer un produit");
            System.out.println("5. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:

                    System.out.print("Entrez l'ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Entrez le prix : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Entrez la description : ");
                    String description = scanner.nextLine();
                    System.out.print("Entrez le stock : ");
                    int stock = scanner.nextInt();
                    m.add(new Produit(id, nom, marque, prix, description, stock));
                    System.out.println("Produit ajouté avec succès !");
                    break;
                case 2:
                    System.out.println("Liste des produits :");
                    // Pour un affichage JSON
                    String produitsJson = gson.toJson(m.getAll());
                    System.out.println(produitsJson);
                    break;
                case 3:

                    System.out.print("Entrez l'ID du produit à rechercher : ");
                    int searchId = scanner.nextInt();
                    Produit produit = m.findById(searchId);
                    if (produit != null) {
                        String produits = gson.toJson(produit);
                        System.out.println("Produit trouvé :" + produits);
                    } else {
                        System.out.println("Aucun produit trouvé avec cet ID.");
                    }
                    break;
                case 4:

                    System.out.print("Entrez l'ID du produit à supprimer : ");
                    int deleteId = scanner.nextInt();
                    Produit produitASupprimer = m.findById(deleteId);
                    if (produitASupprimer != null) {
                        m.delete(deleteId);
                        System.out.println("Produit supprimé avec succès !");
                    } else {
                        System.out.println("Aucun produit trouvé avec cet ID.");
                    }
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide,.");
            }

        }while(choix != 5);
        scanner.close();

    }

}




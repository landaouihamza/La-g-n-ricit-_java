package gn;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements  IMetier<Produit>{
    private final List<Produit> produitlist = new ArrayList<>();
    @Override
    public void add(Produit produit) {
        produitlist.add(produit);
        System.out.println("produit added");
    }

    @Override
    public List<Produit> getAll() {
        return produitlist;
    }

    @Override
    public Produit findById(int id) {
        for (Produit produit : produitlist) {
            if (produit.getId() == id) {
                return produit;
            }

        }
        return null;
    }

        @Override
        public void delete ( int id){
            produitlist.removeIf(produit -> produit.getId() == id);
        }



}

<h3>Classe Produit :</h3>
Définit un produit avec des attributs : 
  <ul>
            <li><code>id</code> (identifiant unique)</li>
            <li><code>nom</code>, <code>marque</code>, <code>prix</code>, <code>description</code>, et <code>nombreEnStock</code>.</li>
  </ul>
<p>Elle inclut un constructeur, des accesseurs (<code>getters</code>) et une méthode <code>toString()</code> pour afficher les détails.</p>


<h3>Interface Générique IMetier<T> :</h3>
Déclare des méthodes pour gérer une liste d'entités génériques :

<ul>
            <li><code>add(T o)</code> : Ajouter un objet.</li>
            <li><code>getAll()</code> : Retourner la liste des objets.</li>
            <li><code>findById(int id)</code> : Trouver un objet par <code>id</code>.</li>
            <li><code>delete(int id)</code> : Supprimer un objet par <code>id</code>.</li>
</ul>
<h3>Classe MetierProduitImpl :</h3>
Implémente l'interface IMetier pour gérer une liste de Produit. Fournit des fonctionnalités pour :

Ajouter des produits.
Afficher tous les produits.
Trouver un produit par id.
Supprimer un produit par id.
Classe Application :
<h3>Fournit une interface utilisateur avec un menu pour :</h3>
<ul>
            <li>Ajouter un nouveau produit.</li>
            <li>Afficher tous les produits.</li>
            <li>Afficher un produit par <code>id</code>.</li>
            <li>Supprimer un produit.</li>
            <li>Quitter le programme.</li>
        </ul>


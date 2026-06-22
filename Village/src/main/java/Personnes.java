public class Personnes {
    private final String prenom;
    private final String nom;
    private String fonction;
    private int age;
    Batiments positionInitiale = new Batiments("Place du Village");
    Batiments positionActuelle;

    public Personnes(String prenom, String nom, String fonction, int age){
        this.prenom = prenom;
        this.nom = nom;
        this.fonction = fonction;
        this.age = age;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getNom(){
        return nom;
    }
    public String getFonction(){
        return fonction;
    }
    public int getAge(){
        return age;
    }

    public void changerPosition(Batiments batiment){
        this.positionActuelle = batiment;
    }

    public Batiments getPosition(){
        if(positionActuelle == null){
            return positionInitiale;
        }else{
            return positionActuelle;
        }
    }

    public String phrasePosition(){
        if(positionActuelle == null){
            return this.prenom + " se trouve actuellement dans " + positionInitiale;
        }else{
            return this.prenom + " se trouve actuellement dans " + positionActuelle;
        }
    }

    /* Créer une méthode qui permet de rajouter une personne dans un batiment et de prendre
     la personne actuelle en parametre pour la rajouter dans la méthode list de batiment */

    public String sortir(){
        if(positionActuelle != positionInitiale){
            Batiments positionTemporaire = positionActuelle;
            positionActuelle = positionInitiale;
            return this.prenom + " est sorti de " + positionTemporaire;
        }else{
            return this.prenom + " se trouve déjà dehors";
        }
    }
}

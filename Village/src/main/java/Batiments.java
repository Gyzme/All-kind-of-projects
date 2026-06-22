import java.util.List;

public class Batiments {
    String type;
    List<Personnes> personnesDansBatiment;

    public Batiments(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void ajouterPersonnes(Personnes personnes){
        personnesDansBatiment.add(personnes);
    }

    public List<Personnes> getPersonnesDansBatiment(){
        return personnesDansBatiment;
    }

    public String toString(){
        return this.type;
    }
}

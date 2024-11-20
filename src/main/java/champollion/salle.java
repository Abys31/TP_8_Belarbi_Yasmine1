package champollion;

public class salle {

    private String intitule;
    private int capacite;

    public salle (String intitule, int capacite){
        this.intitule=intitule;
        this.capacite=capacite;
    }

    public String getIntitule() {
        return intitule;
    }

    public int getCapacite() {
        return capacite;
    }

}
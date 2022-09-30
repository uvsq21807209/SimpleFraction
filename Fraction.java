

public class Fraction {

    private int numerateur;
    private int denominateur;
    
    public Fraction(int numerateur,int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    
    public int getNumerateur(){
        return numerateur;
    }

    public int getDenominateur(){
        return denominateur;
    }

    @Override
    public String toString()
    {
        // Insérez votre code ici
        return "\nJe suis une fraction\n";
    }
}
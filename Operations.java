public interface Operations{
    private Compte c;
    private String type;
    
    public Compte getCompte()
    {
        return this.Compte;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public Operations()
    
    public void Depot(int somme)
    {
        System.out.println("Vous avez effectuée un dépot de: " + somme + "€");
        c.setSolde(c.getSolde()+somme);
        this.type="Depot";
    }
    
    public void Retrait(int somme)
    {
        System.out.println("Vous avez effectuée un débit de: " + somme + "€");
        c.setSolde(c.getSolde()-somme);
        this.type="Retrait";
    }
    
    public void Consultation()
    {
        this.type="Consultation";
        System.out.println("Votre solde est de: "+c.getSolde() + "€");
    }
}


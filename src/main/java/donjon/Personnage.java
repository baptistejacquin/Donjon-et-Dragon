package main.java.donjon;

/**
 * The type Personnage.
 */
public abstract class Personnage {
    /**
     * The Nom.
     */
    protected String nom;
    /**
     * The Image.
     */
    protected String image;

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    public String toString(){
        return "\nNom : "+nom;
    }

    /**
     * Modif.
     */
    public abstract void modif();
}

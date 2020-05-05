package bts.fr;


public class Ville {

    private String name;
    private String temperature;

    public Ville(String temperature) {

        this.temperature = temperature;

    }
    // fonction de test a enlever plus tard
    public void print() {
        System.out.print(temperature);
    }
}

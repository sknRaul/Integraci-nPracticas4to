package models;
public class ModelIMC {
    
    private double weight=0;  //peso
    private double height=0; //altura
    private double imc = 0;
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
        
    public double IMC() {
        this.setImc(weight/(height*height));
        return this.getImc();
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }
}

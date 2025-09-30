public class Coche {
    //Atributos
    private String marca;
    private String modelo;
    private int year;
    private boolean isOn;

    //Getter, Setter y Constructor

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Coche(String modelo, String marca, int year) {
        this.modelo = modelo;
        this.marca = marca;
        this.year = year;
        this.isOn = false;
    }
    //Funciones

    public boolean startEngine() {
        if(this.isOn) {
            System.err.println("El coche ya esta encendido");
        }else{
            this.isOn = true;
            System.out.println("Encendiendo el coche " + this.marca + " " + this.modelo + " " + this.year);
        }

        return this.isOn;
    }
    public boolean stopEngine() {
        if(!this.isOn) {
            System.err.println("El coche ya esta apagado");
        }else {
            this.isOn = false;
            System.out.println("Apagando el coche " + this.marca + " " + this.modelo + " " + this.year);
        }

        return this.isOn;

    }

}

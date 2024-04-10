public class Mineral extends Bebida {

    //Atributos
    private String manatial;

    //Constructores
    public Mineral(String manatial, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.manatial = manatial;
    }

    //Metodos
    public String getManatial() {
        return manatial;
    }

    public void setManatial(String manatial) {
        this.manatial = manatial;
    }

    @Override
    public String toString() {
        return super.toString() + "manatial=" + manatial;
    }

}
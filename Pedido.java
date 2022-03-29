import java.util.ArrayList;

class Pedido {

    private String nombre;
    private double total;
    private boolean listo;
    private ArrayList<Articulo> items = new ArrayList<Articulo>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double computeTotal() {
        total = 0;
        for (Articulo item : items) {
            total += item.getPrecio();
        }
        return total;
    }

    public void addItem(Articulo item) {
        items.add(item);
        computeTotal();
    }

    public void setlisto(boolean listo) {
        this.listo = listo;
    }

    public boolean getListo() {
        return listo;
    }

}
public class Categoria {
    private int id;
    private String categoria;

    public Categoria(String categoria, int id) {
        this.categoria = categoria;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
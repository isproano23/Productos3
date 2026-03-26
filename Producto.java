public class Producto {
    private String nombre;
	private double precio;
	private int stock;
	private String categoria;
	
	public Producto(String nombre, double precio, int stock, String categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void mostrarInfo() {
		
		System.out.println("Nombre: "+nombre+"Precio:"+precio+"Categoria: "+categoria+"Stock:"+stock);
		
	}
	
	public double aplicarDescuento(double porcentaje) {
		double descuento;
		double precioconDescuento;
		descuento=(precio*porcentaje)/100;
		precioconDescuento = precio-descuento;
		return precioconDescuento;
	}
	
	public void verificarStock(int cantidad) {
        if (cantidad <= stock) {
            System.out.println("Disponible (si alcanza)");
        } else {
            System.out.println("Stock insuficiente. Disponible: " + stock + " (si no alcanza)");
        }
    }

}

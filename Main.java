public static void main(String[] args) {
		 System.out.println("===== Bienvenido a la Tienda Digital =====");
		 System.out.println();
		 // ── Integrante 1: Producto ──────────────────────────────
		 // Crear una instancia de Producto con datos reales.
		 Producto producto=new Producto("Audifonos",20.35,15,"electronica");
		 // Llamar a: mostrarInfo(), aplicarDescuento() y verificarStock().
	       producto.mostrarInfo();
	       producto.verificarStock(11);
	  	   System.out.println("Precio con Descuento "+ producto.aplicarDescuento(10));
	      
	       
		 // ── Integrante 2: Cliente ───────────────────────────────
		 // Crear una instancia de Cliente con datos reales.
		 // Llamar a: mostrarPerfil(), realizarCompra() y mostrarSaldo().
		 // ── Integrante 3: Carrito ───────────────────────────────
		 // Crear una instancia de Carrito.
		 // Agregar al menos 2 productos con agregarProducto().
		 // Llamar a calcularTotal() y mostrarResumen().
		 // ── Integrante 4 (si aplica): Tienda ───────────────────
		 // Crear una instancia de Tienda.
		 // Registrar productos con registrarProducto().
		 // Llamar a buscarProducto() y generarReporte().
		 System.out.println();
		 System.out.println("===== Fin del programa =====");
		 }
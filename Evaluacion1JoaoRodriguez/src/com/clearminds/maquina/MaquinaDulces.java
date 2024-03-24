package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	int contador =1;
	public void mostrarConfiguracion() {

		for (Celda celda : celdas) {
			System.out.println("Celda"+contador+": " + celda.getCodigo());
			contador ++;
		}
	}

	 // Método para buscar una celda por su código
    public Celda buscarCelda(String codigo) {
        for (Celda celda : celdas) {
            if (celda.getCodigo().equals(codigo)) {
                return celda;
            }
        }
        return null; // Retorna null si no se encuentra la celda con el código especificado
    }

    // Método para cargar un producto en una celda con un código y cantidad específicos
    public void cargarProducto(Producto producto, String codigoCelda, int cantidadItems) {
        // Buscar la celda con el código especificado
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        
        // Si se encontró la celda
        if (celdaRecuperada != null) {
            // Agregar el producto con la cantidad especificada a la celda recuperada
            celdaRecuperada.ingresarProducto(producto, cantidadItems);
        } else {
            System.out.println("No se encontró ninguna celda con el código " + codigoCelda);
        }
    }

    public void mostrarProductos() {
    	for(Celda celda:celdas) {
    		celda.imprimir();
    	}
    	System.out.println("Saldo: "+ saldo);
    }
	
 // Método para buscar el producto en una celda con un código específico
    public Producto buscarProductoEnCelda(String codigoCelda) {
        // Buscar la celda con el código especificado
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        
        // Si se encontró la celda
        if (celdaRecuperada != null) {
            return celdaRecuperada.getProducto(); // Retorna el producto en la celda
        } else {
            return null; // Retorna null si no se encontró la celda con el código especificado
        }
    }
	
    public double consultarPrecio(String codigoCelda) {
		Producto productoEncintrado = buscarProductoEnCelda(codigoCelda);
		return productoEncintrado.getPrecio();
	}
    

    // Método para buscar la celda que contiene un producto con un código específico
    public Celda buscarCeldaProducto(String codigoProducto) {
        for (Celda celda : celdas) {
            if (celda.getProducto() != null && celda.getProducto().getCodigo().equals(codigoProducto)) {
                return celda; // Retorna la celda que contiene el producto con el código especificado
            }
        }
        return null; // Retorna null si no se encontró ninguna celda con el producto especificado
    }
    public void incrementarProductos(String codigoProducto, int cantidad) {

		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
		}else {
			System.out.println("Celda no encontrada");
		}

	}
	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			saldo += celdaEncontrada.getProducto().getPrecio();
		}
	}

	public double venderConCambio(String codigoCelda, double valor) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double cambio = 0.0;
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			cambio = valor - celdaEncontrada.getProducto().getPrecio();
			saldo += celdaEncontrada.getProducto().getPrecio();

		}
		return cambio;
	}
	
	 // Método para buscar productos cuyo precio sea menor o igual al límite especificado
    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> productosMenores = new ArrayList<>();
        for (Celda celda : celdas) {
            if (celda.getProducto() != null && celda.getProducto().getPrecio() <= limite) {
                productosMenores.add(celda.getProducto());
            }
        }
        return productosMenores;
    }

}

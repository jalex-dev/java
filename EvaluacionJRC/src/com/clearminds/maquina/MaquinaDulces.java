package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1 = new Celda(c1);
		celda2 = new Celda(c2);
		celda3 = new Celda(c3);
		celda4 = new Celda(c4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1:" + celda1.getCodigo());
		System.out.println("CELDA 2:" + celda2.getCodigo());
		System.out.println("CELDA 3:" + celda3.getCodigo());
		System.out.println("CELDA 4:" + celda4.getCodigo());

	}

	public Celda buscarCelda(String codigo) {

		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null; // No se encontró la celda con el código especificado
		}
	}

	public void cargarProducto(Producto p, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(p, cantidad);
		}
	}

	public void mostrarProductos() {
		/**
		 * System.out.println("*****************CELDA "+getCodigo());
		 * System.out.println("Stock:"+getStock()); if(getProducto() != null) {
		 * System.out.println("Nombre Producto: "+ getProducto().getNombre());
		 * System.out.println("Precio Producto: "+ getProducto().getPrecio());
		 * System.out.println("Codigo Producto: "+ getProducto().getCodigo()); }else {
		 * System.out.println("La celda no tiene producto"); }
		 */
		celda1.imprimir();
		System.out.println("Saldo: "+saldo);

		celda2.imprimir();
		System.out.println("Saldo: "+saldo);

		celda3.imprimir();
		System.out.println("Saldo: "+saldo);

		celda4.imprimir();
		System.out.println("Saldo: "+saldo);


	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (celda1.getCodigo().equals(codigoCelda)) {
			if (celda1.getProducto() != null) {
				return celda1.getProducto();
			}

		}
		if (celda2.getCodigo().equals(codigoCelda)) {
			if (celda2.getProducto() != null) {
				return celda2.getProducto();
			}

		}
		if (celda3.getCodigo().equals(codigoCelda)) {
			if (celda3.getProducto() != null) {
				return celda3.getProducto();
			}

		}
		if (celda4.getCodigo().equals(codigoCelda)) {
			if (celda4.getProducto() != null) {
				return celda4.getProducto();
			}

		}
		return null;

	}

	public double consultarPrecio(String codigoCelda) {
		Producto productoEncintrado = buscarProductoEnCelda(codigoCelda);
		return productoEncintrado.getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
			return celda1;
		}
		if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
			return celda2;
		}
		if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
			return celda3;
		}
		if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
			return celda4;
		}
		return null;
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
		if(celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			saldo += celdaEncontrada.getProducto().getPrecio();
		}
	}
	
	public double venderConCambio (String codigoCelda,double valor) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double cambio=0.0;
		if(celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			cambio = valor - celdaEncontrada.getProducto().getPrecio();
			saldo += celdaEncontrada.getProducto().getPrecio();

		}
		return cambio;
	}
}

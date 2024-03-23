package clearminds.cuentas;

public class Cuentas {
	private String id;
	private String tipo = "A";
	private double saldo;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	public Cuentas(String id) {
		this.id = id;
		setTipo("A");		
	}
	public Cuentas(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	public void imprimir() {
		System.out.println("**********************\n");
		System.out.println("CUENTA");
		System.out.println("\n**********************");
		System.out.println("Número de Cuenta: "+getId());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Saldo: "+ getSaldo());
		System.out.println("\n**********************\n");
	}
	
	public void imprimirConMiEstilo() {
	    System.out.println("-------------------------------------------------");
	    System.out.println("|                    CUENTA                     |");
	    System.out.println("-------------------------------------------------");
	    System.out.println("| Número de Cuenta: " + getId());
	    System.out.println("| Tipo: " + getTipo());
	    System.out.println("| Saldo: " + getSaldo());
	    System.out.println("-------------------------------------------------");
	}
	
}

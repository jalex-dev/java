package clearminds.test;

import clearminds.cuentas.Cuentas;

public class TestCuenta {

	public static void main(String[] args) {
		//crea el objeto cuenta y lo referencio con cuenta1
		Cuentas cuenta1 = new Cuentas("03476");
		//coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675);
		//creo el objeto Cuenta y lo referencio cuenta2
		Cuentas cuenta2 = new Cuentas("03476", "C", 98);
		
		Cuentas cuenta3 = new Cuentas("03476");
		cuenta3.setTipo("C");
		System.out.println("-----------Valores Iniciale----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		System.out.println("-----------Valores Modificados----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		Cuentas cuenta4 = new Cuentas("0987");
		cuenta4.setSaldo(10);
		
		Cuentas cuenta5 = new Cuentas("0557","C",10);
		Cuentas cuenta6 = new Cuentas("0666");
		
		System.out.println("********imprimir con mi estilo*******");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		

	}

}

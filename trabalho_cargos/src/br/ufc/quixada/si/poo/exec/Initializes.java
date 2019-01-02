package br.ufc.quixada.si.poo.exec;

import br.ufc.quixada.si.poo.model.Fornecedor;
import br.ufc.quixada.si.poo.model.Administrador;
import br.ufc.quixada.si.poo.model.Operario;
import br.ufc.quixada.si.poo.model.Vendedor;

public class Initializes {
	public static void main(String[] args) {
		
		Administrador primeiroAdministrador = new Administrador("Lucas", "Quixda-CEl", "9090023232", 0001, 1234, 12, 350);
		Fornecedor primeiroFornecedor = new Fornecedor("francisco", "Quixada-CE", "88999032345", 70, 38.99f);
		Operario primeiroOperario = new Operario("Luis", "Fortaleza-CE", "8988908098", 0002, 900, 50, 15, 23);
		Vendedor primeiroVendedor = new Vendedor("Leticia", "Iguatu-CE", "9004324332", 0003, 1200, 30, 20, 100);
		
		System.out.println("Saldo do fornecedor:" + primeiroFornecedor.obterSaldo());
		System.out.println("Salario do Administrador: " + primeiroAdministrador.calcularSalario());
		System.out.println("Salario do Operario: " + primeiroOperario.calcularSalario());
		System.out.println("Salario do Vendor: " + primeiroVendedor.calcularSalario());
		
	}
}

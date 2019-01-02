package br.quixada.ufc.si.poo.exec;

import br.quixada.ufc.si.poo.controll.AreaCritica;
import br.quixada.ufc.si.poo.controll.Consumidor;

public class PrincipalAreaCritica {
	public static void main(String[] args) {
		AreaCritica ac = new AreaCritica();
		Consumidor c1 = new Consumidor(ac, "Pedro", 2000);
		Consumidor c2 = new Consumidor(ac, "João", 2000);
		Consumidor c3 = new Consumidor(ac, "Francisco", 2000);
		
		c1.start();
		c2.start();
		c3.start();
	}
}

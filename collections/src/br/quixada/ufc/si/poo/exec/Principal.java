package br.quixada.ufc.si.poo.exec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
	public static void main(String[] args) {
		
		vetor();
		listaEncadeada();
		arrayList();
		hashSet();
		treeSet();
	}
	
	public static void vetor() {
		int vetor[] = new int[3];
		vetor[0] = 10;
		vetor[1] = 15;
		vetor[2] = 19;
		
		System.out.println("Iteração de vetor com o for");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("Iteração de vetor com o foreach");
		for (int i : vetor) {
			System.out.println(i);
		}
	}
	
	public static void listaEncadeada() {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("lele");
		list.add("erikha");
		list.add("will");
		
		for (String i : list) {
			System.out.println(i);
		}
	}
	
	public static void arrayList() {
		List<String> list = new ArrayList<>();
		
		list.add("lele");
		list.add("erikha");
		list.add("will");
		
		for (String i : list) {
			System.out.println(i);
		}
	}
	
	public static void hashSet() {
		Set<Integer> conjunto = new HashSet<>();
		
		conjunto.add(200);
		conjunto.add(-9);
		conjunto.add(200);
		
		for (int i : conjunto) {
			System.out.println(i);
		}
	}
	
	public static void treeSet() {
		Set<Integer> conjunto = new TreeSet<>();
		
		conjunto.add(200);
		conjunto.add(-9);
		conjunto.add(200);
		
		for (int i : conjunto) {
			System.out.println(i);
		}
	}
}

package com.algaworks.cursojava.financeiro.modelo;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {
		System.out.println("-------------------");
		System.out.println("Relatório de Contas");
		System.out.println("-------------------");
		
		for (Conta conta:contas) {
			conta.exibirDetalhes();
			System.out.println("-------------------");
		}
	}

}

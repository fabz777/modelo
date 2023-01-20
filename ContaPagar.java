package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta {
	
	protected Fornecedor fornecedor;
	
	public ContaPagar() {
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	
	public void pagar() {
		if (situacaoConta.equals(situacaoConta.PENDENTE)) {
			situacaoConta = situacaoConta.PAGA;
			System.out.println("A conta foi paga!");
		} else {
			System.out.println("A conta já esta paga/A conta foi cancelada");
		}
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
	}

}

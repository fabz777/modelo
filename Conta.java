package com.algaworks.cursojava.financeiro.modelo;

public abstract class Conta {
	
	protected SituacaoConta situacaoConta;
	protected String descricao;
	protected double valor;
	protected String dataVencimento;

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
	public Conta() {
		this.situacaoConta = situacaoConta.PENDENTE;
	}
	
	public Conta(Pessoa pessoa, String string, double d, String string2) {
		this.situacaoConta = situacaoConta.PENDENTE;
	}

	public void cancelar() {
		if (situacaoConta.equals(situacaoConta.PENDENTE)) {
			situacaoConta = situacaoConta.CANCELADA;
			System.out.println("A conta foi cancelada!");
		} else {
			System.out.println("A conta já foi paga/A conta já está cancelada");
		}	
	}
	
	public abstract void exibirDetalhes();

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}

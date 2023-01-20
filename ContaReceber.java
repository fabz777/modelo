package com.algaworks.cursojava.financeiro.modelo;

public class ContaReceber extends Conta {
	
	private Cliente cliente;

	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}

	public ContaReceber() {
	}

	public void receber() {
		if (situacaoConta.equals(situacaoConta.PENDENTE)) {
			situacaoConta = situacaoConta.PAGA;
			System.out.println("A conta foi recebida!");
		} else {
			System.out.println("A conta já esta recebida/A conta foi cancelada");
		}
	}
	
	public void cancelar() {
		if (valor < 50000) {
			super.cancelar();
		} else {
			System.out.println("Conta com valor maior de 50 mil, favor somente cancelar "
					+ "contas de valor mais baixo");
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
	}
}

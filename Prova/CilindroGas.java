package Prova;

public class CilindroGas {
	private int idCilindro;
	private String localizacao;
	private double capacidadeMaxima;
	private double capacidadeAtual;
	private double custoKg;
	private double custoAbastecimento;
	private String statusAbastecimento;

	public CilindroGas(int idCilindro, String localizacao, double capacidadeMaxima, double custoKg) {
		this.idCilindro = idCilindro;
		this.localizacao = localizacao;
		this.capacidadeMaxima = capacidadeMaxima;
		this.custoKg = custoKg;
	}

	public void abastecerCilindro(double carga, double custoAbastecimento) {
		carga = capacidadeMaxima - capacidadeAtual;
		this.custoAbastecimento = custoAbastecimento;
		if (capacidadeAtual >= (capacidadeMaxima / 2)) {
			custoKg = custoKg - (custoKg * 5 / 100);
		}
	}

	public boolean registrarConsumo(double qtdeKg) {
		boolean situacao = false;
		capacidadeAtual -= qtdeKg;
		if (qtdeKg > capacidadeAtual) {
			situacao = false;
		} else {
			capacidadeAtual -= qtdeKg;
		}
		return situacao;
	}

	public void esvaziarCilindro() {
		if (capacidadeAtual > 0) {
			do {
				capacidadeAtual = 0;
			} while (capacidadeAtual > 0);

		} else {
			System.out.println("Cilindro já se encontra Vazio");
		}

	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getCustoKg() {
		return custoKg;
	}

	public void setCustoKg(double custoKg) {
		this.custoKg = custoKg;
	}

	public int getIdCilindro() {
		return idCilindro;
	}

	public double getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public double getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public double getCustoAbastecimento() {
		return custoAbastecimento;
	}

	public String getStatusAbastecimento() {
		return statusAbastecimento;
	}

}

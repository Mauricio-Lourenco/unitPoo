package Prova;

public class Cilindro {
	private int idCilindro;
	private String localizacao, statusAbastecimento;
	private double capacidadeMaxima, capacidadeAtual, custoKg, custoAbastecimento;
	
	public Cilindro(int idCilindro, String localizacao, double capacidadeMaxima, double custoKg){
		this.idCilindro = idCilindro;
		this.localizacao = localizacao;
		this.capacidadeMaxima = capacidadeMaxima;
		this.custoKg = custoKg;
		capacidadeAtual = capacidadeMaxima;
		statusAbastecimento = "Cheio";
		abastecerCilindro();
	}
	
	//Gets
	public int getIdCilindro() {
		return idCilindro;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public String getStatusAbastecimento() {
		return statusAbastecimento;
	}
	public double getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public double getCapacidadeAtual() {
		return capacidadeAtual;
	}
	public double getCustoKg() {
		return custoKg;
	}
	public double getCustoAbastecimento() {
		return custoAbastecimento;
	}
	//_____________
	
	//Sets
	public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
	public void setCustoKg(double custoKg) {
        this.custoKg = custoKg;
    }
	//____________
	
	public void abastecerCilindro() {
		capacidadeAtual += capacidadeMaxima - capacidadeAtual;
		double relacao = capacidadeAtual/capacidadeMaxima*100;
		
		if(capacidadeAtual > capacidadeMaxima/2) {
			custoAbastecimento = (custoKg-0.05)*capacidadeAtual;
		} else {
			custoAbastecimento = custoKg*capacidadeAtual;
		}
		
		
		if (relacao >= 90) {
			statusAbastecimento = "Cheio";
			
		} else if (relacao < 90 && relacao >= 70) {
			statusAbastecimento = "Alto";
			
		} else if (relacao < 70 && relacao >= 30) {
			statusAbastecimento = "Medio";
			
		} else if (relacao < 30) {
			statusAbastecimento = "Baixo";
			
		}
	}
	
	public boolean registrarConsumo(double qtdeKg) {
		if(qtdeKg>capacidadeAtual ) {
			return false;
		}
		
		capacidadeAtual -= qtdeKg;
		double relacao = capacidadeAtual/capacidadeMaxima*100;
		if (relacao >= 90) {
			statusAbastecimento = "Cheio";
		} else if (relacao < 90 && relacao >= 70) {
			statusAbastecimento = "Alto";
		} else if (relacao < 70 && relacao >= 30) {
			statusAbastecimento = "Medio";
		} else if (relacao < 30) {
			statusAbastecimento = "Baixo";	
		}
		
		return true;
	}
	
	public void esvaziarCilindro() {
		capacidadeAtual = 0;
		statusAbastecimento = "Vazio";
	}

	
}
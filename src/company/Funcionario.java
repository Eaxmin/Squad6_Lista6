package company;

import java.text.DecimalFormat;

public class Funcionario {
	
	private String nome;
	private int codigoFuncional;
	private int rendaBasica;
	private Comissao cargo;
	
	public Funcionario() {
	}

	public Funcionario(String nome, int codigoFuncional, Comissao cargo) {
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
		this.rendaBasica = 1000;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(int codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}
	
	public double calcularRenda() {
		return switch (this.cargo) {
        case GERENTE -> this.rendaBasica + 1500;
        case SUPERVISOR -> this.rendaBasica + 600;
        case VENDEDOR -> this.rendaBasica + 250;
        default -> this.rendaBasica;
		};
	}
	
	public String toString () {
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return "Nome: " + this.nome + "\nComissão: " + this.cargo + "\nSalário Total: " + decimalFormat.format(this.calcularRenda());
	}
}
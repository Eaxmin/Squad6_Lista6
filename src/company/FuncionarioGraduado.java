package company;

public class FuncionarioGraduado extends Funcionario {
	
	private String universidade;

	public FuncionarioGraduado() {
	}

	public FuncionarioGraduado(String nome, int codigoFuncional, String universidade, Comissao cargo) {
		super(nome, codigoFuncional, cargo);
		this.universidade = universidade;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	
	@Override
	public double calcularRenda() {
		return super.calcularRenda() * 2.6;
	}
}

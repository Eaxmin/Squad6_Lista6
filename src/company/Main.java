package company;

public class Main {

	public static void main(String[] args) {
		
		Funcionario [] empresa = new Funcionario[10];
		
		empresa[0] = new FuncionarioBasico("Carlos", 11, "Escola Primavera", Comissao.GERENTE);
		empresa[1] = new FuncionarioBasico("Ana", 25, "Escola Outono", Comissao.SUPERVISOR);
		empresa[2] = new FuncionarioBasico("João", 30, "Escola Verão", Comissao.SUPERVISOR);
		empresa[3] = new FuncionarioBasico("Mariana", 28, "Escola Inverno", Comissao.VENDEDOR);
		empresa[4] = new FuncionarioMedio("Pedro", 22, "Escola Sol", Comissao.VENDEDOR);
		empresa[5] = new FuncionarioMedio("Sofia", 27, "Escola Lua", Comissao.VENDEDOR);
		empresa[6] = new FuncionarioMedio("Rafael", 33, "Escola Estrela", Comissao.VENDEDOR);
		empresa[7] = new FuncionarioMedio("Camila", 29, "Escola Céu", Comissao.VENDEDOR);
		empresa[8] = new FuncionarioGraduado("Lucas", 24, "Escola Mar", Comissao.VENDEDOR);
		empresa[9] = new FuncionarioGraduado("Laura", 26, "Escola Terra", Comissao.VENDEDOR);
		
		double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario funcionario : empresa) {
            custoTotal += funcionario.calcularRenda();

            if (funcionario instanceof FuncionarioBasico) {
                custoEnsinoBasico += funcionario.calcularRenda();
            } else if (funcionario instanceof FuncionarioMedio) {
                custoEnsinoMedio += funcionario.calcularRenda();
            } else if (funcionario instanceof FuncionarioGraduado) {
                custoGraduacao += funcionario.calcularRenda();
            }
            System.out.println(funcionario);
        }
        System.out.println("Custo total da empresa: " + custoTotal);
        System.out.println("Custo de funcionários com Ensino Básico: " + custoEnsinoBasico);
        System.out.println("Custo de funcionários com Ensino Médio: " + custoEnsinoMedio);
        System.out.println("Custo de funcionários com Graduação: " + custoGraduacao);

	}

}

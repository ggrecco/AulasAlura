
public class TesteReferencia {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setSalario(5000.0);

//		g1.setCpf("223342513");
		
		System.out.println(g1.getNome());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
	}

}


public class TesteReferencia {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setSalario(1000.0);

		EditorVideo ev = new EditorVideo();
		ev.setSalario(500);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}

}

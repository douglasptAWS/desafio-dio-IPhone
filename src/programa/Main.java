package programa;

import aparelho.IPhone;

public class Main {
	
	public static void main(String[] args) {
		
		IPhone iPhone = new IPhone();
		
		System.out.println("==== INICIAR REPRODUTOR MUSICAL ====");
		
		boolean tocando = iPhone.tocar(iPhone.selecionarMusica("One love"));
		iPhone.pausar(tocando);
		
		System.out.println("==== INICIAR APARELHO TELEFONICO ====");
		
		iPhone.ligar("11 96666-7188");
		
		System.out.println("==== INICIAR NAVEGADOR ====");
		
		iPhone.exibirPagina("https://web.dio.me");
		iPhone.adicionarNovaAba();
		iPhone.atualizarPagina();
		
		
	}

}

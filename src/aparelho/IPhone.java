package aparelho;

import java.util.Random;

import funcoes.AparelhoTelefonico;
import funcoes.Navegador;
import funcoes.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador{

	@Override
	public void exibirPagina(String url) {
		System.out.println("PAGINA "+url+" EXIBIDA");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("PAGINA ATUALIZADA");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA O Nº "+numero);
		if (atender()) {
			System.out.println("LIGAÇÃO ATENDIDA");
		} else {
			iniciarCorreioVoz();
		}	
	}

	@Override
	public boolean atender() {
		return new Random().nextInt(3)==1; 
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("LIGAÇÃO NÃO ATENDIDA, DEIXE SEU RECADO NO CORREIO DE VOZ");
		
	}

	@Override
	public boolean tocar(boolean musicaSelecionada) {
		if (musicaSelecionada) {
			System.out.println("TOCANDO MUSICA");
		} else {
			System.out.println("SELECIONE UMA MUSICA PARA TOCAR");
		}
		return musicaSelecionada;
		
	}

	@Override
	public boolean pausar(boolean tocando) {
		if (tocando) {
			System.out.println("PAUSANDO MUSICA");
		} else {
			System.out.println("DESPAUSANDO MUSICA");
		}
		return !tocando;
	}

	@Override
	public boolean selecionarMusica(String musica) {
		if (musica.isEmpty()) {
			System.out.println("MUSICA DEVE SER SELECIONADA");
			return false;
		} else {
			System.out.println("MUSICA "+musica+" SELECIONADA");
			return true;
			
		}
		
	}
	
	

}

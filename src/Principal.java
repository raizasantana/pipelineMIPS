import Arquivos.InstrucoesArquivo;


public class Principal {

	public static void main(String[] args) {
		
		MemoriaDados MD = new MemoriaDados();
		MD.setInstrucoes(InstrucoesArquivo.getInstrucoesArquivo("p-arquivos/teste.txt"));
		
		

	}

}

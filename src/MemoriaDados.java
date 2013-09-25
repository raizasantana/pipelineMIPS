import java.util.ArrayList;
import java.util.HashMap;


public class MemoriaDados {

	private ArrayList<String> instrucoes = new ArrayList<String>();
	private HashMap<String, String> dados = new HashMap<String, String>();
	
	public String getInstrucao(int linha){
		return instrucoes.get(linha);
	}
	public void Memory(String offset, String dado){
		
	}
	
	// G&S
	
	public ArrayList<String> getInstrucoes() {
		return instrucoes;
	}

	public HashMap<String, String> getDados() {
		return dados;
	}


	public void setDados(HashMap<String, String> dados) {
		this.dados = dados;
	}


	public void setInstrucoes(ArrayList<String> instrucoes) {
		this.instrucoes = instrucoes;
	}
	
	
	
	 

}

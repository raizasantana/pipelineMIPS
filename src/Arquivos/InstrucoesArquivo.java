package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InstrucoesArquivo {

	public static ArrayList<String> getInstrucoesArquivo(String nome) {
		ArrayList<String> inst = new ArrayList<String>();
		int i = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(nome));

			while (br.ready()) {
				inst.add(br.readLine());
				System.out.println(inst.get(i));
				i++;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inst;
	}
	
	

}

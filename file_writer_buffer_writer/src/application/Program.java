package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Workspaces\\ws-eclipse\\CursoJava\\file_writer_buffer_writer\\out.txt";
	
		//o parametro true do FileWriter é opcional, sem ele o arquivo será criado
		//ou reescrito, com ele será adicionado novos itens no arquivo já existente
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

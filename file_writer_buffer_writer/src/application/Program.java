package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Workspaces\\ws-eclipse\\CursoJava\\file_writer_buffer_writer\\out.txt";
	
		//o parametro true do FileWriter � opcional, sem ele o arquivo ser� criado
		//ou reescrito, com ele ser� adicionado novos itens no arquivo j� existente
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

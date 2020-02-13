package ExercícioArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class ExercicioArquivos {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			String path = "C:\\Users\\thales.r.monteiro\\eclipse-workspace\\in\\summary.csv";
			File pathFile = new File(path);
			File pathFolder = new File (pathFile.getParent());
			
			try (BufferedReader br = (new BufferedReader(new FileReader(path))); 
					BufferedWriter bw = (new BufferedWriter(new FileWriter(pathFolder.getParent() + "\\out\\summary.csv")))){
				
				String line = br.readLine();
				List<Product> productList = new ArrayList<>();

				while (line != null) {
					String[] lineList = line.split(";");
					double price = Double.parseDouble(lineList[1]);
					int quantity = Integer.parseInt(lineList[2]);
					Product product = new Product(lineList[0], price, quantity);
					
					line = br.readLine();
					productList.add(product);
				}
				
				for (Product product : productList) {
					bw.write(product.getName()+";"+String.format("%.2f",product.totalValueInStock()));
					bw.newLine();
				}
				System.out.println("Success!");
			}
			catch (IOException exception) {
				System.out.println("Error: " + exception.getMessage());
				exception.printStackTrace();
			}
			catch (RuntimeException exception) {
				System.out.println("Error: " + exception.getMessage());
				exception.printStackTrace();
			}
	}
}

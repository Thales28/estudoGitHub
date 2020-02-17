package ExercícioMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExercicioMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		
		String path = sc.nextLine();
		Map<String, Integer> map = new TreeMap<>();
		
		try (BufferedReader br = (new BufferedReader(new FileReader(path)))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] lineList = line.split(",");
				String name = lineList[0];
				Integer votes = Integer.parseInt(lineList[1]);
				
				if(map.containsKey(name)) {
					Integer number = map.get(name);
					map.put(name, votes + number);
				}
				else{
					map.put(name, votes);
				}
				line = br.readLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		sc.close();
	}
}
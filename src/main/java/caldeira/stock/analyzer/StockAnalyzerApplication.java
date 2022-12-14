package caldeira.stock.analyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class StockAnalyzerApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite o codigo da ação que deseja pesquisar:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String stock = reader.readLine();

		if(isValid(stock)){
		System.out.printf("Codigo %s aceito", stock);}

		//SpringApplication.run(StockAnalyzerApplication.class, args);
	}
	private static Boolean isValid(String stock){
		return !stock.trim().isEmpty();
	}

}

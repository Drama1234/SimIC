import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class printText {
	String a = "Stelios";
	String po = "maria";
	String[] args;

	public printText(String var1) {
		this.a = var1;
	}

	public printText() {
		this.a = "Stelios";
	}

	public void setPrintString(String var1) {
		this.a = var1;

		try {
			BufferedWriter var2 = new BufferedWriter(new FileWriter("out.txt", true));
			var2.newLine();
			var2.append(this.a);
			var2.close();
			var2.close();
		} catch (Exception var3) {
			System.err.println("Error: " + var3.getMessage());
		}

	}

	public String getString() {
		return this.a;
	}

	public void erasor(boolean var1) {
		try {
			PrintWriter var2 = new PrintWriter("out.txt");
			var2.println("--------------ICMS by Stelios--------------");
			new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date var4 = new Date();
			var2.println(var4);
			var2.close();
		} catch (Exception var5) {
			System.out.println(" ");
		}

	}
}
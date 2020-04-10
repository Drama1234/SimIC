import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OutputUserRequirements {
	FileOutputStream outputFile = null;
	PrintStream p;
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();

	public OutputUserRequirements(String var1, String var2, String var3, String var4, String var5, String var6,
			String var7, String var8, String var9, String var10, String var11, String var12, int var13, int var14,
			String var15) {
		try {
			this.outputFile = new FileOutputStream("profiles/" + var15 + ".txt");
			this.p = new PrintStream(this.outputFile);
			this.p.println(this.date);
			this.p.println("Username: " + var1);
			this.p.println("User: " + var2);
			this.p.println("OS: " + var3);
			this.p.println("CPU: " + var4);
			this.p.println("CPUCores: " + var5);
			this.p.println("Memory: " + var6);
			this.p.println("Storage: " + var7);
			this.p.println("BW: " + var8);
			this.p.println("Instructions: " + var10);
			this.p.println("CPI: " + var11);
			this.p.println("Hours: " + var12);
			this.p.println("Mips: " + var13);
			this.p.println("Jobs: " + var14);
		} catch (FileNotFoundException var17) {
			var17.printStackTrace(System.err);
		}

	}
}
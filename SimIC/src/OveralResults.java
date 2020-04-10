import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class OveralResults {
	FileOutputStream outputFile = null;
	String v1;
	String v2;
	String v3;
	String v4;
	String v5;
	String v6;
	String v7;
	String v8;
	String v9;
	String v10;
	String v11;
	String v12;
	String v13;
	String v14;
	Vector v = new Vector();
	int vsize;
	PrintStream p;
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();

	public OveralResults(String var1, String var2, String var3) {
		FileInputStream var4;
		DataInputStream var5;
		BufferedReader var6;
		String var7;
		Iterator var8;
		try {
			var4 = new FileInputStream("Results/" + var1);
			var5 = new DataInputStream(var4);

			for (var6 = new BufferedReader(new InputStreamReader(var5)); (var7 = var6.readLine()) != null; var8 = this.v
					.iterator()) {
				this.v.add(var7);
			}

			var5.close();
			this.vsize = this.v.size();
			this.v1 = (String) this.v.get(2);
		} catch (Exception var11) {
			System.err.println("ErrorOpenHosts: " + var11.getMessage());
		}

		try {
			var4 = new FileInputStream("Results/" + var2);
			var5 = new DataInputStream(var4);

			for (var6 = new BufferedReader(new InputStreamReader(var5)); (var7 = var6.readLine()) != null; var8 = this.v
					.iterator()) {
				this.v.add(var7);
			}

			var5.close();
			this.vsize = this.v.size();
			this.v12 = (String) this.v.get(2);
		} catch (Exception var10) {
			System.err.println("ErrorOpenHosts: " + var10.getMessage());
		}

		try {
			this.outputFile = new FileOutputStream("Results/" + var3 + ".txt");
			this.p = new PrintStream(this.outputFile);
			this.p.println(this.date);
			this.p.println(this.v1);
			this.p.println(this.v2);
		} catch (FileNotFoundException var9) {
			var9.printStackTrace(System.err);
		}

	}
}
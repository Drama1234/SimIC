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

public class OverallResults {
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
	Vector vv1 = new Vector();
	Vector vv2 = new Vector();
	int vsize;
	PrintStream p;
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();

	public OverallResults(String var1, String var2, String var3) {
		FileInputStream var4;
		DataInputStream var5;
		BufferedReader var6;
		String var7;
		Iterator var8;
		try {
			var4 = new FileInputStream("Results/" + var1);
			var5 = new DataInputStream(var4);

			for (var6 = new BufferedReader(
					new InputStreamReader(var5)); (var7 = var6.readLine()) != null; var8 = this.vv1.iterator()) {
				this.vv1.add(var7);
			}

			var5.close();
			this.vsize = this.vv1.size();
			this.v1 = (String) this.vv1.get(2);
			this.v5 = (String) this.vv1.get(3);
			this.v7 = (String) this.vv1.get(4);
			SplitterSpace var17 = new SplitterSpace(this.v1);
			var17.setString(this.v1);
			this.v3 = var17.getValue();
			SplitterSpace var9 = new SplitterSpace(this.v5);
			var9.setString(this.v5);
			this.v6 = var9.getValue();
			SplitterSpace var10 = new SplitterSpace(this.v7);
			var10.setString(this.v7);
			this.v8 = var10.getValue();
		} catch (Exception var13) {
			System.err.println("ErrorOpenHosts: " + var13.getMessage());
		}

		try {
			var4 = new FileInputStream("Results/" + var2);
			var5 = new DataInputStream(var4);

			for (var6 = new BufferedReader(
					new InputStreamReader(var5)); (var7 = var6.readLine()) != null; var8 = this.vv2.iterator()) {
				this.vv2.add(var7);
			}

			var5.close();
			this.vsize = this.vv2.size();
			this.v2 = (String) this.vv2.get(2);
			this.v9 = (String) this.vv2.get(3);
			this.v10 = (String) this.vv2.get(4);
		} catch (Exception var12) {
			System.err.println("ErrorOpenHosts: " + var12.getMessage());
		}

		SplitterSpace var14 = new SplitterSpace(this.v2);
		var14.setString(this.v2);
		this.v4 = var14.getValue();
		SplitterSpace var15 = new SplitterSpace(this.v2);
		var15.setString(this.v2);
		this.v11 = var15.getValue();
		SplitterSpace var16 = new SplitterSpace(this.v2);
		var16.setString(this.v2);
		this.v12 = var16.getValue();

		try {
			this.outputFile = new FileOutputStream("Results/" + var3 + ".txt");
			this.p = new PrintStream(this.outputFile);
			this.p.println(this.date);
			this.p.println(this.v1 + "-" + this.v3);
			this.p.println(this.v5 + "-" + this.v6);
			this.p.println(this.v7 + "-" + this.v8);
			this.p.println("-----------------");
			this.p.println(this.v2 + "-" + this.v4);
			this.p.println(this.v9 + "-" + this.v11);
			this.p.println(this.v10 + "-" + this.v12);
		} catch (FileNotFoundException var11) {
			var11.printStackTrace(System.err);
		}

	}
}
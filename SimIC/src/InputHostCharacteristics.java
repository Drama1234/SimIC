import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;

public class InputHostCharacteristics {
	String f;
	Vector v = new Vector();

	public InputHostCharacteristics(String var1) {
		var1 = "HostCharacteristicsFile.txt";

		try {
			FileInputStream var2 = new FileInputStream(var1);
			DataInputStream var3 = new DataInputStream(var2);
			BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));

			String var5;
			while ((var5 = var4.readLine()) != null) {
				this.v.add(var5);
				Iterator var6 = this.v.iterator();
				System.out.println(this.v);
			}

			var3.close();
		} catch (Exception var7) {
			System.err.println("Error: " + var7.getMessage());
		}

	}

	public Vector getFile() {
		return this.v;
	}
}
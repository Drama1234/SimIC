import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;

public class OpenHostsList {
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

	public OpenHostsList(String var1) {
		try {
			FileInputStream var2 = new FileInputStream("HostList/" + var1);
			DataInputStream var3 = new DataInputStream(var2);

			String var5;
			Iterator var6;
			for (BufferedReader var4 = new BufferedReader(
					new InputStreamReader(var3)); (var5 = var4.readLine()) != null; var6 = this.v.iterator()) {
				this.v.add(var5);
			}

			var3.close();
			this.vsize = this.v.size();
			SplitterSpace var11;
			if (this.vsize == 1) {
				this.v1 = (String) this.v.get(0);
				var11 = new SplitterSpace(this.v1);
				var11.setString(this.v1);
				this.v1 = var11.getValue();
			}

			SplitterSpace var7;
			if (this.vsize == 2) {
				this.v1 = (String) this.v.get(0);
				this.v2 = (String) this.v.get(1);
				var11 = new SplitterSpace(this.v1);
				var11.setString(this.v1);
				this.v1 = var11.getValue();
				var7 = new SplitterSpace(this.v2);
				var7.setString(this.v2);
				this.v2 = var7.getValue();
			}

			SplitterSpace var8;
			if (this.vsize == 3) {
				this.v1 = (String) this.v.get(0);
				this.v2 = (String) this.v.get(1);
				this.v3 = (String) this.v.get(2);
				var11 = new SplitterSpace(this.v1);
				var11.setString(this.v1);
				this.v1 = var11.getValue();
				var7 = new SplitterSpace(this.v2);
				var7.setString(this.v2);
				this.v2 = var7.getValue();
				var8 = new SplitterSpace(this.v3);
				var8.setString(this.v3);
				this.v3 = var8.getValue();
			}

			if (this.vsize == 4) {
				this.v1 = (String) this.v.get(0);
				this.v2 = (String) this.v.get(1);
				this.v3 = (String) this.v.get(2);
				this.v4 = (String) this.v.get(3);
				var11 = new SplitterSpace(this.v1);
				var11.setString(this.v1);
				this.v1 = var11.getValue();
				var7 = new SplitterSpace(this.v2);
				var7.setString(this.v2);
				this.v2 = var7.getValue();
				var8 = new SplitterSpace(this.v3);
				var8.setString(this.v3);
				this.v3 = var8.getValue();
				SplitterSpace var9 = new SplitterSpace(this.v4);
				var9.setString(this.v4);
				this.v4 = var9.getValue();
			}
		} catch (Exception var10) {
			System.err.println("Error: " + var10.getMessage());
		}

	}

	public Vector getFile() {
		return this.v;
	}

	public int getFileSize() {
		return this.vsize;
	}

	public String getCPU() {
		return this.v3;
	}
}
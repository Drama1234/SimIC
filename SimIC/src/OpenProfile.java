import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;

public class OpenProfile {
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

	public OpenProfile(String var1) {
		try {
			FileInputStream var2 = new FileInputStream("profiles/" + var1);
			DataInputStream var3 = new DataInputStream(var2);

			String var5;
			Iterator var6;
			for (BufferedReader var4 = new BufferedReader(
					new InputStreamReader(var3)); (var5 = var4.readLine()) != null; var6 = this.v.iterator()) {
				this.v.add(var5);
			}

			var3.close();
			this.vsize = this.v.size();
			this.v1 = (String) this.v.get(0);
			this.v2 = (String) this.v.get(1);
			this.v3 = (String) this.v.get(2);
			this.v4 = (String) this.v.get(3);
			this.v5 = (String) this.v.get(4);
			this.v6 = (String) this.v.get(5);
			this.v7 = (String) this.v.get(6);
			this.v8 = (String) this.v.get(7);
			this.v9 = (String) this.v.get(8);
			this.v10 = (String) this.v.get(9);
			this.v11 = (String) this.v.get(10);
			this.v12 = (String) this.v.get(11);
			this.v13 = (String) this.v.get(12);
			this.v14 = (String) this.v.get(13);
			SplitterSpace var21 = new SplitterSpace(this.v1);
			var21.setString(this.v1);
			this.v1 = var21.getValue();
			SplitterSpace var7 = new SplitterSpace(this.v2);
			var7.setString(this.v2);
			this.v2 = var7.getValue();
			SplitterSpace var8 = new SplitterSpace(this.v3);
			var8.setString(this.v3);
			this.v3 = var8.getValue();
			SplitterSpace var9 = new SplitterSpace(this.v4);
			var9.setString(this.v4);
			this.v4 = var9.getValue();
			SplitterSpace var10 = new SplitterSpace(this.v5);
			var10.setString(this.v5);
			this.v5 = var10.getValue();
			SplitterSpace var11 = new SplitterSpace(this.v6);
			var11.setString(this.v6);
			this.v6 = var11.getValue();
			SplitterSpace var12 = new SplitterSpace(this.v7);
			var12.setString(this.v7);
			this.v7 = var12.getValue();
			SplitterSpace var13 = new SplitterSpace(this.v8);
			var13.setString(this.v8);
			this.v8 = var13.getValue();
			SplitterSpace var14 = new SplitterSpace(this.v9);
			var14.setString(this.v9);
			this.v9 = var14.getValue();
			SplitterSpace var15 = new SplitterSpace(this.v10);
			var15.setString(this.v10);
			this.v10 = var15.getValue();
			SplitterSpace var16 = new SplitterSpace(this.v11);
			var16.setString(this.v11);
			this.v11 = var16.getValue();
			SplitterSpace var17 = new SplitterSpace(this.v12);
			var17.setString(this.v12);
			this.v12 = var17.getValue();
			SplitterSpace var18 = new SplitterSpace(this.v13);
			var18.setString(this.v13);
			this.v13 = var18.getValue();
			SplitterSpace var19 = new SplitterSpace(this.v14);
			var19.setString(this.v14);
			this.v14 = var19.getValue();
		} catch (Exception var20) {
			System.err.println("Error: " + var20.getMessage());
		}

	}

	public Vector getFile() {
		return this.v;
	}

	public int getFileSize() {
		return this.vsize;
	}

	public String getDate() {
		return this.v1;
	}

	public String getUsername() {
		return this.v2;
	}

	public String getUser() {
		return this.v3;
	}

	public String getOS() {
		return this.v4;
	}

	public String getCPU() {
		return this.v5;
	}

	public String getCPUCores() {
		return this.v6;
	}

	public String getMemory() {
		return this.v7;
	}

	public String getStorage() {
		return this.v8;
	}

	public String getBW() {
		return this.v9;
	}

	public String getInstructions() {
		return this.v10;
	}

	public String getCPI() {
		return this.v11;
	}

	public String getHours() {
		return this.v12;
	}

	public String getMips() {
		return this.v13;
	}

	public String getJobsNumber() {
		return this.v14;
	}
}
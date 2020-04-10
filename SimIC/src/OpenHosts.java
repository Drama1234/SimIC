import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;

public class OpenHosts {
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

	public OpenHosts(String var1) {
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
			this.v1 = (String) this.v.get(0);
			this.v2 = (String) this.v.get(1);
			this.v3 = (String) this.v.get(2);
			this.v4 = (String) this.v.get(3);
			this.v5 = (String) this.v.get(4);
			this.v6 = (String) this.v.get(5);
			this.v7 = (String) this.v.get(6);
			this.v8 = (String) this.v.get(7);
			this.v9 = (String) this.v.get(8);
			SplitterSpace var16 = new SplitterSpace(this.v1);
			var16.setString(this.v1);
			this.v1 = var16.getValue();
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
		} catch (Exception var15) {
			System.err.println("ErrorOpenHosts: " + var15.getMessage());
		}

	}

	public Vector getFile() {
		return this.v;
	}

	public int getFileSize() {
		return this.vsize;
	}

	public String getHostName() {
		return this.v1;
	}

	public String getHostOS() {
		return this.v2;
	}

	public String getHostPlatform() {
		return this.v3;
	}

	public String getHostMemory() {
		return this.v4;
	}

	public String getHostCPUCores() {
		return this.v5;
	}

	public String getHostCPUSpeed() {
		return this.v6;
	}

	public String getHostHDController() {
		return this.v7;
	}

	public String getHostStorage() {
		return this.v8;
	}

	public String getHostBW() {
		return this.v9;
	}
}
import eduni.simjava.Sim_entity;
import eduni.simjava.Sim_event;
import eduni.simjava.Sim_port;
import eduni.simjava.Sim_stat;
import eduni.simjava.Sim_system;

class Metabroker extends Sim_entity {
	private Sim_port in;
	private Sim_port out1;
	private Sim_port out2;
	private Sim_port out3;
	private double d;
	private double hold;
	private double totalDelay = 0.0D;
	public int j;
	public int i;
	public int z;
	public int mbrnum;
	public int tlmbr = 0;
	public boolean flag = true;
	Sim_stat stat;
	public String n;
	public String po;
	public String text;
	public String a;
	public String b;
	public String f;
	public String g;
	public String form;
	public String getId;
	public String getDelay = null;

	Metabroker(String var1, double var2, int var4, boolean var5, double var6, int var8, int var9) {
		super(var1);
		this.n = var1;
		this.d = var2;
		this.j = var4;
		this.flag = var5;
		this.hold = var6;
		this.mbrnum = var8;
		this.tlmbr = var9;
		this.in = new Sim_port("In");
		this.add_port(this.in);
		this.out1 = new Sim_port("Out1");
		this.add_port(this.out1);
		this.out2 = new Sim_port("Out2");
		this.add_port(this.out2);
		this.out3 = new Sim_port("Out3");
		this.add_port(this.out3);
		this.stat = new Sim_stat();
		this.stat.add_measure(1);
		this.stat.add_measure(5);
		this.stat.add_measure(3);
		this.set_stat(this.stat);
	}

	public void body() {
		printText var1 = new printText();
		Object var2 = null;
		Splitter var3 = new Splitter();

		while (Sim_system.running()) {
			Sim_event var4 = new Sim_event();
			this.sim_hold(this.hold);
			this.sim_get_next(var4);
			this.sim_process(this.d);
			this.sim_completed(var4);
			var2 = var4.get_data();
			if (var2 != null) {
				this.a = var2.toString();
				var3.setString(this.a);
				this.a = var3.getDelay();
				this.b = var3.getSpec();
				this.f = var3.getMid();
				this.g = var3.getUsername();
				this.totalDelay = Double.parseDouble(this.a) + this.d + this.hold;
				if (var4.get_tag() == 0) {
					this.form = var3.getId() + "/" + this.totalDelay + "/" + this.n + "/" + this.b + "/" + this.f + "/"
							+ this.g;
					this.sim_schedule(this.out1, 0.0D, 1, this.form);
					this.text = "2: Job " + var3.getId() + " came from " + var3.getMetabroker() + " at "
							+ var4.event_time() + " is now in " + this.n + " ,for " + this.d + "ms. scheduled in "
							+ this.out1.get_dest_ename();
					var1.setPrintString(this.text);
					var1.getString();
				}

				if (var4.get_tag() == 2) {
					this.form = var3.getId() + "/" + this.totalDelay + "/" + this.n + "/" + this.b + "/" + this.f + "/"
							+ this.g;
					this.sim_schedule(this.out2, 0.0D, 3, this.form);
					this.text = "2: Job " + var3.getId() + " came from " + var3.getMetabroker() + " at "
							+ var4.event_time() + " is now in " + this.n + " ,for " + this.d + "ms. scheduled in "
							+ this.out2.get_dest_ename();
					var1.setPrintString(this.text);
					var1.getString();
				}

				if (var4.get_tag() == 3) {
					this.form = var3.getId() + "/" + this.totalDelay + "/" + this.n + "/" + this.b + "/" + this.f + "/"
							+ this.g;
					if (Integer.parseInt(this.f) == this.get_id()) {
						this.sim_schedule(this.out3, 0.0D, 4, this.form);
						this.text = "2: Job " + var3.getId() + " came from " + var3.getMetabroker() + " at "
								+ var4.event_time() + " is now in " + this.n + " ,for " + this.d + "ms. scheduled in "
								+ this.out3.get_dest_ename();
					} else {
						this.sim_schedule(this.out1, 0.0D, 0, this.form);
						this.text = "2: Job " + var3.getId() + " came from " + var3.getMetabroker() + " at "
								+ var4.event_time() + " is now in " + this.n + " ,for " + this.d + "ms. scheduled in "
								+ this.out1.get_dest_ename();
					}

					var1.setPrintString(this.text);
					var1.getString();
				}

				++this.i;
			}
		}

	}

	public int getCount() {
		return this.i;
	}
}
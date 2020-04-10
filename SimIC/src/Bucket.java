
import eduni.simjava.Sim_port;
import eduni.simjava.Sim_system;
import eduni.simjava.Sim_event;
import eduni.simjava.Sim_stat;
import eduni.simjava.distributions.Sim_negexp_obj;
import eduni.simanim.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import eduni.simanim.*;
import eduni.simjava.*;

// A bucket, simply keeps a count of how many messages it recieves
class Bucket extends Sim_entity {
  int count = 0;
  Sim_port in;
  String a,b,f,totalDelay,form,data = null;

  public Bucket(String name) {
    super(name);
    count = 0;
    in = new Sim_port("In"); add_port(in);
 //   add_param(new Anim_param("Count", Anim_param.NAME_VALUE, "0", -10, -5));
  }
  public void body() {
while (Sim_system.running()) {
            Sim_event e = new Sim_event();
         
            sim_get_next(e);

      count++;

    }
    count = count-1;
    System.out.println(get_name() +": "+ count);
  }	
}

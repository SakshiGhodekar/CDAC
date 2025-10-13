package Vehicle_Assig;
import java.util.Date;

public class Vehicle {
	private int v_id;
	private String v_name;
	private String v_type;
	private Date dop;

	public Vehicle() {
		v_id=0;
		v_name=null;
		v_type=null;
		dop=null;
	}
	public Vehicle(int v_id,String v_name, String v_type,Date dop) {
		this.v_id=v_id;
		this.v_name=v_name;
		this.v_type=v_type;
		this.dop=dop;
	}
	public void setvId(int v_id) {
		this.v_id=v_id;
		
	}
	public void setvname(String v_name) {
		this.v_name=v_name;
	}
	public void setvtype(String v_type) {
		this.v_type=v_type;
	}
	public void setdop(Date dop) {
		this.dop=dop;
	}
	public int getvid() {
		return v_id;
		
	}
	public String getvname() {
		return v_name;
		
	}
	public String getvtype() {
		return v_type;
	}
	public Date getvdop() {
		return dop;
	}
	public String toString() {
		return( "Vehicle id: "+v_id+ "Vehicleoname: " +v_name+ "Vehicle Type: " +v_type+ "Date of purchase: " +dop);
	}
}


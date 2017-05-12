package labs;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class Order implements Serializable{
	
	private Integer customerID;
	private String name;
	
	public Order() {
		super();
		this.customerID = 696969;
		this.name = "rando_name";
	}
	
	public Order(Integer customerID, String name) {
		super();
		this.customerID = customerID;
		this.name = name;
	}

	public void writeText() {
		try {
			
		PrintWriter pw = new PrintWriter(new FileWriter("order.txt"));
	
		pw.println("Customer ID: " + customerID + " Name: " + name);
		
		pw.close();

		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	public void writeBinary() {
		try {
			
			FileOutputStream fos = new FileOutputStream(fos);
			DataOutputStream dos = new DataOutputStream("order.txt");
			
			dos.writeUTF("\n" + name);
			
			dos.close();
			
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
}

package com.hcl.ebox;

public class EboxCustomer {
	public String name;
    public String email;
    public String type;
    public String address;
    
    EboxCustomer(String name,String email,String type,String address)
    {
        this.name=name;
        this.email=email;
        this.type=type;
        this.address=address;
    }
	public void displayDetails(){
          System.out.println("Name: "+name);
          System.out.println("E-mail: "+email);
          System.out.println("Type: "+type);
          System.out.println("Location: "+address);
	

	}
	
}



	//public static void main(String[] args) {
		// TODO Auto-generated method stub


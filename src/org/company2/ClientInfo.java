package org.company2;


import org.company.Company;

public class ClientInfo extends Company {
	
	private static final String C = null;


	private void Client(String A) {
		// TODO Auto-generated method stub
		
		System.out.println("my client name is:"+A);

	}
	
	private void Companysal(String b,float c) {
		// TODO Auto-generated method stub
		
		System.out.println(b+c);

	}
	

	public static void main(String[] args) {
		
		ClientInfo cl = new ClientInfo();
		
		cl.Client("Anthem");
		cl.Office(10967742);
		cl.Companysal("Company provides daily basis salary and it is:", 253.43f);
	
		
	}
}

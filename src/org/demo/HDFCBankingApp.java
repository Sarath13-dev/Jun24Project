package org.demo;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

//POJO Class - Encapsulation
public class HDFCBankingApp {
	
	Map<String, Integer> m;

	//Data Members - private variables
	//Database -  no of Column = no of Data members
	//Datatype of column = datatype of varibales
	//Columnname = variblename
	private String username;
	
	private String password;
	
	private int balance;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username.equals("Ravi")) {
			this.username="Ravi Account";
		}
		else if(username.equals("Babu")) {
			this.username="Babu Account";
		}
		else if(username.equals("Anand")) {
			this.username="Anand Account";
		}
		else {
			this.username="Invalid Account";
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.equals("Ravi@101") && username.equals("Ravi Account")) {
			this.password="Ravi Account is Validated";
		}
		else if(password.equals("Babu@102") && username.equals("Babu Account")) {
			this.password="Babu Account is Validated";
		}
		else if(password.equals("Anand@103") && username.equals("Anand Account")) {
			this.password="Anand Account is Validated";
		}
		else {
			this.password="InValid Account";
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(this.password.equals(entry.getKey())){
				this.balance= entry.getValue();
			}
		}
	}
	
	public void readDataFromDb() throws IOException {
		File f = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\Day11\\test\\resources\\hdfcdata.txt");
		List<String> readLines = FileUtils.readLines(f);
		m = new LinkedHashMap();
		String string = readLines.get(0);
		String[] split = string.split(",");//{"Ravi", "Ravi@101", 10000}
		m.put("Ravi Account is Validated", Integer.parseInt(split[2]));
		String string2 = readLines.get(1);
		String[] split2 = string2.split(",");
		m.put("Babu Account is Validated", Integer.parseInt(split2[2]));
		String string3 = readLines.get(2);
		String[] split3 = string3.split(",");
		m.put("Anand Account is Validated", Integer.parseInt(split3[2]));
	}
	
	
	
	
	
	
}

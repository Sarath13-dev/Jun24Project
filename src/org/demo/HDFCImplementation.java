package org.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HDFCImplementation {
	
	public static void main(String[] args) throws IOException {
		
		HDFCBankingApp h = new HDFCBankingApp();
		h.readDataFromDb();
		h.setUsername("Ravi");
		h.setPassword("Ravi@101");
		
		HDFCBankingApp h1 = new HDFCBankingApp();
		h1.readDataFromDb();
		h1.setUsername("Babu");
		h1.setPassword("Babu@102");
		
		HDFCBankingApp h2 = new HDFCBankingApp();
		h2.readDataFromDb();
		h2.setUsername("Anand");
		h2.setPassword("Anand@103");
		
		HDFCBankingApp h3 = new HDFCBankingApp();
		h3.readDataFromDb();
		h3.setUsername("Babu");
		h3.setPassword("Babu@105");
		
		//User defined List, Set, Map
		//List - Generics - Wrapper class - Pre defined Wrapper class - Pre defined List
		//List - Generics - Wrapper class - User defined Wrapper class - User defined List
		List<HDFCBankingApp> li = new ArrayList();
		li.add(h);
		li.add(h1);
		li.add(h2);
		li.add(h3);
		
		System.out.println("=======User defined List==========");
		for(int i=0; i<li.size(); i++) {
			HDFCBankingApp hdfcBankingApp = li.get(i);
			hdfcBankingApp.setBalance(1);
			System.out.println(hdfcBankingApp.getBalance());
		}
		
		System.out.println("=======User defined Set========");
		Set<HDFCBankingApp> si = new LinkedHashSet();
		si.add(h);
		si.add(h1);
		si.add(h2);
		si.add(h3);
		
		for(HDFCBankingApp s1: si) {
			s1.setBalance(1);
			System.out.println(s1.getBalance());
		}
		
		System.out.println("=======User defined Map=======");
		Map<Integer, HDFCBankingApp> m = new LinkedHashMap();
		m.put(10, h);
		m.put(20, h1);
		m.put(30, h2);
		m.put(40, h3);
		
		Collection<HDFCBankingApp> values = m.values();
		for(HDFCBankingApp s1: values) {
			s1.setBalance(1);
			System.out.println(s1.getBalance());
		}
	}

}

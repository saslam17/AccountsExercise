package src.main.java.accountsG.accountsA;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Service {
	static int count = 1;
	
	HashMap<Integer, Account> dataBase = new HashMap<Integer, Account>();
	
	public HashMap<Integer, Account> addAccount(String firstName, String lastName, String accountNumber) {
		
		Account account = new Account(firstName, lastName, accountNumber);
		dataBase.put(count, account);
		count++;
		
		return dataBase;
	}
	
	public void getAccount(Account account) {
		account.toString();
	}
	
	
	
	public void showMap() {
        Set<Entry<Integer, Account>> hashSet = dataBase.entrySet();
        for(Entry entry:hashSet ) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
	}
	
	public void showEntry(int num) {
        Set<Entry<Integer, Account>> hashSet=dataBase.entrySet();
        for(Entry entry:hashSet ) {
        	int key = (Integer) entry.getKey();
	        	if(key == num) {
	        		System.out.println(entry.getKey()+ ", " + entry.getValue());
	        	}
        }
	}
	
	public int search(String firstName, HashMap<Integer, Account> db) {
		int count = 0;
		for(Account account : db.values()) {
			if (account.getFirstName().equals(firstName)) {
				count++;
			}
		}
		System.out.println("count: "+count);
		return count;
	}
	
	public int streamSearch(String firstName, HashMap<Integer, Account> db) {

			int count = (int) db.values().stream()
					.filter(account -> account.getFirstName().equals(firstName))
					.count();
			
			
			
			System.out.println("Stream Count: " + count);
			return count;
	}
		

}




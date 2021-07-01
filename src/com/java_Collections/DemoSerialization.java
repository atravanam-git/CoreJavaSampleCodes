package com.java_Collections;

/*Serialization: 
 * The process of saving an object to a file (or) 
 * the process of sending an object across the network is called serialization.
 * But strictly speaking It is the process of converting the object from java supported form 
 * to the network supported form (or) file supported form.
*/
import java.io.*;

public class DemoSerialization {

	public static void main(String[] args) {
		Accounts acct =new Accounts();
		try {
			FileOutputStream fos=new FileOutputStream("abc.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(acct);
			oos.close();
			
			FileInputStream fis=new FileInputStream("abc.ser");
			ObjectInputStream ois =new ObjectInputStream(fis);
			Accounts acct1 =(Accounts)ois.readObject();
			ois.close();
			System.out.println("Usernam: "+ acct1.userName +" Account No. "+ acct1.acctNo);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("I am in finally block");
		}
    }

}
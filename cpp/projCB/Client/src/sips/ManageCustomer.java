
package sips;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;


public class ManageCustomer extends Thread  {

	private InputStream inputStr;
	private DataInputStream dataInputStr;
	private AftertThread afterTh;

	public ManageCustomer(Socket connexion, AftertThread at) {
		afterTh = at;
		try {inputStr  = connexion.getInputStream();}
		catch(Exception e){e.printStackTrace();}
		dataInputStr = new DataInputStream(inputStr);
	}

	public void run() {

		String s_messRecv="";
		byte c[];
		try {

                   // Lecture de la réponse
		   while(true) {
			byte by_first=dataInputStr.readByte();
			int i_chr=dataInputStr.available(); // détermine la fin de la chaîne de caractère
			c=new byte[i_chr+1];
			c[0]=by_first;
			dataInputStr.readFully(c, 1, i_chr); // lecture de la chaîne de caractère
			if(c[i_chr]==10) c[i_chr]=(byte)' ';
			String str_trace = new String(c); // ?
			s_messRecv = new String(c); // convertion du tableau de byte en String
			System.out.println(s_messRecv);
			afterTh.Set_close(true); // Fermeture de la connexion
		   }

		}
		catch(Exception e){ // Provoquée par l'arrêt du serveur
			//System.exit(0);
			afterTh.Set_close(true);
			System.out.println("CLOSE CONN");
		}

		try {
			dataInputStr.close();
			System.out.println("Close1");
		}
		catch(Exception e){}

	}




}




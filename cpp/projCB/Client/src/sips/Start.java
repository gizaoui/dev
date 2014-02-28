
package sips;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;



public class Start extends AftertThread {

	private Socket connexion;
	private OutputStream outputStr;
	private DataOutputStream dataOutputStr;
	private PrintStream printOutputStream;
	private boolean bol_closeConn;
	private String str_xmlmess;


	public Start(String [] str_args) {

		Object o=new Object();


		int i_port=Integer.parseInt(str_args[1]),
			i_time=Integer.parseInt(str_args[2]);

		str_xmlmess = new String(Get_XmlFile(str_args[3]));

		do {

			try {
				System.out.println("Connexion : " + str_args[0] + " (" + str_args[1] + ")");
				connexion = new Socket(str_args[0] , i_port);
				outputStr = connexion.getOutputStream();
				dataOutputStr = new DataOutputStream(outputStr);

				printOutputStream = new PrintStream(outputStr);
				printOutputStream.println (str_xmlmess);
				printOutputStream.flush();
			}
			catch(Exception e){
				System.out.println("Connexion refusée");
				System.exit(0);
			}

		    bol_closeConn=false;
			ManageCustomer man = new ManageCustomer(connexion, this);
			man.start();

			while(!bol_closeConn){
				try { synchronized(o) { o.wait(200); }
				}catch(InterruptedException ex) {}
			}

			try {
				dataOutputStr.close();
				outputStr.close();
				connexion.close();
			}
			catch(Exception e){}

			if(i_time>0)
				try { synchronized(o) { o.wait(i_time); }
				}catch(InterruptedException ex) {}

		} while(i_time>0);
	}

	void Set_close(boolean bol_close) {
		bol_closeConn=bol_close;
	}

	private byte[] Get_XmlFile(String s_path) {

		byte by_data[]=null;
		try {
			int i_car;
			FileInputStream inSend = new FileInputStream(s_path);
			by_data = new byte[inSend.available()];
			for(int i_loop=0;(i_car=inSend.read())!=-1;++i_loop)
				by_data[i_loop] = (byte)i_car;
			inSend.close();

		} catch (Exception e) {
			System.err.println("OUVERTURE DU FICHIER "+s_path+" IMPOSSIBLE");
			System.exit(0);
		}

		return by_data;
	}

	public static void main(String[] args) {

		if(args.length==4) new Start(args);
		else {
			System.out.println("address : " + args[0]);
			System.out.println("port : " + args[1]);
			System.out.println("time : " + args[2]);
			System.out.println("xmlFile : " + args[3]);
		}

	}
}

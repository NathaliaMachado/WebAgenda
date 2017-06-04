package socket;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import model.Contato;
import servlet.Servlet;

public class ClientSocketTCP {

	public static void main(String[] args) throws ClassNotFoundException
	{
		 Socket s = null;
		 
	        try 
	        {
	            int serverPort = 8082;
	            s = new Socket("localhost", serverPort);
	            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
	            Contato contato = new Contato();
	            contato.setNome("TESTE");
	            contato.setTelefone("TESTE");
	            contato.setEmail("TESTE");
	                 
	            out.writeObject(contato);
	        } 
	        
	        catch (UnknownHostException e) 
	        {
	            System.out.println("SockCliente:" + e.getMessage());
	        } 
	        
	        catch (EOFException e) 
	        {
	            System.out.println("EOFCliente:" + e.getMessage());
	        } 
	        
	        catch (IOException e) 
	        {
	            System.out.println("IOCliente:" + e.getMessage());
	        } 
	        
	        finally 
	        {
	            if (s != null) 
	            {
	                try 
	                {
	                    s.close();
	                } 
	                
	                catch (IOException e) 
	                {
	                    System.out.println("close:" + e.getMessage());
	                }
	            }
	        }
	}

}

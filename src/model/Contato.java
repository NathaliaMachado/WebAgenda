package model;

import java.io.Serializable;

public class Contato implements Serializable {
	
	private int id;
	private String nome;
    private String telefone;
    private String email;
    
	private static final long serialVersionUID = 8290650643868538718L;
	
	
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    @Override
	 public String toString()
	 {
		 StringBuilder builder = new StringBuilder();
		 builder.append("Nome: " + this.nome + "\n");
		 builder.append("Telefone: " + this.telefone + "\n");
		 builder.append("Email: " + this.email + "\n");
		 builder.append("\n");
		 
		 return builder.toString();
	 }
}

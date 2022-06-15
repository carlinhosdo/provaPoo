package modelo;

public class Agendamento{


    private String nome,vencimento;
    
    public Agendamento(String nome, String vencimento){
        this.nome =(nome!=null)? nome : "";
        this.vencimento =(vencimento!=null)? vencimento : "";

    }
  public String getNome(){
      return nome;
  }

   public void setNome(String nome){
       if( nome != null)
        this.nome = nome;
       

    }
  
    public String getVencimento(){
        return vencimento;
    }
   
      public void setVencimento(String vencimento){
          if(vencimento != null)
          this.vencimento = vencimento;
      }
     @Override
      public String toString(){
     StringBuilder tdah = new StringBuilder();
        tdah.append("prezado cliente, ").append(nome);
        tdah.append("a data de vencimento será em : ").append(vencimento);
        return tdah.toString();
    
      }


    }
   










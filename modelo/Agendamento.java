package modelo;
public class Agendamento{


    private String nome,vencimento,quantidadeDias;

    public Agendamento(){
        
    } 
    
    public String getQuantidade(){
      return quantidadeDias;
  }

   public void setQuantidade(String quantidadeDias){
        this.quantidadeDias = quantidadeDias;
       

    }
  

  public String getNome(){

    return nome;
  }

   public void setNome(String nome){
        this.nome = nome;
       

    }
  
    public String getVencimento(){
        return vencimento;
    }
   
      public void setVencimento(String vencimento){
          this.vencimento = vencimento;
      }





    }
   










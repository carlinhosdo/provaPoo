package control;
import java.util.ArrayList;
import modelo.Usuario;
public class UsuarioC {
    private ArrayList<Usuario> lista = new ArrayList<Usuario>();
    public boolean adicionarUsuario(Usuario user){
        if(!consultarUsuario(user.getNome())){
            lista.add(user);
            return true;
        }else{
            return false;
        }

    }
    public boolean consultarUsuario(String nome){
        boolean retorno = false;
        for(Usuario u : lista){
            if(u.getNome().equals(nome)){
                retorno = true;
            }
        }
        return retorno;
    }
    public void mostrarLista(){
        for(Usuario u : lista){
            System.out.println(u.getNome());
            System.out.println(u.getIdade());
            System.out.println("-------------------------------");
        }
    }
}

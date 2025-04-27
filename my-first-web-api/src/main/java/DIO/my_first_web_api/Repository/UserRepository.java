package DIO.my_first_web_api.Repository;

import DIO.my_first_web_api.Model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(Usuario usuario){
        if (usuario.getId()==null){
            System.out.println("SAVE - Recebendo usuário da camada de repositorio");
        }else {
            System.out.println("UPDATE - Recebendo usuário da camada de repositorio");
        }
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELET/id Recebendo o id: %d para excluir um",id));
        System.out.println(id);
    }

    public List<Usuario> findALl (){
        System.out.println("Listando os usuários do sistema: ");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    public Usuario findById (Integer id){
        System.out.println(String.format("FIND/Id Recebendo o id: %d para localizar o usuário", id));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername (String username){
        System.out.println(String.format("FIND/username Recebendo o id: %s para localizar o usuário", username));
        return new Usuario("gleyson", "password");
    }




}

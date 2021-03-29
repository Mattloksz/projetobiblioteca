package repository;

import org.springframework.data.repository.CrudRepository;
import Model.Cadastro;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;



@Repository
public interface CadastroRepository extends CrudRepository<Cadastro, Integer> {

}

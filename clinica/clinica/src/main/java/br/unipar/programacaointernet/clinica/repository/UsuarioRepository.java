package br.unipar.programacaointernet.clinica.repository;

import br.unipar.programacaointernet.clinica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByLoginAndSenha(String login, String senha);
}

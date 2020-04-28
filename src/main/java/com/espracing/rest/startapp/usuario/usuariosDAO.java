package com.espracing.rest.startapp.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usuariosDAO extends JpaRepository<Usuario, Long> {
    Usuario findByAlias(String alias);

    Usuario findByAliasAndPasswd(String alias, String passwd);
}

package com.espracing.rest.startapp.categoria;

import com.espracing.rest.startapp.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoriasDAO extends JpaRepository<Usuario, Long> {
}

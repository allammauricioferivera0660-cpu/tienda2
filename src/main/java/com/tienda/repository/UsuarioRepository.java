package com.tienda.repository;

import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
    public Optional<Usuario> findByUsernameAndActivoTrue(String username);

    public List<Usuario> findByActivoTrue();

    public Optional<Usuario> findByUsername(String username);

    public Optional<Usuario> findByUsernameOrCorreo(String username, String correo);

    public Optional<Usuario> findByUsernameOrPassword(String username, String Password);
    
    public boolean existsByUsernameOrCorreo(String username, String correo);   
}
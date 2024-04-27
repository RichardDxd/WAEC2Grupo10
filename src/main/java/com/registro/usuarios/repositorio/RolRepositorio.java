package com.registro.usuarios.repositorio;

import com.registro.usuarios.modelo.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorio {
    @Repository
    public interface RolRepository extends
            JpaRepository<Rol, Integer> {

    }

}

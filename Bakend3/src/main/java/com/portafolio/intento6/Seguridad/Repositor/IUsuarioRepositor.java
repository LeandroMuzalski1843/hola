/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.intento6.Seguridad.Repositor;

import com.portafolio.intento6.Seguridad.Entidad.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Simón
 */
@Repository
public interface IUsuarioRepositor  extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
      
      boolean existsByNombreUsuario(String nombreUsuario);
      boolean existesByEmail(String Email);
}
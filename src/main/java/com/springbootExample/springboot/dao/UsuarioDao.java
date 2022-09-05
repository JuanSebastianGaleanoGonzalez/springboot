package com.springbootExample.springboot.dao;

import com.springbootExample.springboot.model.Usuario;
import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();
}

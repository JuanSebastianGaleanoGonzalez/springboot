package com.springbootExample.springboot.control;

import com.springbootExample.springboot.dao.UsuarioDao;
import com.springbootExample.springboot.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "prueba")
    public String prueba(){
        return "prueba";
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario usuario(@PathVariable long id){
        Usuario auxiliar = new Usuario();
        auxiliar.setId_usuario(id);
        auxiliar.setNombre("Sebastian");
        auxiliar.setApellido("Galeano");
        auxiliar.setEmail("uncorreo@gmail.com");
        auxiliar.setTelefono("1234567890");
        return auxiliar;
    }

    @RequestMapping(value = "usuarios")
    public ArrayList<Usuario> getUsuarios(){

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();


        return listaUsuarios;
    }
}

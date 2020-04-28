package com.espracing.rest.startapp.usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuariosRESTController {

    @Autowired
    private usuariosDAO usuariosDAO;

    @RequestMapping(value = "usuarios", method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> u = usuariosDAO.findAll();

        return ResponseEntity.ok(u);
    }

    @RequestMapping(value = "usuarios/{alias}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findByAlias(@PathVariable("alias") String alias){
        Usuario u = usuariosDAO.findByAlias(alias);
        if(u != null){
            u.setPasswd("NULL");
            return ResponseEntity.ok(u);
        }
        return  ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "usuarios/login", method = RequestMethod.POST)
    public ResponseEntity<Usuario> findByAliasAndPasswd(@RequestBody LoginBody login){
        Usuario u = usuariosDAO.findByAliasAndPasswd(login.getalias(), login.getpass());

        if (u != null) {
            u.setPasswd("NULL");
            return ResponseEntity.ok(u);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}

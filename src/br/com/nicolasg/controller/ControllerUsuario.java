package br.com.nicolasg.controller;

import br.com.nicolasg.DAO.DaoUsuario;
import br.com.nicolasg.model.Usuario;
import br.com.nicolasg.services.Conexao;
import br.com.nicolasg.view.TelaUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class ControllerUsuario implements ActionListener {

    private TelaUsuario minhaView;

    public ControllerUsuario() {
        minhaView = new TelaUsuario();
        this.minhaView.addControllerActionListener(this);
    }
    
    public void abrir() {
        minhaView.abrir();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("login.logar")) {
            if (minhaView != null) {
                this.Autenticar();
            }
        }
    }

    private void Autenticar() {
        Usuario user = minhaView.getUsuario();
        DaoUsuario du = new DaoUsuario();
        String isAuth = du.Autenticar(user);
        
        minhaView.autenticarNivel(isAuth);
    }

}

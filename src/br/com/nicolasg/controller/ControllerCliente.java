package br.com.nicolasg.controller;

import br.com.nicolasg.view.TelaCliente;
import br.com.nicolasg.DAO.DaoCliente;
import br.com.nicolasg.model.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class ControllerCliente implements ActionListener{

    private TelaCliente minhaView;
    
    public ControllerCliente() {
        minhaView = new TelaCliente();
        this.minhaView.addControllerActionListener(this);
    }

    public void abrir(){
        minhaView.abrir();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("insert.inserir")){
            if (minhaView != null){
                this.InserirCliente();
            }
        }
    }

    private void InserirCliente() {
        Cliente cli  = minhaView.getNome();
        DaoCliente dc = new DaoCliente();
        String Inserir = dc.InserirCliente(cli);
        
        minhaView.InserirCliente(Inserir);
    }
    
}

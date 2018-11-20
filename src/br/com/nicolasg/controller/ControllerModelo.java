package br.com.nicolasg.controller;

import br.com.nicolasg.DAO.DaoModelo;
import br.com.nicolasg.model.Modelo;
import br.com.nicolasg.view.TelaModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class ControllerModelo implements ActionListener{

    private TelaModelo minhaView;

    public ControllerModelo() {
        minhaView = new TelaModelo();
        this.minhaView.addControllerActionListener(this);
    }
    
    public void abrir(){
        minhaView.abrir();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("insert.inserir")){
            if (minhaView != null){
                this.InserirModelo();
            }
        }
    }   

    private void InserirModelo() {
        Modelo mod = minhaView.getTitulo();
        DaoModelo dm = new DaoModelo();
        String Inserir = dm.InserirModelo(mod);
        
        minhaView.InserirModelo(Inserir);
    }

}

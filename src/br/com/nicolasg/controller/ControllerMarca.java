package br.com.nicolasg.controller;

import br.com.nicolasg.DAO.DaoMarca;
import br.com.nicolasg.model.Marca;
import br.com.nicolasg.view.TelaMarca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class ControllerMarca implements ActionListener{
    
    private TelaMarca minhaview;

    public ControllerMarca() {
        minhaview = new TelaMarca();
        this.minhaview.addControllerActionListener(this);
    }
    
    public void abrir(){
        minhaview.abrir();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("insert.inserir")) {
            if (minhaview != null) {
                this.InserirMarca();
            }
        }
    }

    private void InserirMarca(){
        Marca mar = minhaview.getTitulo();
        DaoMarca dm = new DaoMarca();
        String Inserir = dm.InserirMarca(mar);
        
        minhaview.InserirMarca(Inserir);
    }

}
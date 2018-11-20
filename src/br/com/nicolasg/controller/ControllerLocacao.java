package br.com.nicolasg.controller;

import br.com.nicolasg.DAO.DaoLocacao;
import br.com.nicolasg.model.Locacao;
import br.com.nicolasg.view.TelaLocacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerLocacao implements ActionListener{

    private TelaLocacao minhaView;
    
    public ControllerLocacao() {
        minhaView = new TelaLocacao();
        this.minhaView.addControllerActionListener(this);
    }
    
    public void abrir(){
        minhaView.abrir();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("insert.inserir")){
            if (minhaView != null){
                this.InserirLocacao();
            }
        }
    }

    private void InserirLocacao() {
        Locacao loc = minhaView.getLocacao();
        DaoLocacao dl = new DaoLocacao();
        String Inserir = dl.InserirLocacao(loc);
        
        minhaView.InserirLocacao(Inserir);
    }

}

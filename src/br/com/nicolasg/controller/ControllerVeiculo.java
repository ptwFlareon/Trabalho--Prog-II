package br.com.nicolasg.controller;

import br.com.nicolasg.DAO.DaoVeiculo;
import br.com.nicolasg.model.Veiculo;
import br.com.nicolasg.view.TelaModelo;
import br.com.nicolasg.view.TelaVeiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerVeiculo implements ActionListener{

    private TelaVeiculo minhaView;
    
    public ControllerVeiculo() {
        minhaView = new TelaVeiculo();
        this.minhaView.addControllerActionListener(this);
    }
    
    public void abrir(){
        minhaView.abrir();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("insert.inserir")){
            if (minhaView != null){
                this.InserirVeiculo();
            }
        }
    }

    private void InserirVeiculo() {
        Veiculo vei = minhaView.getNumPlaca();
        DaoVeiculo dv = new DaoVeiculo();
        String Inserir = dv.InserirVeiculo(vei);
        
        minhaView.InserirVeiculo(Inserir);
    }
    
}

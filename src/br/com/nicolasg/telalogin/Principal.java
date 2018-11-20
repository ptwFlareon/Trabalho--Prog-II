package br.com.nicolasg.telalogin;

import br.com.nicolasg.controller.ControllerCliente;
import br.com.nicolasg.controller.ControllerLocacao;
import br.com.nicolasg.controller.ControllerMarca;
import br.com.nicolasg.controller.ControllerModelo;
import br.com.nicolasg.controller.ControllerUsuario;
import br.com.nicolasg.controller.ControllerVeiculo;


public class Principal {

    public static void main(String[] args) {
        //ControllerModelo tela = new ControllerModelo();        // TELA OK NÃO PUXA *FK*
        //ControllerVeiculo tela = new ControllerVeiculo();      // TELA OK NÃO PUXA FK E NÃO INSERE NO BANCO
        //ControllerLocacao tela = new ControllerLocacao();      // TELA OK NÃO PUXA FK E NÃO INSERE NO BANCO
        //ControllerCliente tela = new ControllerCliente();      // TELA OK
        //ControllerUsuario tela = new ControllerUsuario();      // TELA OK
        //ControllerMarca tela = new ControllerMarca();          // TELA OK
        tela.abrir();
    }
    
}

package br.com.nicolasg.view;

import br.com.nicolasg.controller.ControllerCliente;
import br.com.nicolasg.controller.ControllerMarca;
import br.com.nicolasg.model.Cliente;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class TelaCliente extends JFrame implements ActionListener{
    
    private Cliente title;

    private JTextField edNome;
    private JButton btCadastrar, btSair;

    public TelaCliente() {
        super(":Tela Cliente");
        init();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("insert.inserir")) {
            System.exit(1);
        } else if (e.getActionCommand().equals("login.sair"))
            System.exit(2);
    }
    
    private void init() {
        title = new Cliente();
        this.setLayout(new GridLayout(0, 2));

        edNome = new JTextField();
        btCadastrar = new JButton("Cadastrar");
        btCadastrar.setActionCommand("insert.inserir");
        btSair = new JButton("Sair");
        btSair.addActionListener(this);
        btSair.setActionCommand("login.sair");

        this.add(new JLabel("Inserir:"));
        this.add(edNome);
        this.add(btCadastrar);
        this.add(btSair);
    }
    
    public void abrir() {
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public Cliente getNome() {
        title.setNome(edNome.getText());
        String strPass = new String(edNome.getText());
        title.setNome(strPass);

        return title;
    }

    public void addControllerActionListener(ControllerCliente al) {
        btCadastrar.addActionListener(al);
    }

    public void InserirCliente(String Inserir) {
        JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");
    }

}

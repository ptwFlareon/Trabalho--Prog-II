package br.com.nicolasg.view;

import br.com.nicolasg.controller.ControllerModelo;
import br.com.nicolasg.model.Marca;
import br.com.nicolasg.model.Modelo;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



//NESTA TELA ESTÁ TUDO OK!!!!!!    



public class TelaModelo extends JFrame implements ActionListener{

    private Modelo title;
    
    private JTextField txNome;
    private JButton btCadastrar, btSair;
    
    public TelaModelo() throws HeadlessException {
        super(":Tela Modelo");
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
        title = new Modelo();
        this.setLayout(new GridLayout(0, 2));

        txNome = new JTextField();
        btCadastrar = new JButton("Cadastrar");
        btCadastrar.setActionCommand("insert.inserir");
        btSair = new JButton("Sair");
        btSair.addActionListener(this);
        btSair.setActionCommand("login.sair");

        this.add(new JLabel("Inserir:"));
        this.add(txNome);
        this.add(btCadastrar);
        this.add(btSair);
    }
    
    public void abrir() {
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public Modelo getTitulo() {
        title.setTitulo(txNome.getText());
        String strPass = new String(txNome.getText());
        title.setTitulo(strPass);

        return title;
    }
    
    public void addControllerActionListener(ControllerModelo al) {
        btCadastrar.addActionListener(al);
    }

    public void InserirModelo(String Inserir) {
        JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");
    }
    
}

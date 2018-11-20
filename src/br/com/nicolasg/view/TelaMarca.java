package br.com.nicolasg.view;

import br.com.nicolasg.controller.ControllerMarca;
import br.com.nicolasg.model.Marca;
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



public class TelaMarca extends JFrame implements ActionListener {

    private Marca title;

    private JTextField edTitulo;
    private JButton btCadastrar, btSair;

    public TelaMarca() {
        super(":Tela Marca");
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
        title = new Marca();
        this.setLayout(new GridLayout(0, 2));

        edTitulo = new JTextField();
        btCadastrar = new JButton("Cadastrar");
        btCadastrar.setActionCommand("insert.inserir");
        btSair = new JButton("Sair");
        btSair.addActionListener(this);
        btSair.setActionCommand("login.sair");

        this.add(new JLabel("Inserir:"));
        this.add(edTitulo);
        this.add(btCadastrar);
        this.add(btSair);
    }

    public void abrir() {
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public Marca getTitulo() {
        title.setTitulo(edTitulo.getText());
        String strPass = new String(edTitulo.getText());
        title.setTitulo(strPass);

        return title;
    }

    public void addControllerActionListener(ControllerMarca al) {
        btCadastrar.addActionListener(al);
    }

    public void InserirMarca(String Inserir) {
            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");
    }
    
}
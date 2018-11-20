package br.com.nicolasg.view;

import br.com.nicolasg.controller.ControllerVeiculo;
import br.com.nicolasg.model.Modelo;
import br.com.nicolasg.model.Veiculo;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TelaVeiculo extends JFrame implements ActionListener {
    
    private Veiculo title;
    
    private JTextArea txPlaca, txCor, txAno, txTipoCombustivel, txNumPortas;
    private JTextArea txQuilometragem, txRenavam, txChassi, txValorLocacaoHora;
    private JTextArea txValorLocacaoKm, txSituacao;
    private JButton btCadastrar, btSair;

    public TelaVeiculo() throws HeadlessException {
        super(":Tela Veiculo");
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
        title = new Veiculo();
        this.setLayout(new GridLayout(0, 2));

        txPlaca = new JTextArea();
        txCor = new JTextArea();
        txAno = new JTextArea();
        txTipoCombustivel = new JTextArea();
        txNumPortas = new JTextArea();
        txQuilometragem = new JTextArea();
        txRenavam = new JTextArea();
        txChassi = new JTextArea();
        txValorLocacaoHora = new JTextArea();
        txValorLocacaoKm = new JTextArea();
        txSituacao = new JTextArea();  

        btCadastrar = new JButton("Cadastrar");
        btCadastrar.setActionCommand("insert.inserir");
        btSair = new JButton("Sair");
        btSair.addActionListener(this);
        btSair.setActionCommand("login.sair");

        this.add(new JLabel("Placa:"));
        this.add(txPlaca);
        this.add(new JLabel("Cor:"));
        this.add(txCor);
        this.add(new JLabel("Ano:"));
        this.add(txAno);
        this.add(new JLabel("Tipo Combustivel:"));
        this.add(txTipoCombustivel);
        this.add(new JLabel("Nume do Portas:"));
        this.add(txNumPortas);
        this.add(new JLabel("Quilometragem:"));
        this.add(txQuilometragem);
        this.add(new JLabel("Renavam:"));
        this.add(txRenavam);
        this.add(new JLabel("Chassi:"));
        this.add(txChassi);
        this.add(new JLabel("Locaçao/Hr:"));
        this.add(txValorLocacaoHora);
        this.add(new JLabel("Locação/Km:"));
        this.add(txValorLocacaoKm);
        this.add(new JLabel("Situação:"));
        this.add(txSituacao);        

        this.add(btCadastrar);
        this.add(btSair);
    }

    public void abrir() {
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public Veiculo getNumPlaca() {
        title.setNumPlaca(txPlaca.getText());
        String strPass = new String(txPlaca.getText());
        title.setNumPlaca(strPass);

        return title;
    }
    
    public void addControllerActionListener(ControllerVeiculo al) {
        btCadastrar.addActionListener(al);
    }
    
    public void InserirVeiculo(String Inserir) {
            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");
    }
 
}

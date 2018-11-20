package br.com.nicolasg.view;

import br.com.nicolasg.controller.ControllerLocacao;
import br.com.nicolasg.model.Locacao;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TelaLocacao extends JFrame implements ActionListener {
    
    private Locacao title;
    
    private JTextArea txhoraInicio, txhoraFim, txkmInicio, txkmFim, txkmRodado;
    private JTextArea txtempoHoras, txvlHora, txvlKm, txvalorTotal, txSituacao;
    private JButton btCadastrar, btSair;

    public TelaLocacao() throws HeadlessException {
        super(":Tela Locacao");
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
        title = new Locacao();
        this.setLayout(new GridLayout(0, 2));

        txhoraInicio = new JTextArea();
        txhoraFim = new JTextArea();
        txkmInicio = new JTextArea();
        txkmFim = new JTextArea();
        txkmRodado = new JTextArea();
        txtempoHoras = new JTextArea();
        txvlHora = new JTextArea();
        txvlKm = new JTextArea();
        txvalorTotal = new JTextArea();
        txSituacao = new JTextArea();  

        btCadastrar = new JButton("Cadastrar");
        btCadastrar.setActionCommand("insert.inserir");
        btSair = new JButton("Sair");
        btSair.addActionListener(this);
        btSair.setActionCommand("login.sair");

        this.add(new JLabel("Hora Inicio:"));
        this.add(txhoraInicio);
        this.add(new JLabel("Hora Final:"));
        this.add(txhoraFim);
        this.add(new JLabel("Km Inicial:"));
        this.add(txkmInicio);
        this.add(new JLabel("Km Final:"));
        this.add(txkmFim);
        this.add(new JLabel("Km Rodada:"));
        this.add(txkmRodado);
        this.add(new JLabel("Tempo em Horas:"));
        this.add(txtempoHoras);
        this.add(new JLabel("Valor da Hora:"));
        this.add(txvlHora);
        this.add(new JLabel("Valor por Km:"));
        this.add(txvlKm);
        this.add(new JLabel("Valor Total:"));
        this.add(txvalorTotal);
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
    
    public void addControllerActionListener(ControllerLocacao al) {
        btCadastrar.addActionListener(al);
    }

    public Locacao getLocacao() {
        title.setHoraInicio(txhoraInicio.getText());
        String strPass = new String(txhoraInicio.getText());
        title.setHoraInicio(strPass);

        return title;
    }

    public void InserirLocacao(String Inserir) {
        JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");
    }
 
}

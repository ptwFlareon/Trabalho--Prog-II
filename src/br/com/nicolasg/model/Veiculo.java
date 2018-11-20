package br.com.nicolasg.model;

public class Veiculo {

    private int id;
    private String NumPlaca;
    private String cor;
    private String ano;
    private String tipoCombustivel;
    private int NumePortas;
    private Double Quilometragem;
    private String renavam;
    private String chassi;
    private Double ValorLocacaoHora;
    private Double ValorLocacaoKm;
    private String situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumPlaca() {
        return NumPlaca;
    }

    public void setNumPlaca(String NumPlaca) {
        this.NumPlaca = NumPlaca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumePortas() {
        return NumePortas;
    }

    public void setNumePortas(int NumPortas) {
        this.NumePortas = NumPortas;
    }

    public Double getQuilometragem() {
        return Quilometragem;
    }

    public void setQuilometragem(Double Quilometragem) {
        this.Quilometragem = Quilometragem;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getValorLocacaoHora() {
        return ValorLocacaoHora;
    }

    public void setValorLocacaoHora(Double ValorLocacaoHora) {
        this.ValorLocacaoHora = ValorLocacaoHora;
    }

    public Double getValorLocacaoKm() {
        return ValorLocacaoKm;
    }

    public void setValorLocacaoKm(Double ValorLocacaoKm) {
        this.ValorLocacaoKm = ValorLocacaoKm;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}

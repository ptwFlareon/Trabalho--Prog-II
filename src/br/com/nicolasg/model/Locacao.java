package br.com.nicolasg.model;

public class Locacao {

    private int id;
    private String horaInicio;
    private String horaFim;
    private Double kmInicio;
    private Double kmFim;
    private Double kmRodado;
    private Double tempoHoras;
    private Double valorHora;
    private Double valorKm;
    private Double valorTotal;
    private String situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public Double getKmInicio() {
        return kmInicio;
    }

    public void setKmInicio(Double kmInicio) {
        this.kmInicio = kmInicio;
    }

    public Double getKmFim() {
        return kmFim;
    }

    public void setKmFim(Double kmFim) {
        this.kmFim = kmFim;
    }

    public Double getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(Double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public Double getTempoHoras() {
        return tempoHoras;
    }

    public void setTempoHoras(Double tempoHoras) {
        this.tempoHoras = tempoHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorKm() {
        return valorKm;
    }

    public void setValorKm(Double valorKm) {
        this.valorKm = valorKm;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}

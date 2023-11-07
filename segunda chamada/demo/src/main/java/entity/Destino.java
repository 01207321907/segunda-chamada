package entity;

public class Destino {

    public String destino;
    private String descricao;
    private String status;

    public String getDestino() {
        return destino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(String reserva) {
        this.status = reserva;
    }
}

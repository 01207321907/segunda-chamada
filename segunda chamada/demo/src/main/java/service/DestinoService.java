package service;

import entity.Destino;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinoService {

    private static List<Destino> destinos;
    private String reserva;
    private String novoStatus;

    public DestinoService() {
        destinos = new ArrayList<>();
    }

    public Destino cadastrarDestino(Destino destino) throws Exception {
        destinos.add(destino);
        return destino;
    }

    public List<Destino> listarDestinos() {
        return destinos;
    }

    public List<Destino> buscarDestinos() {
        return destinos;
    }

    public String buscarDestino(String destino) {
        return destino;
    }

    public HttpEntity<String> setStatus(String reserva) {
        this.reserva = reserva;
        return null;
    }
}

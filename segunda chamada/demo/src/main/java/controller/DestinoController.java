package controller;

import entity.Destino;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.DestinoService;

import java.util.List;

@RestController
@RequestMapping("api/destino")
public class DestinoController {

    private final DestinoService destinoService;

    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @GetMapping("/todos")
    public ResponseEntity<?> buscarDestinos() {
        try {
            List<Destino> lista = destinoService.buscarDestinos();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("Erro na requisição", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> criarDestino(@RequestBody Destino destino) {
        try {
            destino = destinoService.cadastrarDestino(destino);
            return new ResponseEntity<>(destino, HttpStatus.CREATED);
        } catch (Exception exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{destino}")
    public ResponseEntity<?> buscarDestino(@PathVariable("destino") String destino) {
        try {
            String destinos = destinoService.buscarDestino(destino);
            return new ResponseEntity<>(destino, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/atualizar/reserva")
    public HttpEntity<String> setStatus(@PathVariable("reserva") String status, @RequestBody String novoStatus) {
        try {
            String reserva = null;
            return destinoService.setStatus(reserva);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}

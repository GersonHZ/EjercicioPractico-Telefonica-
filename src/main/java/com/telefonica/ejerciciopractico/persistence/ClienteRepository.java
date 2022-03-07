package com.telefonica.ejerciciopractico.persistence;

import com.telefonica.ejerciciopractico.persistence.crud.ClienteCrudRepository;
import com.telefonica.ejerciciopractico.persistence.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public List<Cliente> getClientesByDocumento(String cdocumento) {
        return (List<Cliente>) clienteCrudRepository.findClientesByDocumentoOrderByCnombresAsc(cdocumento);
    }

    public List<Cliente> getClientesByTipoDocumento(Integer idtipodoc) {
        return (List<Cliente>) clienteCrudRepository.findClientesByTipoDocumento(idtipodoc);
    }

    public Optional<Cliente> getClienteOptional(Integer idcliente) {
        return clienteCrudRepository.findById(idcliente);
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteCrudRepository.save(cliente);
    }

    public void deleteCliente(Integer idcliente) {
        clienteCrudRepository.deleteById(idcliente);
    }
}

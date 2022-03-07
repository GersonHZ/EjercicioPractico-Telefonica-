package com.telefonica.ejerciciopractico.persistence.crud;

import com.telefonica.ejerciciopractico.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {
    List<Cliente> findClientesByDocumentoOrderByCnombresAsc(String cdocumento);
    List<Cliente> findClientesByTipoDocumento(Integer idtipodoc);
}

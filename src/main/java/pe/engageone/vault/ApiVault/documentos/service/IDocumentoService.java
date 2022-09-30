package pe.engageone.vault.ApiVault.documentos.service;

import java.util.List;

import org.springframework.data.repository.query.Param;



import pe.engageone.vault.ApiVault.documentos.entity.Documento;

public interface IDocumentoService {

	public List<Documento> findAll();
	public List<Documento> findDocumentByColumnaAndValor(@Param("columna") String columna, @Param("valor") String valor );
	public List<Documento> buscarTodo();
	
}

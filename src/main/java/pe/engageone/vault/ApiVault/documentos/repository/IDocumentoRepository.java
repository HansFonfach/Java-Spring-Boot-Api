package pe.engageone.vault.ApiVault.documentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.engageone.vault.ApiVault.documentos.entity.Documento;

@Repository
public interface IDocumentoRepository extends JpaRepository<Documento, Long> {

	 @Query(value = "SELECT d FROM documentos d WHERE :columna=:valor;", nativeQuery=true)
	 List<Documento> findDocumentByColumnaAndValor(@Param("columna") String columna, @Param("valor") String valor );
	
	
	//List<Documento> Search(String Columna, String Valor);

}
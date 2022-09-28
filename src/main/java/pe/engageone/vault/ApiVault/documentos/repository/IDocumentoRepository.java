package pe.engageone.vault.ApiVault.documentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.engageone.vault.ApiVault.documentos.entity.Documento;

@Repository
public interface IDocumentoRepository extends JpaRepository<Documento, Long>{
	
	
	@Query("SELECT * FROM Documentos WHERE :Columna LIKE :%Valor%")
	List<Documento> findDocumentByColumnaAndValor(@Param("Columna") String Columna, @Param("Valor") String Valor  );



}
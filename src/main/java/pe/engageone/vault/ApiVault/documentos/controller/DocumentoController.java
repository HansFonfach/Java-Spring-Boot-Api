package pe.engageone.vault.ApiVault.documentos.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.engageone.vault.ApiVault.documentos.entity.Documento;
import pe.engageone.vault.ApiVault.documentos.service.IDocumentoService;

@RestController
public class DocumentoController {
	
	
	
	@Autowired
	private IDocumentoService documentoService;
	
	@GetMapping("/listColumns")
	@ResponseStatus( HttpStatus.OK )
	public List<Documento> listar() throws InterruptedException {
		
		if(documentoService.findAll().isEmpty() ) {
			
			throw new IllegalStateException("No se encontraron documentos para listar");
			
		}
		
		return documentoService.findAll();
		
		
		
		
		
		//Map<String, String> json = new HashMap<>();
		 //return new listar("tamos", HttpStatus.OK);
		//return documentoService.findAll();
		//return new ResponseEntity<>(documentoHttpStatus.OK + ": Conexion a la BD establecida Correctamente", HttpStatus.OK);
	}
	
	@GetMapping("/connectDb")
	public ResponseEntity<?> connectDb(){
	
		return new ResponseEntity<>(HttpStatus.OK + ": Conexion a la BD establecida Correctamente", HttpStatus.OK);
		
	}

}

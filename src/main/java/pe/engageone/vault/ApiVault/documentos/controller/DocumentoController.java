package pe.engageone.vault.ApiVault.documentos.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Documento>> listar() throws InterruptedException {
		List<Documento> documentos = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			documentos = documentoService.findAll();
		} catch (Exception ex) {
			ex.getMessage();
		}

		if (documentoService.findAll().isEmpty()) {

			throw new IllegalStateException("No se encontraron documentos para listar");

		}
		return new ResponseEntity<List<Documento>>(documentos, HttpStatus.OK);

		
	}

	@GetMapping("searchDocument/{columna}/{valor}")
	public ResponseEntity<?> obtenerDocumento(@PathVariable String Columna, @PathVariable String Valor) {

		Map<String, Object> response = new HashMap<>();
		Documento doc = null;

		try {
			// doc = documentoService.obtenerDocumento(columna, valor);

		} catch (DataAccessException e) {

			response.put("mensaje", "No se encontró el documento que busca");
			response.put("error", e.getMostSpecificCause().getMessage());
		}

		if (doc == null) {

			response.put("mensaje", "No exgiste documento con esos datos");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		response.put("mensaje", "Documento encontrado");
		response.put("documento", doc);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

	@GetMapping("/connectDb")
	public ResponseEntity<?> connectDb() {

		Map<String, Object> response = new HashMap<>();
		response.put("status", "OK");
		response.put("Message", "Conexion a la BD establecida correctamente");
		response.put("Code:", "200");

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}

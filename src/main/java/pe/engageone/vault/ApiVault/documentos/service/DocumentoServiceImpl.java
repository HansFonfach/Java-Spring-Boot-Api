package pe.engageone.vault.ApiVault.documentos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.engageone.vault.ApiVault.documentos.dao.DocumentoDao;
import pe.engageone.vault.ApiVault.documentos.entity.Documento;
import pe.engageone.vault.ApiVault.documentos.repository.IDocumentoRepository;

@Service
public class DocumentoServiceImpl implements IDocumentoService {

	@Autowired
	private DocumentoDao documentoDao;

	private IDocumentoRepository documentoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Documento> findAll() {
		return (List<Documento>) documentoDao.findAll();
	}


}

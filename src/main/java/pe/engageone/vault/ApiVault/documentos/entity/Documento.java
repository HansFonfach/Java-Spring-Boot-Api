package pe.engageone.vault.ApiVault.documentos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="documentos")
public class Documento implements Serializable{
    


	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="doc_id")
	private Long    docId;
	
	@Column(name="doc_account")
	private Integer docAccount;
	
	@Column(name="doc_date")
	@Temporal(TemporalType.DATE)
	private Date    docDate;
	
	@Column(name="doc_name")
	private String  docName;
	
	@Column(name="doc_address")
	private String  docAddress;
	
	@Column(name="doc_invoice", nullable=true )
	private String  docInvoice;
	
	@Column(name="doc_type")
	private String  docType;
	
	@Column(name="doc_pages")
	private Integer docPages;
	
	@Column(name="file_name")
	private String  fileName;
	
	@Column(name="file_size")
	private Integer fileSize;
	
	@Column(name="file_block")
	private Integer fileBlock;
	
	@Column(name="message_id")
	private String  messageId;
	
	@Column(name="cpointer_from")
	private String  cpointerFrom;
	
	@Column(name="cpointer_to")
	private String  cpointerTo;
	
	
	private String  email;
	private String  description;
	private String  mime;
	
	@Column(name="codigo_evento")
	private String  codigoEvento;
	
	@Column(name="ruc_cliente")
	private String  rucCliente;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column(name="nombre_aviso")
	private String  nombreAviso;
	
	@Column(name="nro_cliente")
	private String  nroCliente;
	
	@Column(name="producto_aviso")
	private String  productoAviso;
	
	@Column(name="nro_prestamo")
	private String  nroPrestamo;
	
	@Column(name="nombre_cliente")
	private String  nombreCliente;
	
	@Column(name="doc_sections")
	private Integer docSections;
	
	@Column(name="int_profile")
	private String  intProfile;
	
	@Column(name="int_resource")
	private String  intResource;
	
	@Column(name="profile_format")
	private String  profileFormat;
	
	@Column(name="int_modes")
	private Integer intModes;
	
	
	
	public Long getDoc_id() {
		return docId;
	}
	public void setDoc_id(Long doc_id) {
		this.docId = doc_id;
	}
	public Integer getDocAccount() {
		return docAccount;
	}
	public void setDocAccount(Integer docAccount) {
		this.docAccount = docAccount;
	}
	public Date getDocDate() {
		return docDate;
	}
	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocAddress() {
		return docAddress;
	}
	public void setDocAddres(String docAddres) {
		this.docAddress = docAddres;
	}
	public String getDocInvoice() {
		return docInvoice;
	}
	public void setDocInvoice(String docInvoice) {
		this.docInvoice = docInvoice;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public Integer getDocPages() {
		return docPages;
	}
	public void setDocPages(Integer docPages) {
		this.docPages = docPages;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Integer getFileSize() {
		return fileSize;
	}
	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}
	public Integer getFileBlock() {
		return fileBlock;
	}
	public void setFileBlock(Integer fileBlock) {
		this.fileBlock = fileBlock;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getCpointerFrom() {
		return cpointerFrom;
	}
	public void setCpointerFrom(String cpointerFrom) {
		this.cpointerFrom = cpointerFrom;
	}
	public String getCpointerTo() {
		return cpointerTo;
	}
	public void setCopinterTo(String copinterTo) {
		this.cpointerTo = copinterTo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMime() {
		return mime;
	}
	public void setMime(String mime) {
		this.mime = mime;
	}
	public String getCodigoEvento() {
		return codigoEvento;
	}
	public void setCodigoEvento(String codigoEvento) {
		this.codigoEvento = codigoEvento;
	}
	public String getRucCliente() {
		return rucCliente;
	}
	public void setRucCliente(String rucCliente) {
		this.rucCliente = rucCliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNombreAviso() {
		return nombreAviso;
	}
	public void setNombreAviso(String nombreAviso) {
		this.nombreAviso = nombreAviso;
	}
	public String getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(String nroCliente) {
		this.nroCliente = nroCliente;
	}
	public String getProductoAviso() {
		return productoAviso;
	}
	public void setProductoAviso(String productoAviso) {
		this.productoAviso = productoAviso;
	}
	public String getNroPrestamo() {
		return nroPrestamo;
	}
	public void setNroPrestamo(String nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Integer getDocSections() {
		return docSections;
	}
	public void setDocSections(Integer docSections) {
		this.docSections = docSections;
	}
	public String getIntProfile() {
		return intProfile;
	}
	public void setIntProfile(String intProfile) {
		this.intProfile = intProfile;
	}
	public String getIntResource() {
		return intResource;
	}
	public void setIntResource(String intResource) {
		this.intResource = intResource;
	}
	public String getProfileFormat() {
		return profileFormat;
	}
	public void setProfileFormat(String profileFormat) {
		this.profileFormat = profileFormat;
	}
	public Integer getIntModes() {
		return intModes;
	}
	public void setIntModes(Integer intModes) {
		this.intModes = intModes;
	}

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 813619277403591905L;
	
	
	
}

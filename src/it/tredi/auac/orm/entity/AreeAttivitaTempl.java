package it.tredi.auac.orm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the AREE_ATTIVITA_TEMPL database table.
 * 
 */
@Entity
@Table(name="AREE_ATTIVITA_TEMPL")
public class AreeAttivitaTempl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String clientid;

	private String annotations;

	@Temporal(TemporalType.DATE)
	private Date creation;

	private String denominazione;

	private String descr;

	private String disabled;

	@Temporal(TemporalType.DATE)
	private Date ended;

	@Column(name="ID_ATTIVITA")
	private BigDecimal idAttivita;

	@Column(name="ID_USER")
	private String idUser;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_MOD")
	private Date lastMod;

	private String nome;

	//bi-directional many-to-one association to FlussoTempl
	@ManyToOne
	@JoinColumn(name="ID_FLUSSO_FK")
	private FlussoTempl flussoTempl;

	/*
	RIMOSSO PER MODIFICA GESTIONE DATI REGIONALI
	//bi-directional many-to-many association to CodiciUlssTerritoriali
	@ManyToMany(mappedBy="areeAttivitaTempls")
	private List<CodiciUlssTerritoriali> codiciUlssTerritorialis;
	*/

	public AreeAttivitaTempl() {
	}

	public String getClientid() {
		return this.clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
	}

	public String getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
	}

	public Date getCreation() {
		return this.creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public String getDenominazione() {
		return this.denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDisabled() {
		return this.disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public Date getEnded() {
		return this.ended;
	}

	public void setEnded(Date ended) {
		this.ended = ended;
	}

	public BigDecimal getIdAttivita() {
		return this.idAttivita;
	}

	public void setIdAttivita(BigDecimal idAttivita) {
		this.idAttivita = idAttivita;
	}

	public String getIdUser() {
		return this.idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public Date getLastMod() {
		return this.lastMod;
	}

	public void setLastMod(Date lastMod) {
		this.lastMod = lastMod;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FlussoTempl getFlussoTempl() {
		return this.flussoTempl;
	}

	public void setFlussoTempl(FlussoTempl flussoTempl) {
		this.flussoTempl = flussoTempl;
	}

	/*
	RIMOSSO PER MODIFICA GESTIONE DATI REGIONALI
	public List<CodiciUlssTerritoriali> getCodiciUlssTerritorialis() {
		return this.codiciUlssTerritorialis;
	}

	public void setCodiciUlssTerritorialis(List<CodiciUlssTerritoriali> codiciUlssTerritorialis) {
		this.codiciUlssTerritorialis = codiciUlssTerritorialis;
	}
	*/

}
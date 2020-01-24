package it.tredi.auac.dao;

import it.tredi.auac.orm.entity.Parametri;

import org.springframework.stereotype.Repository;


@Repository("parametriDao")
public class ParametriDao extends AbstractJpaDao<Parametri> {
	
	public final static String NOTIFICA_INVIO_DOMANDA_SUBJECT = "NOTIFICA_INVIO_DOMANDA_SUBJECT";
	public final static String NOTIFICA_INVIO_DOMANDA_BODY = "NOTIFICA_INVIO_DOMANDA_BODY";
	public final static String NOTIFICA_RICEZIONE_DOMANDA_SUBJECT = "NOTIFICA_RICEZIONE_DOMANDA_SUBJECT";
	public final static String NOTIFICA_RICEZIONE_DOMANDA_BODY = "NOTIFICA_RICEZIONE_DOMANDA_BODY";
	public final static String NOTIFICA_INIZIO_VALUTAZIONE_SUBJECT = "NOTIFICA_INIZIO_VALUTAZIONE_SUBJECT";
	public final static String NOTIFICA_INIZIO_VALUTAZIONE_BODY = "NOTIFICA_INIZIO_VALUTAZIONE_BODY";
	public final static String NOTIFICA_CHIUSURA_PROCEDIMENTO_SUBJECT = "NOTIFICA_CHIUSURA_PROCEDIMENTO_SUBJECT";
	public final static String NOTIFICA_CHIUSURA_PROCEDIMENTO_BODY = "NOTIFICA_CHIUSURA_PROCEDIMENTO_BODY";
	public final static String NOTIFICA_RICHIESTA_INTEGRAZIONE_SUBJECT = "NOTIFICA_RICHIESTA_INTEGRAZIONE_SUBJECT";
	public final static String NOTIFICA_RICHIESTA_INTEGRAZIONE_BODY = "NOTIFICA_RICHIESTA_INTEGRAZIONE_BODY";
	public final static String NOTIFICA_INVIO_INTEGRAZIONI_A_REGIONE_SUBJECT = "NOTIFICA_INVIO_INTEGRAZIONI_A_REGIONE_SUBJECT";
	public final static String NOTIFICA_INVIO_INTEGRAZIONI_A_REGIONE_BODY = "NOTIFICA_INVIO_INTEGRAZIONI_A_REGIONE_BODY";
	public final static String NOTIFICA_INVIO_INTEGRAZIONI_A_TITOLARE_SUBJECT = "NOTIFICA_INVIO_INTEGRAZIONI_A_TITOLARE_SUBJECT";
	public final static String NOTIFICA_INVIO_INTEGRAZIONI_A_TITOLARE_BODY = "NOTIFICA_INVIO_INTEGRAZIONI_A_TITOLARE_BODY";
	public final static String NOTIFICA_RICEZIONE_DOMANDA_DOPO_INTEGRAZIONE_SUBJECT = "NOTIFICA_RICEZIONE_DOMANDA_DOPO_INTEGRAZIONE_SUBJECT";
	public final static String NOTIFICA_RICEZIONE_DOMANDA_DOPO_INTEGRAZIONE_BODY = "NOTIFICA_RICEZIONE_DOMANDA_DOPO_INTEGRAZIONE_BODY";
	public final static String NOTIFICA_ANNOTAZIONE_SUBJECT = "NOTIFICA_ANNOTAZIONE_SUBJECT";
	public final static String NOTIFICA_ANNOTAZIONE_BODY = "NOTIFICA_ANNOTAZIONE_BODY";
	public final static String NOTIFICA_TUTTI_REQUISITI_SUBJECT = "NOTIFICA_TUTTI_REQUISITI_SUBJECT";
	public final static String NOTIFICA_TUTTI_REQUISITI_BODY = "NOTIFICA_TUTTI_REQUISITI_BODY";
	public final static String NOTIFICA_VERIFICA_TUTTI_REQUISITI_SUBJECT = "NOTIFICA_VERIFICA_TUTTI_REQUISITI_SUBJECT";
	public final static String NOTIFICA_VERIFICA_TUTTI_REQUISITI_BODY = "NOTIFICA_VERIFICA_TUTTI_REQUISITI_BODY";
	
	public ParametriDao() {
		super();
		setClazz(Parametri.class);
	}

}
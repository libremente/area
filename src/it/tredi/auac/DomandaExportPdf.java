package it.tredi.auac;

import it.tredi.auac.bean.FolderPdfBean;
import it.tredi.auac.pdf.DomandaInPdf;
import it.tredi.auac.pdf.DomandaInPdfIntestazione;
import it.tredi.auac.service.UtilService;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
 
/**
 * Questa class genera il PDF contenente le informazioni relative alle UoInst, UdoInst 
 * selezionate della domanda e i dati dei relativi requisiti.
 *
 */
public class DomandaExportPdf extends AbstractITextPdfView {
	private UtilService utilService;

    @Override
    protected void prepareWriter(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request)
            throws DocumentException {
    	
		Rectangle rectArt = new Rectangle(document.leftMargin(), document.bottomMargin(), document.getPageSize().getWidth() - document.rightMargin(), document.getPageSize().getHeight() - document.topMargin());
    	writer.setBoxSize("art", rectArt);
    	DomandaInPdfIntestazione intestazionePdf = new DomandaInPdfIntestazione("Lista di Verifica della conformità ai requisiti specifici");
    	writer.setPageEvent(intestazionePdf);
        
    	super.prepareWriter(model, document, writer, request);
    }
 
    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document doc,
            PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
            throws Exception {

    	FolderPdfBean sfpb = (FolderPdfBean) model.get("pdfPageBean");
    	DomandaInPdf domandaInPdf = new DomandaInPdf();
    	domandaInPdf.setUtilService(utilService);
    	domandaInPdf.buildPdfDocument(doc, writer, sfpb);
    }

	public UtilService getUtilService() {
		return utilService;
	}

	public void setUtilService(UtilService utilService) {
		this.utilService = utilService;
	}
 
}

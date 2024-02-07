package com.baeldung.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Invoice {

    private String concepto;
    private Date dateFrom;
    private Date dateTo;
    private double cantidad;
    private double retencion;
    private double totalNeto;

    public Invoice() { super();
    }

    public Invoice(final String concepto, final Date dateFrom, final Date dateTo, final double cantidad, final double retencion, final double totalNeto) {
            this.concepto = concepto;
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
            this.cantidad = cantidad;
            this.retencion = retencion;
            this.totalNeto = totalNeto;
    }

    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(final String concepto) {
        this.concepto = concepto;
    }

    public Date getDateFrom() {
        return dateFrom;
    }
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(final double cantidad) {
        this.cantidad = cantidad;
    }

    public double getRetencion() {
        return retencion;
    }
    public void setRetencion(final double retencion) {
        this.retencion = retencion;
    }

    public double getTotalNeto() { return totalNeto; }
    public void setTotalNeto(final double totalNeto) { this.totalNeto = totalNeto; }

    @Override
    public String toString() {
        return "Invoice [concepto=" + concepto + ", cantidad=" + cantidad + ", retencion=" + retencion + ", totalNeto=" + totalNeto + "]";
    }
}
package com.baeldung.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baeldung.model.Invoice;

@Controller
public class InvoiceController {

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public String showInvoiceForm(ModelMap model) {
        model.addAttribute("invoice", new Invoice());
        return "invoiceForm";
    }

    @RequestMapping(value = "/createInvoice", method = RequestMethod.POST)
    public String createInvoice(@ModelAttribute("invoice") final Invoice invoice, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        double totalNeto = invoice.getCantidad() * (1 - (invoice.getRetencion() / 100.0));

        invoice.setTotalNeto(totalNeto);

        model.addAttribute("concepto", invoice.getConcepto());
        model.addAttribute("dateFrom", invoice.getDateFrom());
        model.addAttribute("dateTo", invoice.getDateTo());
        model.addAttribute("cantidad", invoice.getCantidad());
        model.addAttribute("retencion", invoice.getRetencion());
        model.addAttribute("totalNeto", invoice.getTotalNeto());

        return "invoiceSummary";
    }
}
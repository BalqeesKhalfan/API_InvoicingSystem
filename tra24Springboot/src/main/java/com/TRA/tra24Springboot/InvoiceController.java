package com.TRA.tra24Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InvoiceController {


    @GetMapping("invoices")
    public String invoicingSystem() {
        //return invoiceService.getAllInvoices();
        return "hi";
    }
}

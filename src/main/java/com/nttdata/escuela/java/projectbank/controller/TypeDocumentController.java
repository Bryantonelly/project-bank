package com.nttdata.escuela.java.projectbank.controller;

import com.nttdata.escuela.java.projectbank.entity.TypeDocument;
import com.nttdata.escuela.java.projectbank.service.TypeDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typeDocuments")
public class TypeDocumentController {

    @Autowired
    private TypeDocumentService typeDocumentService;

    @GetMapping
    public List<TypeDocument> getAllHeadlines() {
        return typeDocumentService.getAllTypeDocument();
    }

    @GetMapping("/{id}")
    public TypeDocument getHeadlinesById(@PathVariable Long id) {
        return typeDocumentService.getTypeDocumentById(id);
    }

    @PostMapping
    public TypeDocument createHeadline(@RequestBody TypeDocument typeDocument) {
        return typeDocumentService.createTypeDocument(typeDocument);
    }

    @PutMapping("/{id}")
    public TypeDocument updateHeadline(@PathVariable Long id, @RequestBody TypeDocument typeDocument) {
        return typeDocumentService.updateTypeDocument(id, typeDocument);
    }

    @DeleteMapping("/{id}")
    public void deleteHeadline(@PathVariable Long id) {
        typeDocumentService.deleteTypeDocument(id);
    }
}

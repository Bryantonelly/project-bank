package com.nttdata.escuela.java.projectbank.service.impl;

import com.nttdata.escuela.java.projectbank.entity.TypeDocument;
import com.nttdata.escuela.java.projectbank.repository.TypeDocumentRepository;
import com.nttdata.escuela.java.projectbank.service.TypeDocumentService;
import com.nttdata.escuela.java.projectbank.util.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeDocumentServiceImpl implements TypeDocumentService {

    @Autowired
    private TypeDocumentRepository typeDocumentRepository;

    @Override
    public List<TypeDocument> getAllTypeDocument() {
        return typeDocumentRepository.findAll();
    }

    @Override
    public TypeDocument getTypeDocumentById(Long id) {
        return typeDocumentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("documento no encontrado con id: " + id));
    }

    @Override
    public TypeDocument createTypeDocument(TypeDocument typeDocument) {
        return typeDocumentRepository.save(typeDocument);
    }

    @Override
    public TypeDocument updateTypeDocument(Long id, TypeDocument typeDocument) {
        TypeDocument typeDocumentExists = typeDocumentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("documento no encontrado con id: " + id));
        typeDocumentExists.setDescription(typeDocument.getDescription());
        return typeDocumentRepository.save(typeDocumentExists);
    }

    @Override
    public void deleteTypeDocument(Long id) {
        typeDocumentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("documento no encontrado con id: " + id));
        typeDocumentRepository.deleteById(id);
    }
}

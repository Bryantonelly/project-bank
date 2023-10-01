package com.nttdata.escuela.java.projectbank.service;

import com.nttdata.escuela.java.projectbank.entity.TypeDocument;
import java.util.List;

public interface TypeDocumentService {
    List<TypeDocument> getAllTypeDocument();
    TypeDocument getTypeDocumentById(Long id);
    TypeDocument createTypeDocument(TypeDocument typeDocument);
    TypeDocument updateTypeDocument(Long id, TypeDocument typeDocument);
    void deleteTypeDocument(Long id);
}

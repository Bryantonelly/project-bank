package com.nttdata.escuela.java.projectbank.repository;

import com.nttdata.escuela.java.projectbank.entity.TypeDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TypeDocumentRepository extends JpaRepository<TypeDocument, Long> {
}

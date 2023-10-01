package com.nttdata.escuela.java.projectbank.repository;

import com.nttdata.escuela.java.projectbank.entity.Headline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadlineRepository extends JpaRepository<Headline, Long> {
}

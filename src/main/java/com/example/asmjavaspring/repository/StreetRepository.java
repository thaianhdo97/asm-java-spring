package com.example.asmjavaspring.repository;

import com.example.asmjavaspring.entity.Street;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StreetRepository extends CrudRepository<Street, String> {
}

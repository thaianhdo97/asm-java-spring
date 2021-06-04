package com.example.asmjavaspring.repository;

import com.example.asmjavaspring.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetJpaRepository extends JpaRepository<Street, String> {
    @Query("select s from Street s where s.name = :name and s.district = :district")
    List<Street> findByNameAndDistrict(@Param("name") String name, @Param("district") String district);
}

package com.example.inheritancedemo.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("tpc_mr")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}

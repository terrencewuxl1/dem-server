package com.dem.server.jpa;

import com.dem.server.entity.CPod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CPodRepository extends JpaRepository<CPod, Integer> {
}

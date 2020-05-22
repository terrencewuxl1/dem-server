package com.dem.server.jpa;

import com.dem.server.entity.AdaInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdaInfoRepository extends JpaRepository<AdaInfo, Integer> {
}

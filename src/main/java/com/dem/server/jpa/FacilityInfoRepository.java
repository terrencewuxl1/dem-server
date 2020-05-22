package com.dem.server.jpa;

import com.dem.server.entity.FacilityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityInfoRepository extends JpaRepository<FacilityInfo, Integer> {
}

package com.scaler.bookMyShowJan26.repository;

import com.scaler.bookMyShowJan26.models.ShowSeat;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
}

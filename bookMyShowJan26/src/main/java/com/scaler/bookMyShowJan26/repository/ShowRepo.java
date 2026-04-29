package com.scaler.bookMyShowJan26.repository;

import com.scaler.bookMyShowJan26.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepo extends JpaRepository<Show,Integer> {
}

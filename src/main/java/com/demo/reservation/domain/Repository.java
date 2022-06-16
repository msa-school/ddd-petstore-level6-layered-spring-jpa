package com.demo.reservation.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Reservation, Long>{
    
}

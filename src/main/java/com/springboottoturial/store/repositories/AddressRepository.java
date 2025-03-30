package com.springboottoturial.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboottoturial.store.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    
}

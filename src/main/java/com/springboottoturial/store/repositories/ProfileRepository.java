package com.springboottoturial.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboottoturial.store.entities.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    
}

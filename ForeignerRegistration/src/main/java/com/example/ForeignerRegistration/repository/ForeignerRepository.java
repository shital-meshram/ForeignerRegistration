package com.example.ForeignerRegistration.repository;

import com.example.ForeignerRegistration.model.TCsForeignerRegistration;
import com.example.ForeignerRegistration.model.TCsForeignerRegistrationPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForeignerRepository extends JpaRepository<TCsForeignerRegistration, TCsForeignerRegistrationPK> {
}

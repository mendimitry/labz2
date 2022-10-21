package com.psuti.Zhalnin.dao;

import com.psuti.Zhalnin.entity.Starring;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Starring, UUID> {
}

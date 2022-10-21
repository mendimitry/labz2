package com.psuti.Zhalnin.dao;

import com.psuti.Zhalnin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Role, String> {
}

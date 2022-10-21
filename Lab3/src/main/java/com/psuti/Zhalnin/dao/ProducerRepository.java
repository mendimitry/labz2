package com.psuti.Zhalnin.dao;

import com.psuti.Zhalnin.entity.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepository extends JpaRepository <Direction, String> {
}

package net.java.backendFinalSpring.repository;

import net.java.backendFinalSpring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}

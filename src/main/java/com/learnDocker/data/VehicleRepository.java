package com.learnDocker.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnDocker.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
	public Vehicle findByName(String name);
} 

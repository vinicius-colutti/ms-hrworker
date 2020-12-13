package com.colutti.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colutti.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

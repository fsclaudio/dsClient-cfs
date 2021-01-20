package com.cfs.dsClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cfs.dsClient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {

}

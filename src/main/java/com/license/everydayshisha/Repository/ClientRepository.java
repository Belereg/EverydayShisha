package com.license.everydayshisha.Repository;

import com.license.everydayshisha.Model.DAO.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}

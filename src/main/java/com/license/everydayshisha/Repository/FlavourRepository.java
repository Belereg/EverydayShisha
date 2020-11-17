package com.license.everydayshisha.Repository;

import com.license.everydayshisha.Model.DAO.Flavour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlavourRepository extends JpaRepository<Flavour,Integer> {

}

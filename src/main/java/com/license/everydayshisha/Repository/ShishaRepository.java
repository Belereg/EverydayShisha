package com.license.everydayshisha.Repository;

import com.license.everydayshisha.Model.DAO.Shisha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShishaRepository extends JpaRepository<Shisha,Integer> {
}

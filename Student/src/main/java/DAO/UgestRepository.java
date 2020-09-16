package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Ugest;
@Repository
public interface UgestRepository extends JpaRepository<Ugest, Integer>{

}

package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Tier;

public interface TierRepository extends JpaRepository<Tier, Integer> {

}

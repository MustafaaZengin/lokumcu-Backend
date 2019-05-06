package com.example.lokumcubaba.Repository;

import com.example.lokumcubaba.Entity.Basvuru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasvuruRepo extends JpaRepository<Basvuru,Long>{

}


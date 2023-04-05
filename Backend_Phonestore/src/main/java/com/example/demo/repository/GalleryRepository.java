package com.example.demo.repository;

import com.example.demo.entity.GaleryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryRepository extends JpaRepository<GaleryEntity,Integer> {
}

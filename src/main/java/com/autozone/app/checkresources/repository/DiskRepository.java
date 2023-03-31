package com.autozone.app.checkresources.repository;

import com.autozone.app.checkresources.entity.Disk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiskRepository extends JpaRepository<Disk, Long> {
}

package com.autozone.app.checkresources.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Disk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    private String path;
    private Double totalSpace;
    private Double freeSpace;
    private Double usedSpace;
    private Double percent;
    private Boolean isAlmostFull;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

}

package com.autozone.app.checkresources.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    private String pathKey;
    private String nameServer;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;
    @OneToOne
    private Ram ram;
    @OneToOne
    private Cpu cpu;
    @OneToMany
    private List<Disk> diskPartitions;

}

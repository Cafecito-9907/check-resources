package com.autozone.app.checkresources.dto;

import com.autozone.app.checkresources.entity.Cpu;
import com.autozone.app.checkresources.entity.Ram;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ServerDto {

    private Long id;
    private String uuid;
    private String nameServer;
    private Double totalSpace;
    private Double freeSpace;
    private Double usedSpace;
    private Double percent;
    private Boolean isAlmostFull;
    private Ram ram;
    private Cpu cpu;
    private List<DiskDto> diskPartitions;

}

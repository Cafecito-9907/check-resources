package com.autozone.app.checkresources.dto;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DiskDto {

    private Long id;
    private String uuid;
    private String path;
    private Double totalSpace;
    private Double freeSpace;
    private Double usedSpace;
    private Double percent;
    private Boolean isAlmostFull;

}

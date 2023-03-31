package com.autozone.app.checkresources.mapper;


import com.autozone.app.checkresources.dto.DiskDto;
import com.autozone.app.checkresources.entity.Disk;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring"
)
public interface DiskMapper {

    DiskMapper DISK_MAPPER = Mappers.getMapper(DiskMapper.class);

    Disk dtoToDisk(DiskDto diskDto);
    DiskDto diskToDto(Disk diskDto);

}

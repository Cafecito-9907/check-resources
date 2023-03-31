package com.autozone.app.checkresources.mapper;

import com.autozone.app.checkresources.dto.ServerDto;
import com.autozone.app.checkresources.dto.ServerRequestDto;
import com.autozone.app.checkresources.entity.Server;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
    componentModel = "spring"
)
public interface ServerMapper {
    ServerMapper SERVER_MAPPER = Mappers.getMapper(ServerMapper.class);
    Server dtoToServer(ServerDto serverDto);
    ServerDto serverToDto(Server serverDto);
    ServerRequestDto serverToDtoRequest(Server serverDto);
    Server dtoToServer(ServerRequestDto serverDto);

}

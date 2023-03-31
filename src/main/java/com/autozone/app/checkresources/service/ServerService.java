package com.autozone.app.checkresources.service;

import com.autozone.app.checkresources.dto.DiskDto;
import com.autozone.app.checkresources.dto.ServerDto;
import com.autozone.app.checkresources.dto.ServerRequestDto;

import java.util.List;

public interface ServerService {

    ServerDto createServer(ServerRequestDto serverRequestDto);

    List<ServerDto> getAllServers();

    List<DiskDto> getAllDislByServer(Long serverId);


}

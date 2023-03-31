package com.autozone.app.checkresources.service;

import com.autozone.app.checkresources.dto.DiskDto;
import com.autozone.app.checkresources.dto.ServerDto;
import com.autozone.app.checkresources.dto.ServerRequestDto;
import com.autozone.app.checkresources.exceptions.BadRequestException;
import com.autozone.app.checkresources.repository.CpuRepository;
import com.autozone.app.checkresources.repository.DiskRepository;
import com.autozone.app.checkresources.repository.RamRepository;
import com.autozone.app.checkresources.repository.ServerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;


import static com.autozone.app.checkresources.service.ConnectionSshService.getInformation;

@Service
public class ServerServiceImpl implements ServerService{

    private final ServerRepository serverRepository;
    private final RamRepository ramRepository;
    private final DiskRepository diskRepository;
    private final CpuRepository cpuRepository;

    private final Logger LOGGER = LogManager.getLogger(ServerServiceImpl.class);

    public ServerServiceImpl(ServerRepository serverRepository,
                             RamRepository ramRepository,
                             DiskRepository diskRepository,
                             CpuRepository cpuRepository) {
        this.serverRepository = serverRepository;
        this.ramRepository = ramRepository;
        this.diskRepository = diskRepository;
        this.cpuRepository = cpuRepository;
    }

    @Override
    public ServerDto createServer(ServerRequestDto serverRequestDto) {

        LOGGER.info("Creating server");
        LOGGER.info(serverRequestDto.toString());

        if(!StringUtils.hasText(serverRequestDto.getUserServer())
                || !StringUtils.hasText(serverRequestDto.getServerName())){
            throw new BadRequestException("User or server is missing");
        }

        getInformation(serverRequestDto.getUserServer(), serverRequestDto.getServerName());


        return null;
    }

    @Override
    public List<ServerDto> getAllServers() {
        return null;
    }

    @Override
    public List<DiskDto> getAllDislByServer(Long serverId) {
        return null;
    }
}

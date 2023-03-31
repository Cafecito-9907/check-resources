package com.autozone.app.checkresources.controller;

import com.autozone.app.checkresources.dto.ServerRequestDto;
import com.autozone.app.checkresources.response.Response;
import com.autozone.app.checkresources.response.ResponseHandler;
import com.autozone.app.checkresources.service.ServerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/admin/check_resources")
public class ServerController {

    private final ServerService serverService;

    public ServerController(ServerService serverService) {
        this.serverService = serverService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Response> createAServerConnection(@RequestBody ServerRequestDto serverRequestDto){
        serverService.createServer(serverRequestDto);

        return ResponseHandler.response(null, "created");

    }

}

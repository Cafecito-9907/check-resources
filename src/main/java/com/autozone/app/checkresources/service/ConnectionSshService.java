package com.autozone.app.checkresources.service;

import com.autozone.app.checkresources.entity.Disk;
import com.jcraft.jsch.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConnectionSshService {

    public static List<Disk> getInformation(String user, String nameServer) {


        String privateKeyFile = "C:/Users/rubi.ramirez/.ssh/id_rsa";
        JSch jsch = new JSch();

        try {

            // Load the private key from a file
            jsch.addIdentity(privateKeyFile, "check");

            // Create a session to the remote server
            Session session = jsch.getSession(user, nameServer);

            // Set the configuration options for the session
            session.setConfig("StrictHostKeyChecking", "yes");

            // Connect to the remote server
            session.connect();

            // Create a channel to run commands on the remote server
            Channel channel = session.openChannel("exec");

            // Set the command to run
            String command = "df -h";
            ((ChannelExec) channel).setCommand(command);

            // Connect the channel and start the command
            channel.connect();

            // Read the output from the command
            byte[] buffer = new byte[1024];
            while (true) {
                if (channel.isClosed()) {
                    int exitStatus = channel.getExitStatus();
                    System.out.println("Exit status: " + exitStatus);
                    break;
                }

                int bytesRead = channel.getInputStream().read(buffer);
                if (bytesRead > 0) {
                    System.out.print(new String(buffer, 0, bytesRead));
                }
            }

            // Disconnect the channel and session
            channel.disconnect();
            session.disconnect();
        } catch (JSchException | java.io.IOException e) {
            System.out.println(e);
        }

        return null;
    }

}

//package com.api.matsAPI.config;
//
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.JSchException;
//import com.jcraft.jsch.Session;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SshTunnelConfig {
//
//    @Value("${ssh.hostname}")
//    private String sshHostname;
//
//    @Value("${ssh.port}")
//    private int sshPort;
//
//    @Value("${ssh.username}")
//    private String sshUsername;
//
//    @Value("${ssh.identityFile}")
//    private String sshIdentityFile;
//
//    @Value("${ssh.passphrase}")
//    private String sshPassphrase;
//
//    @Bean
//    public Session sshSession() throws JSchException {
//        JSch jsch = new JSch();
//        jsch.addIdentity(sshIdentityFile, sshPassphrase);
//
//        Session session = jsch.getSession(sshUsername, sshHostname, sshPort);
//        session.setConfig("StrictHostKeyChecking", "no");
//        session.connect();
//
//        int forwardedPort = session.setPortForwardingL(27017, "localhost", 27017); // Пробрасываем порт для MongoDB
//
//        return session;
//    }
//}
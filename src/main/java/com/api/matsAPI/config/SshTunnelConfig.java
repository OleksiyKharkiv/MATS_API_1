//package com.api.matsAPI.config;
//
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.Session;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Properties;
//
//@Configuration
//public class SshTunnelConfig {
//
//    @Bean
//    public void createSshTunnel() throws Exception {
//        String sshHost = "172.201.121.48"; // Удаленный сервер SSH
//        String sshUser = "matsdb"; // Имя пользователя SSH
//        String sshPrivateKey = "C:/MATS/Olex/Olex_openssh.pem"; // Путь к вашему PEM-ключу
//        String sshPassword = "m7fKseRfzhXN"; // Пароль пользователя SSH
//        int localPort = 27018; // Локальный порт для проброса
//        int remotePort = 27017; // Удаленный порт MongoDB
//
//        JSch jsch = new JSch();
//        jsch.addIdentity(sshPrivateKey);
//
//        Session session = jsch.getSession(sshUser, sshHost);
//        Properties config = new Properties();
//        config.put("StrictHostKeyChecking", "no");
//        session.setConfig(config);
//        session.connect();
//
//        session.setPortForwardingL(localPort, "localhost", remotePort);
//    }
//}
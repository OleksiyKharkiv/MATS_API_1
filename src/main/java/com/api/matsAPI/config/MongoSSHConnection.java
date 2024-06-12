package com.api.matsAPI.config;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoIterable;

public class MongoSSHConnection {
    private static final String LOCAL_HOST = "localhost";
    private static final Integer LOCAL_PORT = 27017;
    private static final Integer REMOTE_PORT = 27017;

    // SSH connection info
    private static final String SSH_HOST = "172.201.121.48";
    private static final Integer SSH_PORT = 22;
    private static final String SSH_USER = "matsdb";
    private static final String SSH_IDENTITY_FILE = "C:/MATS/Olex/Olex.pem";
    private static final String SSH_PASSPHRASE = "m7fKseRfzhXN";

    private static Session sshSession;

    public static void main(String[] args) {
        try {
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            sshSession = null;
            jsch.addIdentity(SSH_IDENTITY_FILE, SSH_PASSPHRASE);
            sshSession = jsch.getSession(SSH_USER, SSH_HOST, SSH_PORT);
            sshSession.setConfig(config);
            sshSession.connect();
            sshSession.setPortForwardingL(LOCAL_PORT, LOCAL_HOST, REMOTE_PORT);

            ConnectionString connectionString = new ConnectionString("mongodb://" + LOCAL_HOST + ":" + LOCAL_PORT);
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connectionString)
                    .build();
            MongoClient mongoClient = MongoClients.create(settings);

            MongoIterable<String> dbNames = mongoClient.listDatabaseNames();
            for (String dbName : dbNames) {
                System.out.println(dbName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sshSession != null && sshSession.isConnected()) {
                try {
                    sshSession.delPortForwardingL(LOCAL_PORT);
                    sshSession.disconnect();
                } catch (JSchException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
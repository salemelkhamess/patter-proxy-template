package org.example;

import org.example.controllers.Client;
import org.example.service.IService;
import org.example.service.ServiceImpl;

public class Main {
    public static void main(String[] args) {

        IService service = new ServiceImpl();
        Client client = new Client();
        client.setService(service);
        System.out.println("RES=" +client.perform(23));
        System.out.println("RES=" +client.perform(23));
        System.out.println("RES=" +client.perform(23));


    }
}
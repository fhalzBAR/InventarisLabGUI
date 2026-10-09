/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventarislabgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class TesKoneksi {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_inventaris_lab" + "?ssslMode=DISABLE&publicKeyRetrieval=true";
        String user = "root";
        String password = "";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println(" Koneksi berhasil" + conn.getCatalog() + " Berhasil!");
        } catch (Exception e) {
            System.out.println(" Koneksi gagal" + e.getMessage());
        }
    }
}

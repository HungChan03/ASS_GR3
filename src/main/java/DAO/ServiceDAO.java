/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Service;
import Model.Service;
import Utils.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ServiceDAO extends DBContext {
    public List<Service> GetAll() {    //lay het service
        List<Service> sList = new ArrayList<>();
        String query = "Select * from Services";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Service se = new Service(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4)
                        
                );
                sList.add(se);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return sList;
    }

    public boolean Insert(Service service) {  //them service
        String query = "INSERT INTO Services values (ServiceName,Description,Price,IMAGES) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, service.getServiceName());
            ps.setString(2, service.getDescription());
            ps.setDouble(3, service.getPrice());
            ps.setString(4, service.getImages());

            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateServicePrince(Service service) { //sua gia service dua tren name service
        String query = "update Services set Price = ? where ServiceName=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setDouble(1, service.getPrice());
            ps.setString(2, service.getServiceName());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateServiceDescription(Service service) {  //sua thong tin mieu ta service
        String query = "update Services set Description = ? where ServiceName=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, service.getDescription());
            ps.setString(2, service.getServiceName());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean DeleteService(Service service) {  //xoa serviec dua tren name , co the sua lai id neu thich
        String query = "Delete from Services where ServiceName=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, service.getServiceName());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean GetServiceByName(Service service) {  //lay het thong tin dua tren service name
        String query = "Select * from Services where ServiceName=?";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, service.getServiceName());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

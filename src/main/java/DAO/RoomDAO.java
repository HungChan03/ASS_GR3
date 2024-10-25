/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Room;
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
public class RoomDAO extends DBContext {

    public List<Room> GetAll() {  //lay het thong tin cua Room
        List<Room> rList = new ArrayList<>();
        String query = "Select * from Room";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Room ro = new Room(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)
                );
                rList.add(ro);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rList;
    }

    public boolean DeleteByRoomType(Room room) {  //xoa phong dua tren room type
        String query = "DELETE FROM Room WHERE Room_Type = ?;";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, room.getRoomType());

            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean InsertRoom(Room room) {  //xoa
        String query = "INSERT INTO Room (Room_Type, Capacity,Price,Description,IMAGER, IMAGER1,IMAGER2,IMAGER3,IMAGER4,IMAGER5,IMAGER6) VALUES (?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, room.getRoomType());
            ps.setInt(2, room.getCapacity());
            ps.setDouble(3, room.getPrice());
            ps.setString(4, room.getDescription());
            ps.setString(5, room.getImager());
            ps.setString(6, room.getImager1());
            ps.setString(7, room.getImager2());
            ps.setString(8, room.getImager3());
            ps.setString(9, room.getImager4());
            ps.setString(10, room.getImager5());
            ps.setString(11, room.getImager6());

            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean GetUserByRoomtype(Room room) {  //lay thong tin phong dua tren roomtype
        String query = "Select * from Room where Room_Type=?";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, room.getRoomType());

            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdatePriceRoom(Room room) {  //thay doi thong tin dua tren roomtype
        String query = "update Room set Price = ? where Room_Type='?'";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setDouble(1, room.getPrice());
            ps.setString(2, room.getRoomType());

            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}

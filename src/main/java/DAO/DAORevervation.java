/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Booking;
import Utils.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAORevervation extends DBContext{
    public List<Booking> GetAll() {  //lay het thong tin dat phong
        List<Booking> bList = new ArrayList<>();  
        String query = "Select * from Reservation";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Booking boo = new Booking(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getDate(7)
                        
                );
                bList.add(boo);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return bList;
    }
    
      public boolean Insert(Booking booking) {  //them don dat phong
        String query = "insert into Reservation( Reservation_ID,Customer_ID,Room_Code,TotalPrice,Status,Check_In_Date,CheckOutDate) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, booking.getRevervation_ID());
            ps.setInt(2, booking.getCustomerID());
            ps.setString(3,booking.getRoom_code());
            ps.setDouble(4,booking.getTotalPrice());
            ps.setString(5, booking.getStatus());
            ps.setDate(6, booking.getCheck_in_date());
            ps.setDate(7, booking.getCheck_out_date());

            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }  
      
       public boolean DeleteByID(Booking booking) {  //xoa don dua tren id
        String query = " delete from Reservation where Reservation_ID =?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, booking.getRevervation_ID());
          
            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    } 
       
    public boolean UpdateReverveseStatus(Booking booking) { //cancelROOM
        String query = " update Reservation set Status = ? where Reservation_ID=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, booking.getStatus());
            ps.setInt(2, booking.getRevervation_ID());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean UpdateRevervesePrince(Booking booking) {  //update gia ca cua don
        String query = " update Reservation set TotalPrice = ? where Reservation_ID=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setDouble(1, booking.getTotalPrice());
            ps.setInt(2, booking.getRevervation_ID());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
       
       
       
    
}

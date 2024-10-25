/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Room {
    private String roomType;
    private int capacity;
    private double price;
    private String description;
    private String imager;    
    private String imager1;
    private String imager2;
    private String imager3;
    private String imager4;
    private String imager5;
    private String imager6;

    public Room(String roomType, int capacity, double price, String description, String imager, String imager1, String imager2, String imager3, String imager4, String imager5, String imager6) {
        this.roomType = roomType;
        this.capacity = capacity;
        this.price = price;
        this.description = description;
        this.imager = imager;
        this.imager1 = imager1;
        this.imager2 = imager2;
        this.imager3 = imager3;
        this.imager4 = imager4;
        this.imager5 = imager5;
        this.imager6 = imager6;
    }

    
    

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImager() {
        return imager;
    }

    public void setImager(String Imager) {
        this.imager = Imager;
    }

    public String getImager1() {
        return imager1;
    }

    public void setImager1(String Imager1) {
        this.imager1 = Imager1;
    }

    public String getImager2() {
        return imager2;
    }

    public void setImager2(String Imager2) {
        this.imager2 = Imager2;
    }

    public String getImager3() {
        return imager3;
    }

    public void setImager3(String Imager3) {
        this.imager3 = Imager3;
    }

    public String getImager4() {
        return imager4;
    }

    public void setImager4(String Imager4) {
        this.imager4 = Imager4;
    }

    public String getImager5() {
        return imager5;
    }

    public void setImager5(String Imager5) {
        this.imager5 = Imager5;
    }

    public String getImager6() {
        return imager6;
    }

    public void setImager6(String Imager6) {
        this.imager6 = Imager6;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    

 }
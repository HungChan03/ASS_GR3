/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Service {

    private String serviceName;
    private String description;
    private double price;
    private String images;

    public Service(String serviceName, String description, double price, String images) {
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
        this.images = images;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Service{" + "serviceName=" + serviceName + ", description=" + description + ", price=" + price + ", images=" + images + '}';
    }
    
    
}

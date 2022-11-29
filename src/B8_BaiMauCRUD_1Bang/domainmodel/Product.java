/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_BaiMauCRUD_1Bang.domainmodel;

/**
 *
 * @author hangnt
 */
public class Product {

    private Long id;
    private Long categoryID;
    private String productCode;
    private String productName;
    private Float price;
    private String description;

    public Product() {
    }

    public Product(Long id, Long categoryID, String productCode, String productName, Float price, String description) {
        this.id = id;
        this.categoryID = categoryID;
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

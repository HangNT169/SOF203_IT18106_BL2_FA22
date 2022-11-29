/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_BaiMauCRUD_1Bang.viewmodel;

/**
 *
 * @author hangnt
 */
public class ProductViewModel {

    private Long productId;
    private String categoryCode;
    private String categoryName;
    private String productCode;
    private String produdctName;
    private Float price;

    public ProductViewModel() {
    }

    public ProductViewModel(Long productId, String categoryCode, String categoryName, String productCode, String produdctName, Float price) {
        this.productId = productId;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.productCode = productCode;
        this.produdctName = produdctName;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProdudctName() {
        return produdctName;
    }

    public void setProdudctName(String produdctName) {
        this.produdctName = produdctName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductViewModel{" + "productId=" + productId + ", categoryCode=" + categoryCode + ", categoryName=" + categoryName + ", productCode=" + productCode + ", produdctName=" + produdctName + ", price=" + price + '}';
    }

}

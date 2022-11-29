/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_BaiMauCRUD_1Bang.repository;

import B8_BaiMauCRUD_1Bang.domainmodel.Category;
import B8_BaiMauCRUD_1Bang.viewmodel.ProductViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class ProductRepository {
    
    public List<ProductViewModel> getAll() {
        String query = """
                      SELECT dbo.product.id, dbo.category.category_code, dbo.category.category_name, dbo.product.product_code, dbo.product.product_name, dbo.product.price
                      FROM dbo.category INNER JOIN
                           dbo.product ON dbo.category.id = dbo.product.category_id
                      """;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<ProductViewModel> lists = new ArrayList<>();
            while (rs.next()) {
                ProductViewModel productViewModel
                        = new ProductViewModel(rs.getLong(1),
                                rs.getString(2),
                                rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6));
                lists.add(productViewModel);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public static void main(String[] args) {
        for (ProductViewModel arg : new ProductRepository().getAll()) {
            System.out.println(arg.toString());
        }
    }
}

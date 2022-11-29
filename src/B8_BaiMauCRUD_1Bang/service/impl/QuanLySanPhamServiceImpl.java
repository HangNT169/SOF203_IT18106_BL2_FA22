/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_BaiMauCRUD_1Bang.service.impl;

import B8_BaiMauCRUD_1Bang.repository.ProductRepository;
import B8_BaiMauCRUD_1Bang.service.QuanLySanPhamService;
import B8_BaiMauCRUD_1Bang.viewmodel.ProductViewModel;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class QuanLySanPhamServiceImpl implements QuanLySanPhamService {

    private ProductRepository productRepository = new ProductRepository();
    
    @Override
    public List<ProductViewModel> getAll() {
        return productRepository.getAll();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B8_BaiMauCRUD_1Bang.service;

import B8_BaiMauCRUD_1Bang.domainmodel.Category;
import java.util.List;

/**
 *
 * @author hangnt
 */
public interface QuanLyCategoryService {

    List<Category> getAll();

    Category getOne(Long id);

    String add(Category category);

    String update(Long id, Category category);

    String delete(Long id);

}

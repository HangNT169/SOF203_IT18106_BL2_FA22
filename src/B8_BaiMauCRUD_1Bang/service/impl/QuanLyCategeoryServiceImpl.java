/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_BaiMauCRUD_1Bang.service.impl;

import B8_BaiMauCRUD_1Bang.domainmodel.Category;
import B8_BaiMauCRUD_1Bang.repository.CategoryRepository;
import B8_BaiMauCRUD_1Bang.service.QuanLyCategoryService;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class QuanLyCategeoryServiceImpl implements QuanLyCategoryService {

    private CategoryRepository categoryRepository = new CategoryRepository();

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    @Override
    public Category getOne(Long id) {
        return categoryRepository.getOne(id);
    }

    @Override
    public String add(Category category) {
        boolean addCate = categoryRepository.add(category);
        if (addCate) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }

    @Override
    public String update(Long id, Category category) {
        boolean updateCate = categoryRepository.update(category, id);
        if (updateCate) {
            return "Update thanh cong";
        }
        return "Update that bai";
    }

    @Override
    public String delete(Long id) {
        boolean deleteCate = categoryRepository.delete(id);
        if (deleteCate) {
            return "Delete thanh cong";
        }
        return "Delete that bai";
    }

}

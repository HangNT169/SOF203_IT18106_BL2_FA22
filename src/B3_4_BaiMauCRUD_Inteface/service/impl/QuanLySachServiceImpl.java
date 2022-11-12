/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_4_BaiMauCRUD_Inteface.service.impl;

import B3_4_BaiMauCRUD_Inteface.model.Sach;
import B3_4_BaiMauCRUD_Inteface.service.QuanLySachService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class QuanLySachServiceImpl implements QuanLySachService {

    @Override
    public void xoa(List<Sach> lists, int index) {
        lists.remove(index);
    }

    @Override
    public List<Sach> searchTheoTen(List<Sach> lists, String ten) {
        List<Sach> listSearch = new ArrayList<>();
        // code
        for (Sach sach : lists) {
            if (sach.getTenSach().contains(ten)) {
                //add vao list search
                listSearch.add(sach);
            }
        }
        return listSearch;
    }

}

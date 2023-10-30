package vn.com.TechnologySale.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.com.TechnologySale.entities.LoaiSanPham;
import vn.com.TechnologySale.services.LoaiSanPhamService;

import java.util.List;

@Controller
public class LoaiSanPhamController {

    @Autowired
    private LoaiSanPhamService loaiSanPhamService;

    @RequestMapping("admin/loaiSanPham")
    public String hienThiDanhSachLoaiSanPham(Model model){
        List<LoaiSanPham> lstLoaiSP = loaiSanPhamService.layDanhSachLoaiSP();

        model.addAttribute("lstLoaiSP", lstLoaiSP);

        return "admin/QuanLyLoaiSanPham";
    }
}

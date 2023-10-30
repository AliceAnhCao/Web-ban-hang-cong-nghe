package vn.com.TechnologySale.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.com.TechnologySale.entities.SanPham;
import vn.com.TechnologySale.entities.SanPhamViewModel;
import vn.com.TechnologySale.services.SanPhamService;

import java.util.List;

@Controller
public class SanPhamController {

    @Autowired
    private SanPhamService sanPhamService;

    @RequestMapping("admin/sanPham")
    public String hienThiDanhSachSanPham(Model model){
        List<SanPham> lstSanPham = sanPhamService.layDanhSach();

        model.addAttribute("lstSP", "lstSanPham");

        model.addAttribute("sanPham", new SanPhamViewModel());

        return "/admin/QuanLySanPham";
        //return trangChuSanPham;
    }

}

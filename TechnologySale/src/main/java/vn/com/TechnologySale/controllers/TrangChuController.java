//package vn.com.TechnologySale.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import vn.com.TechnologySale.entities.SanPham;
//import vn.com.TechnologySale.entities.SanPhamViewModel;
//import vn.com.TechnologySale.services.SanPhamService;
//
//
//import java.util.List;
//
//@Controller
//public class TrangChuController {
//
//    @Autowired
//    private SanPhamService sanPhamService;
//
//    @RequestMapping("/home/trangChu")
//    public String hienThiSachTrangChu(Model model){
//        List<SanPham> lstSanPham = sanPhamService.layDanhSach();
//
//        model.addAttribute("lstSP", lstSanPham);
//
//        model.addAttribute("sanPham", new SanPhamViewModel());
//
//        return "trangChuSanPham";
//
//    }
//
//    @RequestMapping(value = "/home/chiTiet/{ma}", method = RequestMethod.GET)
//    public String hienThiChiTietSanPham(@PathVariable("ma")String ma, Model model)
//    {
//        SanPham objSP = sanPhamService.layThongTinTheoMa(ma);
//
//        if(objSP != null)
//        {
//            model.addAttribute("objSP", objSP);
//
//            return "chiTietSanPham";
//        }
//
//        return "redirect:/home/trangChu";
//    }
//}
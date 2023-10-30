//package vn.com.TechnologySale.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import vn.com.TechnologySale.entities.NguoiDung;
//import vn.com.TechnologySale.entities.NguoiDungModel;
//import vn.com.TechnologySale.services.NguoiDungService;
//
//
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class DangNhapController {
//
//    @RequestMapping("/dangnhap")
//    public String hienThiDangNhap(Model model){
//        model.addAttribute("user", new NguoiDungModel());
//
//
//        return "dangnhap";
//    }
//
//    @Autowired
//    NguoiDungService nguoiDungService;
//
//    @RequestMapping(value="/thucHienDangNhap", method = RequestMethod.POST)
//    public String thucHienDangNhap(@ModelAttribute("user") @Validated NguoiDungModel user, BindingResult result, Model model, HttpSession session)
//    {
//        if(result.hasErrors())
//        {
//            model.addAttribute("thongBao", "Bạn cần phải nhập đầy đủ thông tin");
//        }
//        else {
//            System.out.println("Ten dang nhap: " + user.getTenDangNhap());
//            System.out.println("Mat khau: " + user.getMatKhau());
//
//
//            NguoiDung objUser = nguoiDungService.layNguoiDungTheoTenDN(user.getTenDangNhap());
//
//            if(objUser != null)
//            {
//                if(objUser.getMatKhau().equals(user.getMatKhau()))//true. Trong đó: objUser.getMatKhau() là thông tin lấy từ DB; user.getMatKhau() là thông tin lấy từ object Binding từ giao diện
//                {
//                    session.setAttribute("UserOnline", user.getTenDangNhap()); //name phải trùng với tên trong AuthorizationInterceptorAdapter.java
//
//                    return "redirect:/admin/sanPham";
//                }
//                else
//                {
//                    model.addAttribute("thongBao", "Mật khẩu không đúng");
//                }
//            }
//            else
//            {
//                model.addAttribute("thongBao", "Tài khoản không tồn tại");
//            }
//
//        }
//
//        model.addAttribute("user", user);
//
//        return "dangnhap";
//    }
//}
//

//package vn.com.TechnologySale.interceptor;
//
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class AuthorizationInterceptorAdapter extends HandlerInterceptorAdapter  {
//
//    /**
//     * Phương thức lấy thông tin của session từ DangNhapController và xác thực thông tin đó khác null để
//     * @param request
//     * @param response
//     * @param handler
//     * @return
//     * @throws Exception
//     */
//    //@Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//            throws Exception {
//
//        HttpSession session = request.getSession();
//
//        if(session!= null && session.getAttribute("UserOnline") != null) //name được lấy từ DangNhapController theo session được tạo (Xem lại bài dạy về làm việc với session)
//        {
//            System.out.println("Bạn đang đăng nhập với tài khoản: " + session.getAttribute("userOnline"));
//        }
//        else
//        {
//            response.sendRedirect("../dangnhap");
//        }
//
//        return super.preHandle(request, response, handler);
//    }
//}

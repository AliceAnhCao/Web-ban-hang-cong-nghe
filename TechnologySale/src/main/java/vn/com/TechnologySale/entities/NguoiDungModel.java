package vn.com.TechnologySale.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class NguoiDungModel {

    @NotNull(message="Bạn cần phải nhập tên đăng nhập")
    @NotBlank(message="Bạn cần phải nhập tên đăng nhập")
    private String tenDangNhap;

    @NotNull(message="Bạn cần phải nhập mật khẩu")
    @NotBlank(message="Bạn cần phải nhập mật khẩu")
    private String matKhau;

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

}

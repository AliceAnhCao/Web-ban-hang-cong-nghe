package vn.com.TechnologySale.models;

import vn.com.TechnologySale.entities.SanPham;

import java.util.List;

public interface SanPhamDao extends IHanhDong<SanPham, String>{

    List<SanPham> timKiemThongTin(String maSanPham, String tuKhoa);
}

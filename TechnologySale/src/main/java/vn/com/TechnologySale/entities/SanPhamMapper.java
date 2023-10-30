package vn.com.TechnologySale.entities;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SanPhamMapper implements RowMapper<SanPham>{
    public SanPham mapRow(ResultSet rs, int rowNum) throws SQLException {

        SanPham objSanPham = new SanPham();

        objSanPham.setAnhSP(rs.getString("MaSP"));
        objSanPham.setTenSP(rs.getString("TenSP"));
        objSanPham.setCauHinh(rs.getString("CauHinh"));
        objSanPham.setAnhSP(rs.getString("AnhSP"));
        objSanPham.setGiaSP(rs.getFloat("GiaSP"));
        objSanPham.setNhaSanXuat(rs.getString("NhaSanXuat"));
        objSanPham.setNgayTao(rs.getDate("NgayTao"));
        objSanPham.setNgayCapNhat(rs.getDate("NgayCapNhat"));
        objSanPham.setMaLoaiSP(rs.getString("MaLoaiSP"));
        objSanPham.setSoLuong(rs.getInt("SoLuong"));

        return objSanPham;
    }
}

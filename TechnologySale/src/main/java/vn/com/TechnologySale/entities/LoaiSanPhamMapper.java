package vn.com.TechnologySale.entities;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoaiSanPhamMapper implements RowMapper<LoaiSanPham>{
    public LoaiSanPham mapRow(ResultSet rs, int rowNum) throws SQLException {

        LoaiSanPham objLoaiSanPham = new LoaiSanPham();

        objLoaiSanPham.setMaLoaiSPId(rs.getString("MaLoaiSPId"));
        objLoaiSanPham.setTenLoaiSanPham(rs.getString("TenLoaiSP"));

        return objLoaiSanPham;
    }
}

package vn.com.TechnologySale.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.TechnologySale.entities.SanPham;
import vn.com.TechnologySale.models.SanPhamDao;

import java.util.List;


@Service
public class SanPhamService {

    @Autowired
    private SanPhamDao sanPhamDao;

    public List<SanPham> layDanhSach(){
        return sanPhamDao.getList();
    }

    public SanPham layThongTinTheoMa(String id){
        return sanPhamDao.getById(id);
    }

    public boolean themMoi(SanPham objSP){
        return sanPhamDao.add(objSP);
    }

    public boolean capNhat(SanPham objSP){
        return sanPhamDao.update(objSP);
    }

    public boolean xoa(String id){
        return sanPhamDao.delete(id);
    }

    public List<SanPham> timKiemThongTin(String maSanPham, String tuKhoa){
        return sanPhamDao.timKiemThongTin(maSanPham, tuKhoa);
    }
}

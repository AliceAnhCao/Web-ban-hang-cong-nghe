package vn.com.TechnologySale.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.TechnologySale.entities.LoaiSanPham;
import vn.com.TechnologySale.entities.SanPham;
import vn.com.TechnologySale.models.LoaiSanPhamDao;
import vn.com.TechnologySale.models.SanPhamDao;

import java.util.List;

@Service
public class LoaiSanPhamService {

    @Autowired
    private LoaiSanPhamDao loaiSanPhamDao;

    public List<LoaiSanPham> layDanhSachLoaiSP(){
        return loaiSanPhamDao.getList();
    }


}

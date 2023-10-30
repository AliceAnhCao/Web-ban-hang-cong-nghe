package vn.com.TechnologySale.entities;
import javax.persistence.*;

@Entity
@Table(name = "LoaiSanPham")
public class LoaiSanPham {

    @Id
    @Column(name="MaLoaiSPId", unique = true, nullable = false, length = 10)
    private String maLoaiSPId;

    @Column(name="TenLoaiSanPham", nullable = false, length = 150)
    private String tenLoaiSanPham;

//    MaLoaiSPId varchar(10) primary key,
//    TenLoaiSanPham varchar(150)


    public String getMaLoaiSPId() {
        return maLoaiSPId;
    }

    public void setMaLoaiSPId(String maLoaiSPId) {
        this.maLoaiSPId = maLoaiSPId;
    }

    public String getTenLoaiSanPham() {
        return tenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }
}

package vn.com.TechnologySale.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="SanPham")

public class SanPham {

    @Id
    @Column(name="MaSP", nullable = false, unique=true, length = 10)
    private String maSP;

    @Column(name="TenSP", nullable = false, length = 150)
    private String tenSP;

    @Column(name="NhaSanXuat", nullable = true, length = 150)
    private String nhaSanXuat;

    @Column(name="CauHinh", nullable = true, length = 500)
    private String cauHinh;

    @Column(name="AnhSP", nullable = true, length = 100)
    private String anhSP;

    @Column(name="GiaSP", nullable = true)
    private float giaSP;

    @Column(name="NgayTao", nullable = true)
    private Date ngayTao;

    @Column(name="NgayCapNhat", nullable = true)
    private Date ngayCapNhat;

    @Column(name="MaLoaiSP", nullable = false, length = 10)
    private String maLoaiSP;

    @Column(name="SoLuong", nullable = true)
    private int soLuong;

    //MaSP varchar(10) unique primary key,
    //TenSP varchar(150),
    //NhaSanXuat varchar(150),
    //CauHinh varchar(500),
    //AnhSP varchar(100),
    //GiaSP float,
    //NgayTao date,
    //NgayCapNhat date,
    //MaLoaiSP varchar(10),
    //SoLuong int

    public String getMaSP(String maSP) {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
    }

    public String getAnhSP() {
        return anhSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public String getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}

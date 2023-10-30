package vn.com.TechnologySale.models;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import vn.com.TechnologySale.entities.SanPham;
import vn.com.TechnologySale.entities.SanPhamMapper;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SanPhamImpl implements SanPhamDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SanPham> timKiemThongTin(String maSanPham, String tuKhoa) {
        List<SanPham> lstSP = new ArrayList<SanPham>();

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        Transaction tx = session.beginTransaction();

        String sql = "SELECT * FROM Sach where 1=1";

        if(!tuKhoa.isEmpty())
        {
            sql += " AND (MaSP = '" + tuKhoa + "' OR TenSP like '%" + tuKhoa + "%' OR CauHinh like '%" + tuKhoa + "%')";
        }

        if(!maSanPham.isEmpty())
        {
            sql += " AND MaSP = '" + maSanPham + "'";
        }

        TypedQuery<SanPham> query =session.createNativeQuery(sql);

        lstSP = query.getResultList();

        tx.commit();

        return lstSP;

    }

    /**
     * Hàm trả về danh sách sản phẩm
     * @return
     */
    public List<SanPham> getList() {
        List<SanPham> lstSP =new ArrayList<SanPham>();

        //Khởi tạo một session
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();

        //Khởi tạo một transaction
        Transaction tx = session.beginTransaction();

        TypedQuery<SanPham> query =session.createQuery("from SanPham", SanPham.class);

        //Lấy danh sách
        lstSP = query.getResultList();

        tx.commit();

        return lstSP;
    }

    /**
     * Hàm lấy thông tin Sản phẩm theo id
     * @param id
     * @return
     */
    public SanPham getById(String id) {
        //Khởi tạo một session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        //Khởi tạo một transaction
        Transaction tx = session.beginTransaction();

        //Lấy đối tượng theo mã
        SanPham sanPham = session.get(SanPham.class,id);

        tx.commit();

        return sanPham;
    }

    /**
     * Hàm thêm mới thông tin sản phẩm
     * @param objT
     * @return
     */
    public boolean add(SanPham objT) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        Transaction tx = session.beginTransaction();

        session.save(objT);

        tx.commit();

        return true;
    }

    /**
     * Hàm cập nhật thông tin sản phẩm
     * @param objT
     * @return
     */
    public boolean update(SanPham objT) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        Transaction tx = session.beginTransaction();

        session.update(objT);

        tx.commit();

        return true;
    }

    /**
     * Hàm xóa thông tin sản phẩm
     * @param id
     * @return
     */
    public boolean delete(String id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        Transaction tx = session.beginTransaction();

        SanPham sanPham = session.get(SanPham.class,id);

        if(sanPham!=null){
            session.delete(sanPham);

            tx.commit();

            return true;
        }

        tx.commit();

        return false;
    }
}

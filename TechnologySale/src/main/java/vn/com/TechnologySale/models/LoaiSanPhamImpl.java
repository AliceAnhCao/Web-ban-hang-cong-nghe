package vn.com.TechnologySale.models;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import vn.com.TechnologySale.entities.LoaiSanPham;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LoaiSanPhamImpl implements LoaiSanPhamDao{


    public List<LoaiSanPham> getList() {
        List<LoaiSanPham>lstLoaiSP = new ArrayList<LoaiSanPham>();

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        Transaction tx = session.beginTransaction();

        TypedQuery<LoaiSanPham> query = session.createQuery("from LoaiSanPham", LoaiSanPham.class);

        lstLoaiSP = query.getResultList();

        tx.commit();

        return lstLoaiSP;
    }

    public LoaiSanPham getById(String id) {
        return null;
    }

    public boolean add(LoaiSanPham objT) {
        return false;
    }

    public boolean update(LoaiSanPham objT) {
        return false;
    }

    public boolean delete(String id) {
        return false;
    }
}

//package vn.com.TechnologySale.models;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import vn.com.TechnologySale.entities.NguoiDung;
//
//import javax.persistence.TypedQuery;
//import java.util.ArrayList;
//import java.util.List;
//
//public class NguoiDungImpl implements NguoiDungDao{
//    public NguoiDung kiemTraDangNhap(String tenDN) {
//        List<NguoiDung> lstUsers = new ArrayList<NguoiDung>();
//
//
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//
//
//        Transaction tx = session.beginTransaction();
//
//        TypedQuery<NguoiDung> query = session.createQuery("from NguoiDung where tenDangNhap = :tenDN", NguoiDung.class);
//
//        query.setParameter("tenDN", tenDN);
//
//
//        lstUsers = query.getResultList();
//
//        tx.commit();
//
//        if(lstUsers.size() > 0){
//            return lstUsers.get(0);
//        }
//        return null;
//    }
//
//    public List<NguoiDung> getList() {
//        return null;
//    }
//
//    public NguoiDung getById(Integer id) {
//        return null;
//    }
//
//    public boolean add(NguoiDung objT) {
//        return false;
//    }
//
//    public boolean update(NguoiDung objT) {
//        return false;
//    }
//
//    public boolean delete(Integer id) {
//        return false;
//    }
//}

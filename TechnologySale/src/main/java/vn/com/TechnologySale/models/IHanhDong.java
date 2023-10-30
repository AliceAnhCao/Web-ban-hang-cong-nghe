package vn.com.TechnologySale.models;

import java.util.List;

public interface IHanhDong<T, idT> {

    List<T> getList();

    T getById(idT id);

    boolean add(T objT);

    boolean update(T objT);

    boolean delete(idT id);

}

package com.selflearning.webapp.common.datasource.dao;

import com.selflearning.webapp.common.BaseBean;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author abed.alshorofat
 * @param <T>
 * @param <ID>
 */
public interface SelectDao<T extends BaseBean,ID> extends GenericDao<T, ID>{
    
    List<Optional<T>> findAllOfThem();
    
    Optional<T> findItBy(ID identfier);
    
}

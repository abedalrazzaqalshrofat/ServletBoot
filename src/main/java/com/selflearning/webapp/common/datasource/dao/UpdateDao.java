package com.selflearning.webapp.common.datasource.dao;

import com.selflearning.webapp.common.BaseBean;
import com.selflearning.webapp.exceptions.UserDoesNotExistException;

/**
 *
 * @author abed.alshorofat
 * @param <T>
 * @param <ID>
 */
public interface UpdateDao<T extends BaseBean,ID> extends GenericDao<T, ID> {
    
    void updateIt(T type, ID identfier) throws UserDoesNotExistException;
    
    void updateIfExist(T type, ID identfier);
    
}

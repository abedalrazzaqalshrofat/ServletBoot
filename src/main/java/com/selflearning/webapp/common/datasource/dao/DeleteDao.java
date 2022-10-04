package com.selflearning.webapp.common.datasource.dao;

import com.selflearning.webapp.common.BaseBean;
import com.selflearning.webapp.exceptions.UserDoesNotExistException;

/**
 *
 * @author abed.alshorofat
 * @param <T>
 * @param <ID>
 */
public interface DeleteDao<T extends BaseBean,ID> extends GenericDao<T, ID> {
    
    void deleteItIfIExist(T type);
    
    void deleteUser(T t) throws UserDoesNotExistException;
    
}

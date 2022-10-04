package com.selflearning.webapp.common.datasource.dao;

import com.selflearning.webapp.common.BaseBean;


/**
 *
 * @author abed.alshorofat
 * @param <T>
 * @param <ID>
 */
public interface GenericDao<T extends BaseBean,ID> {
    

    boolean checkIfDoesItExist(ID identify);
    

}

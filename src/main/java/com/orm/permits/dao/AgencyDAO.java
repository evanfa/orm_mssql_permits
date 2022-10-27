package com.orm.permits.dao;

import com.orm.permits.domain.Agency;

public class AgencyDAO extends AbstractDao<Agency>{
    public AgencyDAO() {
        setClazz(Agency.class);
    }
}

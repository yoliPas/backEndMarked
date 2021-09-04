/*
    @uthor: Yolanda Pascual Rivera
*/

package com.example.market.repository;

import com.example.market.model.ModelBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GenericRepository<T extends ModelBase> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
}

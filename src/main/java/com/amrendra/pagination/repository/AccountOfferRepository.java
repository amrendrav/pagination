package com.amrendra.pagination.repository;

import com.amrendra.pagination.domain.AccountOfferEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountOfferRepository extends  PagingAndSortingRepository<AccountOfferEntity, Long>{

    Page<AccountOfferEntity> findAll(Pageable pageable);

}

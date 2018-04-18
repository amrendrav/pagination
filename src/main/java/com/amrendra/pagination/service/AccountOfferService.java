package com.amrendra.pagination.service;

import com.amrendra.pagination.domain.AccountOfferEntity;
import com.amrendra.pagination.repository.AccountOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AccountOfferService {

    @Autowired
    private AccountOfferRepository accountOfferRepository;

    public Page<AccountOfferEntity> findPaginated(Pageable pageable) {
        return accountOfferRepository.findAll(pageable);
    }

}

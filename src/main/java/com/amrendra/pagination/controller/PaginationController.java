package com.amrendra.pagination.controller;

import com.amrendra.pagination.domain.AccountOfferEntity;
import com.amrendra.pagination.service.AccountOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginationController {

    @Autowired
    private AccountOfferService accountOfferService;

    @GetMapping("/findAll")
    public Page<AccountOfferEntity> fetchAllData(Pageable pageable){
        Page<AccountOfferEntity> result = accountOfferService.findPaginated(pageable);
        return result;
    }
}

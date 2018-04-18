package com.amrendra.pagination.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="ACCT_OFFER_TEST")
public class AccountOfferEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ACCT_OFFER_ID")
    private Long acctOfferId;

    @Column(name="ACCT_NBR")
    private String acctNumber;

    @Column(name="CLNT_ID")
    private Long clientId;

    @Column(name = "CR_USER_NM")
    private String createdBy;

    public AccountOfferEntity() {
        // TODO Auto-generated constructor stub
    }

    public AccountOfferEntity(Long acctOfferId, Integer offerID, Long acctID, String acctNumber, String createUser,
                              LocalDateTime createTS, short acctOfferStatusID, Long clientId, String accountNumber,
                              Long accountOfferStatusTimeStamp) {
        super();
        this.acctOfferId = acctOfferId;
        this.acctNumber = acctNumber;
        this.clientId = clientId;
    }

    public Long getAcctOfferId() {
        return acctOfferId;
    }

    public void setAcctOfferId(Long acctOfferId) {
        this.acctOfferId = acctOfferId;
    }


    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;

    }


}


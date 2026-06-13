package com.codingshuttle.razorpay.operations.entity;

import jakarta.persistence.*;

//@Entity
//@Table(name = "settlement_payment")
//public class SettlementPayment {
//
//    @EmbeddedId
//    private SettlementPaymentId id;
//
//    @MapsId()
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "settlement_id", nullable = false)
//    private Settlement settlement;
//}
//
//


@Entity
@Table(name = "settlement_payment")
public class SettlementPayment {

    @EmbeddedId
    private SettlementPaymentId id;

    @MapsId("settlementId")   // ← specify the field name from SettlementPaymentId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "settlement_id", nullable = false)
    private Settlement settlement;
}
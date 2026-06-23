package com.codingshuttle.razorpay.operations.entity;

import jakarta.persistence.Embeddable;

import java.util.UUID;
import java.util.Objects;
import java.io.Serializable;

@Embeddable
public class SettlementPaymentId {

    private UUID settlementId;

    private UUID paymentId;
}


//
//@Embeddable
//public class SettlementPaymentId implements Serializable {  // ← add this
//
//    private UUID settlementId;
//    private UUID paymentId;
//
//    // also add equals() and hashCode() — required for composite keys
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof SettlementPaymentId that)) return false;
//        return Objects.equals(settlementId, that.settlementId) &&
//                Objects.equals(paymentId, that.paymentId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(settlementId, paymentId);
//    }
//}

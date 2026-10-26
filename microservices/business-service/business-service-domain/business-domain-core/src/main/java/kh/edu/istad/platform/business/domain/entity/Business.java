package kh.edu.istad.platform.business.domain.entity;

import kh.edu.istad.common.domain.entity.AggregateRoot;
import kh.edu.istad.common.domain.valueobject.BusinessId;
import kh.edu.istad.platform.business.domain.valueobject.BusinessContact;
import kh.edu.istad.platform.business.domain.valueobject.BusinessName;

public class Business extends AggregateRoot<BusinessId> {
    private final BusinessName businessName;
    private final BusinessContact businessContact;
    private OrderApproval orderApproval;
    private Boolean active;
    private final OrderDetail orderDetail;

    private Business(Builder builder) {
        super.setId(builder.id);
        businessName = builder.businessName;
        businessContact = builder.businessContact;
        orderApproval = builder.orderApproval;
        active = builder.active;
        orderDetail = builder.orderDetail;
    }


    public static final class Builder {
        private BusinessId id;
        private BusinessName businessName;
        private BusinessContact businessContact;
        private OrderApproval orderApproval;
        private Boolean active;
        private OrderDetail orderDetail;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(BusinessId val) {
            id = val;
            return this;
        }

        public Builder businessName(BusinessName val) {
            businessName = val;
            return this;
        }

        public Builder businessContact(BusinessContact val) {
            businessContact = val;
            return this;
        }

        public Builder orderApproval(OrderApproval val) {
            orderApproval = val;
            return this;
        }

        public Builder active(Boolean val) {
            active = val;
            return this;
        }

        public Builder orderDetail(OrderDetail val) {
            orderDetail = val;
            return this;
        }

        public Business build() {
            return new Business(this);
        }
    }
}

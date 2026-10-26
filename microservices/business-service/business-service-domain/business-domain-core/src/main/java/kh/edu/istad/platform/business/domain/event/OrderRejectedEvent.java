package kh.edu.istad.platform.business.domain.event;

import kh.edu.istad.common.domain.valueobject.BusinessId;
import kh.edu.istad.platform.business.domain.entity.OrderApproval;

import java.time.ZonedDateTime;
import java.util.List;

public record OrderRejectedEvent(
        OrderApproval orderApproval,
        BusinessId businessId,
        List<String> failureMessages,
        ZonedDateTime createdAt
) {
}

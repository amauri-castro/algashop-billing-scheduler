package com.algashop.billingscheduler.infrastructure;

import com.algashop.billingscheduler.application.CancelExpiredInvoicesApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class CancelExpiredInvoiceScheduler {

    private final CancelExpiredInvoicesApplicationService applicationService;

    @Scheduled(fixedRate = 5000) // executa a cada 5 segundos
    public void runTask() {
        log.info("Task started - Cancelling expired invoices.");
        applicationService.cancelExpiredInvoices();
        log.info("Task ended - Expired invoices.");
    }
}

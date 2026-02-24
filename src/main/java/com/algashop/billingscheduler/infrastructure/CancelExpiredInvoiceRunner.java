package com.algashop.billingscheduler.infrastructure;

import com.algashop.billingscheduler.application.CancelExpiredInvoicesApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class CancelExpiredInvoiceRunner implements ApplicationRunner {

    private final CancelExpiredInvoicesApplicationService applicationService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Task started - Cancelling expired invoices.");
        applicationService.cancelExpiredInvoices();
        log.info("Task ended - Expired invoices.");
    }
}

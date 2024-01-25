package com.bikiranmaji.inventorymicroservice.service;

import com.bikiranmaji.inventorymicroservice.dto.InventoryResponse;
import com.bikiranmaji.inventorymicroservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
//    @SneakyThrows
    public List<InventoryResponse> isInStock(List<String> skuCode) throws InterruptedException {
//        log.info("Wait Started");
//        Thread.sleep(10000);
//        log.info("Wait Ended");
        log.info("Checking Inventory");
        return inventoryRepository.findBySkuCodeIn(skuCode)
                .stream().map(inventory ->
                    InventoryResponse.builder()
                            .skuCode(inventory.getSkuCode())
                            .isInStock(inventory.getQuantity() > 0)
                            .build()
                ).toList();
    }
}

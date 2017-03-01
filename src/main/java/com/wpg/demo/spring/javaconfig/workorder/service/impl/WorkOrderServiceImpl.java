package com.wpg.demo.spring.javaconfig.workorder.service.impl;

import com.wpg.demo.spring.javaconfig.workorder.domain.WorkOrder;
import com.wpg.demo.spring.javaconfig.workorder.repository.WorkOrderRepository;
import com.wpg.demo.spring.javaconfig.workorder.service.WorkOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author ChangWei Li
 * @version 2017-02-28 13:27
 */
@Service
@Transactional
public class WorkOrderServiceImpl implements WorkOrderService {

    private final WorkOrderRepository workOrderRepository;

    public WorkOrderServiceImpl(WorkOrderRepository workOrderRepository) {
        this.workOrderRepository = workOrderRepository;
    }

    @Override
    public int add(WorkOrder workOrder) {
        workOrderRepository.add(workOrder);
        return 1;
    }

    @Override
    public int delete(Integer id) {
        return workOrderRepository.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Map<String, Object>> list() {
        return workOrderRepository.list();
    }
}

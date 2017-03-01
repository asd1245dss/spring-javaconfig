package com.wpg.demo.spring.javaconfig.workorder.service;

import com.wpg.demo.spring.javaconfig.workorder.domain.WorkOrder;

import java.util.List;
import java.util.Map;

/**
 * @author ChangWei Li
 * @version 2017-02-28 13:26
 */
public interface WorkOrderService {

    int add(WorkOrder workOrder);

    int delete(Integer id);

    List<Map<String, Object>> list();

}

package com.wpg.demo.spring.javaconfig.workorder.service;

import com.wpg.demo.spring.javaconfig.ApplicationTestConfig;
import com.wpg.demo.spring.javaconfig.workorder.domain.WorkOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author ChangWei Li
 * @version 2017-02-28 13:55
 */
public class WorkOrderServiceTest extends ApplicationTestConfig {

    @Autowired
    private WorkOrderService workOrderService;

    @Test
    public void add() {
        WorkOrder workOrder = new WorkOrder();
        workOrder.setId(11);
        workOrder.setReflectorName("13");
        workOrder.setReflectorPhone("18538738632");

        assertEquals(1, workOrderService.add(workOrder));
    }

    @Test
    public void delete() {
        assertEquals(1, workOrderService.delete(1));
    }

    @Test
    public void list() {
        List<Map<String, Object>> list = workOrderService.list();

        assertNotNull(list);
        assertEquals(10, list.size());
    }

}

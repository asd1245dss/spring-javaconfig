package com.wpg.demo.spring.javaconfig.workorder.controller;

import com.wpg.demo.spring.javaconfig.workorder.domain.WorkOrder;
import com.wpg.demo.spring.javaconfig.workorder.service.WorkOrderService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * @author ChangWei Li
 * @version 2017-03-01 09:46
 */
@RestController
@RequestMapping("/workorder")
public class WorkOrderController {

    private final WorkOrderService workOrderService;

    public WorkOrderController(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }


    @PostMapping("/add")
    public int add(@Valid WorkOrder workOrder, BindingResult result) {
        if (result.hasErrors()) {
            return 0;
        }
        return workOrderService.add(workOrder);
    }

    @DeleteMapping("/delete")
    public int delete(int id) {
        return workOrderService.delete(id);
    }

    @GetMapping("/list")
    public List<Map<String, Object>> list() {
        return workOrderService.list();
    }

}

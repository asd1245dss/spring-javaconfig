package com.wpg.demo.spring.javaconfig.workorder.repository.impl;

import com.wpg.demo.spring.javaconfig.workorder.domain.WorkOrder;
import com.wpg.demo.spring.javaconfig.workorder.repository.WorkOrderRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Spring enable transparently exception translation through {@link Repository} annotation
 * @author ChangWei Li
 * @version 2017-02-28 13:27
 */
@Repository
public class WorkOrderRepositoryImpl implements WorkOrderRepository {

    private final JdbcTemplate jdbcTemplate;

    public WorkOrderRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int add(WorkOrder workOrder) {
        return jdbcTemplate.update("INSERT INTO work_order (ID, reflector_name, reflector_phone) VALUES (?, ?, ?)",
                workOrder.getId(), workOrder.getReflectorName(), workOrder.getReflectorPhone());
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("DELETE FROM work_order WHERE ID = ?", id);
    }

    @Override
    public List<Map<String, Object>> list() {
        return jdbcTemplate.queryForList("SELECT id AS id, " +
                "reflector_name AS reflectorName, " +
                "reflector_phone AS reflectorPhone " +
                "FROM work_order LIMIT 10");
    }
}

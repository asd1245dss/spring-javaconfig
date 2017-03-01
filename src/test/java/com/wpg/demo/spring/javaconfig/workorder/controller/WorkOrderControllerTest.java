package com.wpg.demo.spring.javaconfig.workorder.controller;

import com.wpg.demo.spring.javaconfig.ApplicationTestConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
/**
 * @author ChangWei Li
 * @version 2017-03-01 09:50
 */
@Ignore
public class WorkOrderControllerTest extends ApplicationTestConfig {

    @Autowired
    private WebApplicationContext wac;


    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void list() throws Exception {
        mockMvc.perform(get("/workorder/list"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").exists());
    }

}

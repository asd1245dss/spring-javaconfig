package com.wpg.demo.spring.javaconfig.workorder.domain;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author ChangWei Li
 * @version 2017-02-28 13:26
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WorkOrder {

    @Max(10)
    @Min(1)
    private Integer id;

    @NotNull
    private String reflectorName;

    @NotNull
    private String reflectorPhone;

}

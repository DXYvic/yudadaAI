package com.yupi.yudada.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 审核请求
 *
 */
@Data
public class ReviewRequest implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 状态：0-待审核，1-审核通过，2-审核不通过
     */
    private Integer reviewStatus;
    /**
     * 审核信息
     */
    private String reviewMessage;


    private static final long serialVersionUID = 1L;
}
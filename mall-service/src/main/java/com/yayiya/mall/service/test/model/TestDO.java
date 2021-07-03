package com.yayiya.mall.service.test.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 *
 * @author xfd
 * 2021/7/3
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("test")
public class TestDO
{
    /** 主键, 默认唯一标识 */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;
}

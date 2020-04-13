package com.example.mybatisplus.vod.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 点播资源类型
 * </p>
 *
 * @author 林乐福
 * @since 2020-04-02
 */
@TableName("vm_resource_type")
@ApiModel(value="ResourceType对象", description="点播资源类型")
public class ResourceType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "创建人id")
    @TableField("createUserId")
    private String createUserId;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private String createTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ResourceType{" +
            "Id=" + Id +
            ", name=" + name +
            ", createUserId=" + createUserId +
            ", createTime=" + createTime +
        "}";
    }
}

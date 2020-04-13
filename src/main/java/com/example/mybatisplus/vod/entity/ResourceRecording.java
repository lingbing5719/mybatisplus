package com.example.mybatisplus.vod.entity;


import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author 林乐福
 * @since 2020-04-02
 */

@TableName("vm_resource_recording")
@ApiModel(value="ResourceRecording对象", description="")
public class ResourceRecording implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("resourceId")
    private String resourceId;

    @TableField("playTime")
    private Double playTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    public Double getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Double playTime) {
        this.playTime = playTime;
    }

    @Override
    public String toString() {
        return "ResourceRecording{" +
            "Id=" + Id +
            ", resourceId=" + resourceId +
            ", playTime=" + playTime +
        "}";
    }
}

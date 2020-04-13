package com.example.mybatisplus.live.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.live.entity.LiveServer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import javafx.scene.control.Pagination;

import java.util.List;

/**
 * <p>
 * 直播地址维护 Mapper 接口
 * </p>
 *
 * @author 林乐福
 * @since 2020-04-02
 */
public interface LiveServerMapper extends BaseMapper<LiveServer> {

 List<LiveServer> selectList(Page<LiveServer> page, String name);
}

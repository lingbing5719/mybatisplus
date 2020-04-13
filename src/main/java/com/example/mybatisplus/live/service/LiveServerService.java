package com.example.mybatisplus.live.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.live.entity.LiveServer;
import com.baomidou.mybatisplus.extension.service.IService;
import javafx.scene.control.Pagination;

import java.util.List;

/**
 * <p>
 * 直播地址维护 服务类
 * </p>
 *
 * @author 林乐福
 * @since 2020-04-02
 */
public interface LiveServerService extends IService<LiveServer> {

    public Page<LiveServer> selectPage(Page<LiveServer> page, String name) ;


}

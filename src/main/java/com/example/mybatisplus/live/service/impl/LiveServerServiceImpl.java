package com.example.mybatisplus.live.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.live.entity.LiveServer;
import com.example.mybatisplus.live.mapper.LiveServerMapper;
import com.example.mybatisplus.live.service.LiveServerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import javafx.scene.control.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 直播地址维护 服务实现类
 * </p>
 *
 * @author 林乐福
 * @since 2020-04-02
 */
@Service
public class LiveServerServiceImpl extends ServiceImpl<LiveServerMapper, LiveServer> implements LiveServerService {
    @Autowired
    LiveServerMapper liveServerMapper;


    @Override
    public Page<LiveServer> selectPage(Page<LiveServer> page, String name) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题
        // page.setOptimizeCountSql(false);
        // 不查询总记录数
        // page.setSearchCount(false);
        // 注意！！ 分页 total 是经过插件自动 回写 到传入 page 对象
        return page.setRecords(liveServerMapper.selectList(page, name));
    }

}

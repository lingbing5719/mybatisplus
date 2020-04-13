package com.example.mybatisplus.live.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.live.entity.LiveServer;
import com.example.mybatisplus.live.service.LiveServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 直播地址维护 前端控制器
 * </p>
 *
 * @author 林乐福
 * @since 2020-04-02
 */
@RestController
@RequestMapping("/live/live-server")
public class LiveServerController {
   @Autowired
   LiveServerService liveServerService;
@PostMapping("/save")
    public void save(){
        LiveServer liveServer=new LiveServer();

    double random = Math.random();//产生一个[0，1)之间的随机数
//    System.out.println("@@@@@@@@@@@@@@@@@@"+random);

    liveServer.setName("@@@@@@@@@@@@@@@@@@"+random);
        liveServerService.save(liveServer);
    }

    @GetMapping("mylist")
    public void list(){
//        QueryWrapper<LiveServer> wrapper = new QueryWrapper<>();
//        wrapper.ge("id",1);
//        Page<LiveServer> page = new Page<>(1, 2);
//        IPage<LiveServer> userIPage =  liveServerService.mylist(page,"3333");
//        System.out.println("总条数"+userIPage.getTotal());
//        System.out.println("总页数"+userIPage.getPages());
        Page<LiveServer> page = new Page<>(1, 2);
        Page<LiveServer>  liveServerPage= liveServerService.selectPage(page,"3333");
        System.out.println("总条数"+liveServerPage.getTotal());
        System.out.println("总页数"+liveServerPage.getPages());
    }
}

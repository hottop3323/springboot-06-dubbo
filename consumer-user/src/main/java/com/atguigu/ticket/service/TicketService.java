package com.atguigu.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service    //dubbo的service 将服务发布出去
public interface TicketService {

    public String getTicket();
}

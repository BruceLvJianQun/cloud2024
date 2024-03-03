package com.jianqun.springcloud.controller;


import com.jianqun.springcloud.entities.CommonResult;
import com.jianqun.springcloud.entities.Payment;
import com.jianqun.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("数据插入成功");
       if (result > 0) {
           return new CommonResult<>(200,"插入数据成功");
       }else {
           return new CommonResult<>(444,"插入数据失败");
       }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询到的数据是:" + payment);
        log.info("查询数据成功");
        if (payment != null) {
            return new CommonResult<>(200,"查询数据成功",payment);
        }else {
            return new CommonResult<>(444,"没有查询到记录");
        }
    }
}


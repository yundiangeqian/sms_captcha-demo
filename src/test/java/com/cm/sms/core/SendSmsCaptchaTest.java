package com.cm.sms.core;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.cm.sms.util.CreateRandomNumUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SendSmsCaptchaTest {
    private static final Logger logger = LoggerFactory.getLogger(SendSmsCaptchaTest.class);

    @Test
    public void sendSms() {
        SmsCaptcha smsCaptcha = new SmsCaptcha();
        smsCaptcha.setPhoneNumbers("手机号码");
        String captcha = CreateRandomNumUtil.createrandomNum(6);
        smsCaptcha.setTemplateParam("{\"captcha\": \"" + captcha + "\"}");
        SendSmsResponse sendSmsResponse = SendSmsCaptcha.sendSms(smsCaptcha);
        logger.info("短信返回：{}", JSON.toJSONString(sendSmsResponse));
    }
}
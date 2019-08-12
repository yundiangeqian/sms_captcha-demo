package com.cm.sms.core;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: 发送短信验证码
 * @author: caomian
 * @data: 2019/8/12 10:20
 */
public class SendSmsCaptcha {
    private static final Logger logger = LoggerFactory.getLogger(SendSmsCaptcha.class);

    public static SendSmsResponse sendSms(SmsCaptcha smsCaptcha) {
        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile(smsCaptcha.getRegionId(), smsCaptcha.getAccessKeyId(), smsCaptcha.getAccessKeySecret());
        DefaultProfile.addEndpoint(smsCaptcha.getRegionId(), smsCaptcha.getProduct(), smsCaptcha.getDomain());
        IAcsClient acsClient = new DefaultAcsClient(profile);

        SendSmsRequest sendSmsRequest = new SendSmsRequest();
        sendSmsRequest.setPhoneNumbers(smsCaptcha.getPhoneNumbers());
        sendSmsRequest.setSignName(smsCaptcha.getSignName());
        sendSmsRequest.setTemplateCode(smsCaptcha.getTemplateCode());
        sendSmsRequest.setTemplateParam(smsCaptcha.getTemplateParam());
        sendSmsRequest.setActionName(smsCaptcha.getAction());

        SendSmsResponse sendSmsResponse = null;
        try {
            sendSmsResponse = acsClient.getAcsResponse(sendSmsRequest);
        } catch (ClientException e) {
            logger.error("发送短信出现异常：{}", e.getMessage());
        }
        return sendSmsResponse;
    }
}

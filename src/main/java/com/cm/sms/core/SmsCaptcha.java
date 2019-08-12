package com.cm.sms.core;

/**
 * @description:短信验证码，参数参考阿里短信服务
 * @author: caomian
 * @data: 2019/8/12 9:48
 */
public class SmsCaptcha {
    private Integer id;
    /**
     * 短信API产品名称（固定，无需修改）
     */
    private String product = "Dysmsapi";
    /**
     * 短信API产品域名（固定，无需修改）
     */
    private String domain = "dysmsapi.aliyuncs.com";
    /**
     * 区域ID
     */
    private String regionId = "your regionId";
    /**
     * 访问秘钥ID
     */
    private String accessKeyId = "your accessKeyId";
    /**
     * 访问秘钥
     */
    private String accessKeySecret = "your accessKeySecret";
    /**
     * 签名
     */
    private String signName = "your signName";
    /**
     * 模板code
     */
    private String templateCode = "your templateCode";
    /**
     * 模板参数 JSON格式
     */
    private String templateParam;
    /**
     * 支持对多个手机号码发送短信，手机号码之间以英文逗号（,）分隔
     */
    private String phoneNumbers;
    /**
     * 系统规定参数。取值：SendSms。
     */
    private String action = "SendSms";

    public SmsCaptcha() {
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getProduct() {
        return this.product;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public String getSignName() {
        return this.signName;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    public String getTemplateParam() {
        return this.templateParam;
    }

    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public String getAction() {
        return this.action;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public void setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setAction(String action) {
        this.action = action;
    }

}

package com.example.eureka.personverify.juhe;

/**
 * 聚合三网手机实名认证结果
 */
public class JuHePerVerResult {
    /**
     * 状态码
     * 0   成功，计费
     */
    private int errorCode;
    /**
     * 状态提示
     * 身份证正确："查询成功",（手机号，姓名不匹配也是改状态）
     * 身份证错误："参数错误:身份证不合法"
     */
    private String reason;

    private Result result;


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    /**
     * 返回结果
     */
    public static class Result{
        /**
         * 姓名
         */
        private String realname;
        /**
         * 手机号
         */
        private String mobile;
        /**
         * 身份证
         */
        private String idcard;
        /**
         * 匹配结果
         * 1匹配 2不匹配
         */
        private int res;
        /**
         * 匹配结果
         * res为1时返回三要素身份验证一致,res为2时返回三要素身份验证不一致
         */
        private String resmsg;
        /**
         * 手机运营商,
         * 输入参数type为1时返回
         */
        private String type;
        /**
         * 聚合订单号,
         * 输入参数showid为1时返回
         */
        private String orderid;
        /**
         * 归属地省
         * 输入参数province为1时返回
         */
        private String province;
        /**
         * 归属地城市
         * 输入参数province为1时返回
         */
        private String city;
        /**
         * 输入detail为1时返回匹配详情码
         * 11:匹配,21:姓名不匹配,22:身份证不匹配,
         * 23:姓名身份证均不匹配,33:身份证和姓名不一致,
         * 24:不匹配,具体要素不匹配未知
         */
        private String rescode;


        public String getRealname() {
            return realname;
        }

        public void setRealname(String realname) {
            this.realname = realname;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }

        public int getRes() {
            return res;
        }

        public void setRes(int res) {
            this.res = res;
        }

        public String getResmsg() {
            return resmsg;
        }

        public void setResmsg(String resmsg) {
            this.resmsg = resmsg;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getOrderid() {
            return orderid;
        }

        public void setOrderid(String orderid) {
            this.orderid = orderid;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getRescode() {
            return rescode;
        }

        public void setRescode(String rescode) {
            this.rescode = rescode;
        }
    }
}

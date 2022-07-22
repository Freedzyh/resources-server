package com.example.resourcesserver.config;

/**
 * @Author: zhuyuhua
 * @Date: 2022/7/21 15:07
 */
public enum ResultCode implements ErrorCode {

    SUCCESS(200, "成功"), FAILED(500, "失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限"),
    UNKNOWN_REASON(10001, "未知异常"),
    BAD_SQL_GRAMMAR(10002, "sql语法错误"),
    JSON_PARSE_ERROR(10003, "json解析异常"),
    NO_DATA_ERROR(10004, "未查询到数据！"),
    ;

    private long code;

    private String desc;

    private ResultCode(long code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

}

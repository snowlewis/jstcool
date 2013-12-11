package com.jstcool.domain.redirect;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-26
 * Time: 下午9:12
 * To change this template use File | Settings | File Templates.
 */
public class RedirectMapping {
    private Long id;
    private String code;
    private String url;
    private Long requestCnt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getRequestCnt() {
        return requestCnt;
    }

    public void setRequestCnt(Long requestCnt) {
        this.requestCnt = requestCnt;
    }

    @Override
    public String toString() {
        return "RedirectMapping{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", url='" + url + '\'' +
                ", requestCnt=" + requestCnt +
                '}';
    }
}

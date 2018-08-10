package com.luck.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "record")
public class Record {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "send_id")
    private Integer sendId;
    @Column(name = "receive_id")
    private Integer receiveId;
    @Column(name = "group_id")
    private String groupId;
    @Column(name = "content")
    private String content;
    @Column(name = "status")
    private Integer status;
    @Column(name = "send_time")
    private Date sendTime;
    @Column(name = "read_time")
    private Date readTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", sendId=" + sendId +
                ", receiveId=" + receiveId +
                ", groupId='" + groupId + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", sendTime=" + sendTime +
                ", readTime=" + readTime +
                '}';
    }
}
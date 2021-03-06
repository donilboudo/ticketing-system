package com.duosoft.duosoftticketingsystem.rest_api.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tkodagoda on 7/3/17.
 */

public class Ticket  implements Parcelable {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("priority")
    @Expose
    private String priority;

    @SerializedName("requester")
    @Expose
    private UserDetails requester;

    @SerializedName("submitter")
    @Expose
    private UserDetails submitter;

    @SerializedName("assignee")
    @Expose
    private UserDetails assignee;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public UserDetails getRequester() {
        return requester;
    }

    public void setRequester(UserDetails requester) {
        this.requester = requester;
    }

    public UserDetails getSubmitter() {
        return submitter;
    }

    public void setSubmitter(UserDetails submitter) {
        this.submitter = submitter;
    }

    public UserDetails getAssignee() {
        return assignee;
    }

    public void setAssignee(UserDetails assignee) {
        this.assignee = assignee;
    }



    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }

    protected Ticket(Parcel in) {
        id = in.readString();
        type = in.readString();
        subject = in.readString();
        description = in.readString();
        status = in.readString();
        priority = in.readString();
        requester = in.readParcelable(UserDetails.class.getClassLoader());
        assignee = in.readParcelable(UserDetails.class.getClassLoader());
        submitter = in.readParcelable(UserDetails.class.getClassLoader());
    }

    Ticket(){}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(id);
        dest.writeString(type);
        dest.writeString(subject);
        dest.writeString(description);
        dest.writeString(status);
        dest.writeString(priority);
        dest.writeParcelable(requester, i);
        dest.writeParcelable(assignee, i);
        dest.writeParcelable(submitter, i);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Ticket> CREATOR = new Parcelable.Creator<Ticket>() {
        @Override
        public Ticket createFromParcel(Parcel in) {
            return new Ticket(in);
        }

        @Override
        public Ticket[] newArray(int size) {
            return new Ticket[size];
        }
    };

}

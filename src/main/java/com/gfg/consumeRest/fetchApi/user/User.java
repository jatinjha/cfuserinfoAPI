package com.gfg.consumeRest.fetchApi.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "result"
})

public class User {

    @JsonProperty("status")
    private String status;
    @JsonProperty("result")
    private List<Result> result = null;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public User() {
    }

    /**
     *
     * @param result
     * @param status
     */
    public User(String status, List<Result> result) {
        super();
        this.status = status;
        this.result = result;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("result")
    public List<Result> getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(List<Result> result) {
        this.result = result;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("status", status).append("result", result).append("additionalProperties", additionalProperties).toString();
//    }

}
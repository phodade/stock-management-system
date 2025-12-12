package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component

public class InventoryResponse {
  
    private String status;
    private String message;
    private List<InventoryData> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<InventoryData> getData() {
        return data;
    }

    public void setData(List<InventoryData> data) {
        this.data = data;
    }
}

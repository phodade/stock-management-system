package org.dnyanyog.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class ProductResponse {
    private String status;
    private String Message;
    private ProductData data;
    private List<ProductData> dataList;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public ProductData getData() {
		return data;
	}
	public void setData(ProductData data) {
		this.data = data;
	}
	public List<ProductData> getDataList() {
		return dataList;
	}
	public void setDataList(List<ProductData> dataList) {
		this.dataList = dataList;
	} 
    
    
}

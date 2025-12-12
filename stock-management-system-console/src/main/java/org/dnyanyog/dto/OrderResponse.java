package org.dnyanyog.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class OrderResponse {
  private String status;
  private String message;
  private List<OrderData> data;
  private List<OrderData> dataList;
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
public List<OrderData> getData() {
	return data;
}
public void setData(List<OrderData> list) {
	this.data = list;
}
public List<OrderData> getDataList() {
	return dataList;
}
public void setDataList(List<OrderData> dataList) {
	this.dataList = dataList;
}
  
  
}

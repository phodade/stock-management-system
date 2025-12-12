package org.dnyanyog.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class SupplierResponse {
	

	  private String responseCode;
	  private String responseMessage;
	  private SupplierData data;
	  private List<SupplierData> dataList;

	  public String getResponseCode() {
	    return responseCode;
	  }

	  public void setResponseCode(String responseCode) {
	    this.responseCode = responseCode;
	  }

	  public String getResponseMessage() {
	    return responseMessage;
	  }

	  public void setResponseMessage(String responseMessage) {
	    this.responseMessage = responseMessage;
	  }

	  public SupplierData getData() {
	    return data;
	  }

	  public void setData(SupplierData data) {
	    this.data = data;
	  }

	  public List<SupplierData> getDataList() {
	    return dataList;
	  }

	  public void setDataList(List<SupplierData> dataList) {
	    this.dataList = dataList;
	  }
	}



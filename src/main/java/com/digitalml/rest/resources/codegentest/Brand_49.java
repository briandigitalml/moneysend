package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Brand_49:
{
  "type": "object",
  "properties": {
    "AcceptanceBrandCode": {
      "description": "Acceptance brand code. Details- String, 3",
      "type": "string"
    },
    "ProductBrandCode": {
      "description": "Brand product code. Details- String, 3",
      "type": "string"
    }
  }
}
*/


public class Brand_49 {

	@Size(max=1)
	private String acceptanceBrandCode;

	@Size(max=1)
	private String productBrandCode;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    acceptanceBrandCode = null;
	    productBrandCode = null;
	}
@ApiModelProperty(notes = "Acceptance brand code. Details- String, 3")
	public String getAcceptanceBrandCode() {
		return acceptanceBrandCode;
	}
	
	public void setAcceptanceBrandCode(String acceptanceBrandCode) {
		this.acceptanceBrandCode = acceptanceBrandCode;
	}
@ApiModelProperty(notes = "Brand product code. Details- String, 3")
	public String getProductBrandCode() {
		return productBrandCode;
	}
	
	public void setProductBrandCode(String productBrandCode) {
		this.productBrandCode = productBrandCode;
	}
}
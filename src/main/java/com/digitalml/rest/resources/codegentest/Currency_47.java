package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Currency_47:
{
  "type": "object",
  "properties": {
    "AlphaCurrencyCode": {
      "description": "Billing currency (alpha). Details- String, 3",
      "type": "string"
    },
    "NumericCurrencyCode": {
      "description": "Billing currency (numeric). Details- Numeric, 3",
      "type": "string"
    }
  }
}
*/


public class Currency_47 {

	@Size(max=1)
	private String alphaCurrencyCode;

	@Size(max=1)
	private String numericCurrencyCode;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    alphaCurrencyCode = null;
	    numericCurrencyCode = null;
	}
@ApiModelProperty(notes = "Billing currency (alpha). Details- String, 3")
	public String getAlphaCurrencyCode() {
		return alphaCurrencyCode;
	}
	
	public void setAlphaCurrencyCode(String alphaCurrencyCode) {
		this.alphaCurrencyCode = alphaCurrencyCode;
	}
@ApiModelProperty(notes = "Billing currency (numeric). Details- Numeric, 3")
	public String getNumericCurrencyCode() {
		return numericCurrencyCode;
	}
	
	public void setNumericCurrencyCode(String numericCurrencyCode) {
		this.numericCurrencyCode = numericCurrencyCode;
	}
}
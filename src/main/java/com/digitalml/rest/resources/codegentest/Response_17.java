package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Response_17:
{
  "type": "object",
  "properties": {
    "Code": {
      "description": "Transaction response code. Details- AlphaNumeric, 2 in length.",
      "type": "string"
    },
    "Description": {
      "description": "Transaction response description. Details- AlphaNumeric special, 80 in length",
      "type": "string"
    }
  }
}
*/


public class Response_17 {

	@Size(max=1)
	private String code;

	@Size(max=1)
	private String description;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    code = null;
	    description = null;
	}
@ApiModelProperty(notes = "Transaction response code. Details- AlphaNumeric, 2 in length.")
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
@ApiModelProperty(notes = "Transaction response description. Details- AlphaNumeric special, 80 in length")
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
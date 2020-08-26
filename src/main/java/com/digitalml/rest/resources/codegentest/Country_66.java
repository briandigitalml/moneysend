package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Country_66:
{
  "type": "object",
  "properties": {
    "AlphaCountryCode": {
      "description": "The AlphaCountryCode will be a three character value compliant with ISO 3166-1 alpha-3. Details- String, 3",
      "type": "string"
    },
    "NumericCountryCode": {
      "description": "The NumericCountryCode will be a three character value compliant with ISO 3166-1 numeric (or numeric-3). Details- Numeric, 3",
      "type": "string"
    }
  }
}
*/


public class Country_66 {

	@Size(max=1)
	private String alphaCountryCode;

	@Size(max=1)
	private String numericCountryCode;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    alphaCountryCode = null;
	    numericCountryCode = null;
	}
@ApiModelProperty(notes = "The AlphaCountryCode will be a three character value compliant with ISO 3166-1 alpha-3. Details- String, 3")
	public String getAlphaCountryCode() {
		return alphaCountryCode;
	}
	
	public void setAlphaCountryCode(String alphaCountryCode) {
		this.alphaCountryCode = alphaCountryCode;
	}
@ApiModelProperty(notes = "The NumericCountryCode will be a three character value compliant with ISO 3166-1 numeric (or numeric-3). Details- Numeric, 3")
	public String getNumericCountryCode() {
		return numericCountryCode;
	}
	
	public void setNumericCountryCode(String numericCountryCode) {
		this.numericCountryCode = numericCountryCode;
	}
}
package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Receivingeligibility_63:
{
  "type": "object",
  "properties": {
    "Eligible": {
      "description": "Is holder of account eligible for sending? true or false. Yes = true, No = false. Details- Boolean",
      "type": "boolean"
    },
    "Brand": {
      "$ref": "Brand_64"
    },
    "Currency": {
      "$ref": "Currency_65"
    },
    "Country": {
      "$ref": "Country_66"
    },
    "EnablementIndicator": {
      "description": " Indicator showing the type of transaction for which the card is enabled. Details- Conditional, String, 1, Only appears if the receiving card is eligible. Valid Values- D - (Domestic only): Enabled only to receive Domestic MoneySend transactions. Y - (Cross-border and Domestic): Enabled to receive both Cross-border and Domestic MoneySend transactions, U - (Undefined): Enablement to receive MoneySend transactions unknown(MoneySend transactions not prohibited)",
      "type": "string"
    }
  }
}
*/


public class Receivingeligibility_63 {

	@Size(max=1)
	private boolean eligible;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Brand_64 brand;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Currency_65 currency;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Country_66 country;

	@Size(max=1)
	private String enablementIndicator;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    brand = null;
	    currency = null;
	    country = null;
	    enablementIndicator = null;
	}
@ApiModelProperty(notes = "Is holder of account eligible for sending? true or false. Yes &#x3D; true, No &#x3D; false. Details- Boolean")
	public boolean getEligible() {
		return eligible;
	}
	
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}

	public com.digitalml.rest.resources.codegentest.Brand_64 getBrand() {
		return brand;
	}
	
	public void setBrand(com.digitalml.rest.resources.codegentest.Brand_64 brand) {
		this.brand = brand;
	}

	public com.digitalml.rest.resources.codegentest.Currency_65 getCurrency() {
		return currency;
	}
	
	public void setCurrency(com.digitalml.rest.resources.codegentest.Currency_65 currency) {
		this.currency = currency;
	}

	public com.digitalml.rest.resources.codegentest.Country_66 getCountry() {
		return country;
	}
	
	public void setCountry(com.digitalml.rest.resources.codegentest.Country_66 country) {
		this.country = country;
	}
@ApiModelProperty(notes = "Indicator showing the type of transaction for which the card is enabled. Details- Conditional, String, 1, Only appears if the receiving card is eligible. Valid Values- D - (Domestic only): Enabled only to receive Domestic MoneySend transactions. Y - (Cross-border and Domestic): Enabled to receive both Cross-border and Domestic MoneySend transactions, U - (Undefined): Enablement to receive MoneySend transactions unknown(MoneySend transactions not prohibited)")
	public String getEnablementIndicator() {
		return enablementIndicator;
	}
	
	public void setEnablementIndicator(String enablementIndicator) {
		this.enablementIndicator = enablementIndicator;
	}
}
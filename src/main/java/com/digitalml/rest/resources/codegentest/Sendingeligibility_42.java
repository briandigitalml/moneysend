package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Sendingeligibility_42:
{
  "type": "object",
  "properties": {
    "Eligible": {
      "description": "Is holder of account eligible for sending? true or false. Yes = true, No = false. Details- Boolean",
      "type": "boolean"
    },
    "AccountNumber": {
      "description": "Card account number. Details- String, 11-19",
      "type": "string"
    },
    "ICA": {
      "description": "ICA of institution that issued the card account. Details- String, 4-6",
      "type": "string"
    },
    "Currency": {
      "$ref": "Currency_43"
    },
    "Country": {
      "$ref": "Country_44"
    },
    "Brand": {
      "$ref": "Brand_45"
    }
  }
}
*/


public class Sendingeligibility_42 {

	@Size(max=1)
	private boolean eligible;

	@Size(max=1)
	private String accountNumber;

	@Size(max=1)
	private String iCA;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Currency_43 currency;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Country_44 country;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Brand_45 brand;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    accountNumber = null;
	    iCA = null;
	    currency = null;
	    country = null;
	    brand = null;
	}
@ApiModelProperty(notes = "Is holder of account eligible for sending? true or false. Yes &#x3D; true, No &#x3D; false. Details- Boolean")
	public boolean getEligible() {
		return eligible;
	}
	
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}
@ApiModelProperty(notes = "Card account number. Details- String, 11-19")
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
@ApiModelProperty(notes = "ICA of institution that issued the card account. Details- String, 4-6")
	public String getICA() {
		return iCA;
	}
	
	public void setICA(String iCA) {
		this.iCA = iCA;
	}

	public com.digitalml.rest.resources.codegentest.Currency_43 getCurrency() {
		return currency;
	}
	
	public void setCurrency(com.digitalml.rest.resources.codegentest.Currency_43 currency) {
		this.currency = currency;
	}

	public com.digitalml.rest.resources.codegentest.Country_44 getCountry() {
		return country;
	}
	
	public void setCountry(com.digitalml.rest.resources.codegentest.Country_44 country) {
		this.country = country;
	}

	public com.digitalml.rest.resources.codegentest.Brand_45 getBrand() {
		return brand;
	}
	
	public void setBrand(com.digitalml.rest.resources.codegentest.Brand_45 brand) {
		this.brand = brand;
	}
}
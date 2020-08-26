package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Receivingeligibility_46:
{
  "type": "object",
  "properties": {
    "Eligible": {
      "description": "Is holder of account eligible for sending? true or false. Yes = true, No = false. Details- Boolean",
      "type": "boolean"
    },
    "EnablementIndicator": {
      "description": "Indicator showing the type of transaction for which the card is enabled. Details- Conditional, String, 1, Only appears if the receiving card is eligible. Valid Values- D - (Domestic only): Enabled only to receive Domestic MoneySend transactions. Y - (Cross-border and Domestic): Enabled to receive both Cross-border and Domestic MoneySend transactions, U - (Undefined): Enablement to receive MoneySend transactions unknown(MoneySend transactions not prohibited)",
      "type": "string"
    },
    "ReasonCode": {
      "description": "Reason for being ineligible. Only set when Eligible set to false. See a few reason codes listed below. Full list is available in Errors v3 - Errors table. Details- Conditional,String, 80. Reason code Examples:  \n120016 : PAN is not eligible as ICA is blocked \n120017 : PAN is not eligible as account range is blocked\n120018 : PAN is not eligible as country code is blocked\n120019 : PAN is not in eligible account range. ",
      "type": "string"
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
      "$ref": "Currency_47"
    },
    "Country": {
      "$ref": "Country_48"
    },
    "Brand": {
      "$ref": "Brand_49"
    }
  }
}
*/


public class Receivingeligibility_46 {

	@Size(max=1)
	private boolean eligible;

	@Size(max=1)
	private String enablementIndicator;

	@Size(max=1)
	private String reasonCode;

	@Size(max=1)
	private String accountNumber;

	@Size(max=1)
	private String iCA;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Currency_47 currency;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Country_48 country;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Brand_49 brand;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    enablementIndicator = null;
	    reasonCode = null;
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
@ApiModelProperty(notes = "Indicator showing the type of transaction for which the card is enabled. Details- Conditional, String, 1, Only appears if the receiving card is eligible. Valid Values- D - (Domestic only): Enabled only to receive Domestic MoneySend transactions. Y - (Cross-border and Domestic): Enabled to receive both Cross-border and Domestic MoneySend transactions, U - (Undefined): Enablement to receive MoneySend transactions unknown(MoneySend transactions not prohibited)")
	public String getEnablementIndicator() {
		return enablementIndicator;
	}
	
	public void setEnablementIndicator(String enablementIndicator) {
		this.enablementIndicator = enablementIndicator;
	}
@ApiModelProperty(notes = "Reason for being ineligible. Only set when Eligible set to false. See a few reason codes listed below. Full list is available in Errors v3 - Errors table. Details- Conditional,String, 80. Reason code Examples:   120016 : PAN is not eligible as ICA is blocked  120017 : PAN is not eligible as account range is blocked 120018 : PAN is not eligible as country code is blocked 120019 : PAN is not in eligible account range.")
	public String getReasonCode() {
		return reasonCode;
	}
	
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
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

	public com.digitalml.rest.resources.codegentest.Currency_47 getCurrency() {
		return currency;
	}
	
	public void setCurrency(com.digitalml.rest.resources.codegentest.Currency_47 currency) {
		this.currency = currency;
	}

	public com.digitalml.rest.resources.codegentest.Country_48 getCountry() {
		return country;
	}
	
	public void setCountry(com.digitalml.rest.resources.codegentest.Country_48 country) {
		this.country = country;
	}

	public com.digitalml.rest.resources.codegentest.Brand_49 getBrand() {
		return brand;
	}
	
	public void setBrand(com.digitalml.rest.resources.codegentest.Brand_49 brand) {
		this.brand = brand;
	}
}
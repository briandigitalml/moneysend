package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Mapping_60:
{
  "type": "object",
  "properties": {
    "MappingId": {
      "description": "This is the Unique identifier to identify this mapping. Numeric value, variable length without zero padding. Details- Numeric, 1 to 10 digits in length",
      "type": "string"
    },
    "ICA": {
      "description": " Issuer Identifier (billing ICA). Details- Numeric, 4-6",
      "type": "string"
    },
    "SubscriberId": {
      "description": "This is a unique identifier to be mapped to the account. SubscriberId is validated against the SubscriberType. Details- Alpha numeric special. Valid Values- PHONE_NUMBER - SubscriberId must contain 4 to 20 digits. Country code must be included. EMAIL_ADDRESS - SubscriberId must be a valid email address and 4 to 99 characters, SOCIAL_NETWORK - SubscriberId must be 1 to 99 characters",
      "type": "string"
    },
    "SubscriberType": {
      "description": "Types of identifier to map to the account. SubscriberId is validated against the SubscriberType. Valid Values- PHONE_NUMBER, EMAIL_ADDRESS, SOCIAL_NETWORK",
      "type": "string"
    },
    "AccountUsage": {
      "description": "Is this a Sending or Receiving account? Valid values:  Sending, Receiving",
      "type": "string"
    },
    "DefaultIndicator": {
      "description": "Is this the default Sending or Receiving account? Details- Alpha, 1.  Valid values:  T = True when this is the default, F = False",
      "type": "string"
    },
    "Alias": {
      "description": "Easy, recognizable display name for card. Details- Alpha numeric special, 1-20",
      "type": "string"
    },
    "AccountNumber": {
      "description": "Card number. Details- Numeric, 9-20",
      "type": "string"
    },
    "CardholderFullName": {
      "$ref": "Cardholderfullname_61"
    },
    "ExpiryDate": {
      "description": "Card expiration Date. Details- Condition field is required when Account Usage = \"SENDING\" . Numeric, 6,YYYYMM",
      "type": "string"
    },
    "Address": {
      "$ref": "Address_62"
    },
    "DateOfBirth": {
      "description": "Cardholder Date of Birth. Details- Numeric,8,YYYYMMDD",
      "type": "string"
    },
    "ReceivingEligibility": {
      "$ref": "Receivingeligibility_63"
    }
  }
}
*/


public class Mapping_60 {

	@Size(max=1)
	private String mappingId;

	@Size(max=1)
	private String iCA;

	@Size(max=1)
	private String subscriberId;

	@Size(max=1)
	private String subscriberType;

	@Size(max=1)
	private String accountUsage;

	@Size(max=1)
	private String defaultIndicator;

	@Size(max=1)
	private String alias;

	@Size(max=1)
	private String accountNumber;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Cardholderfullname_61 cardholderFullName;

	@Size(max=1)
	private String expiryDate;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Address_62 address;

	@Size(max=1)
	private String dateOfBirth;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Receivingeligibility_63 receivingEligibility;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    mappingId = null;
	    iCA = null;
	    subscriberId = null;
	    subscriberType = null;
	    accountUsage = null;
	    defaultIndicator = null;
	    alias = null;
	    accountNumber = null;
	    cardholderFullName = null;
	    expiryDate = null;
	    address = null;
	    dateOfBirth = null;
	    receivingEligibility = null;
	}
@ApiModelProperty(notes = "This is the Unique identifier to identify this mapping. Numeric value, variable length without zero padding. Details- Numeric, 1 to 10 digits in length")
	public String getMappingId() {
		return mappingId;
	}
	
	public void setMappingId(String mappingId) {
		this.mappingId = mappingId;
	}
@ApiModelProperty(notes = "Issuer Identifier (billing ICA). Details- Numeric, 4-6")
	public String getICA() {
		return iCA;
	}
	
	public void setICA(String iCA) {
		this.iCA = iCA;
	}
@ApiModelProperty(notes = "This is a unique identifier to be mapped to the account. SubscriberId is validated against the SubscriberType. Details- Alpha numeric special. Valid Values- PHONE_NUMBER - SubscriberId must contain 4 to 20 digits. Country code must be included. EMAIL_ADDRESS - SubscriberId must be a valid email address and 4 to 99 characters, SOCIAL_NETWORK - SubscriberId must be 1 to 99 characters")
	public String getSubscriberId() {
		return subscriberId;
	}
	
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
@ApiModelProperty(notes = "Types of identifier to map to the account. SubscriberId is validated against the SubscriberType. Valid Values- PHONE_NUMBER, EMAIL_ADDRESS, SOCIAL_NETWORK")
	public String getSubscriberType() {
		return subscriberType;
	}
	
	public void setSubscriberType(String subscriberType) {
		this.subscriberType = subscriberType;
	}
@ApiModelProperty(notes = "Is this a Sending or Receiving account? Valid values:  Sending, Receiving")
	public String getAccountUsage() {
		return accountUsage;
	}
	
	public void setAccountUsage(String accountUsage) {
		this.accountUsage = accountUsage;
	}
@ApiModelProperty(notes = "Is this the default Sending or Receiving account? Details- Alpha, 1.  Valid values:  T &#x3D; True when this is the default, F &#x3D; False")
	public String getDefaultIndicator() {
		return defaultIndicator;
	}
	
	public void setDefaultIndicator(String defaultIndicator) {
		this.defaultIndicator = defaultIndicator;
	}
@ApiModelProperty(notes = "Easy, recognizable display name for card. Details- Alpha numeric special, 1-20")
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
@ApiModelProperty(notes = "Card number. Details- Numeric, 9-20")
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public com.digitalml.rest.resources.codegentest.Cardholderfullname_61 getCardholderFullName() {
		return cardholderFullName;
	}
	
	public void setCardholderFullName(com.digitalml.rest.resources.codegentest.Cardholderfullname_61 cardholderFullName) {
		this.cardholderFullName = cardholderFullName;
	}
@ApiModelProperty(notes = "Card expiration Date. Details- Condition field is required when Account Usage &#x3D; &quot;SENDING&quot; . Numeric, 6,YYYYMM")
	public String getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public com.digitalml.rest.resources.codegentest.Address_62 getAddress() {
		return address;
	}
	
	public void setAddress(com.digitalml.rest.resources.codegentest.Address_62 address) {
		this.address = address;
	}
@ApiModelProperty(notes = "Cardholder Date of Birth. Details- Numeric,8,YYYYMMDD")
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public com.digitalml.rest.resources.codegentest.Receivingeligibility_63 getReceivingEligibility() {
		return receivingEligibility;
	}
	
	public void setReceivingEligibility(com.digitalml.rest.resources.codegentest.Receivingeligibility_63 receivingEligibility) {
		this.receivingEligibility = receivingEligibility;
	}
}
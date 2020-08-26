package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Cardholderfullname_61:
{
  "type": "object",
  "properties": {
    "CardholderFirstName": {
      "description": "Cardholder First Name. Conditional- Required if any other name or address field is populated. Details- Alpha numeric special, 1-25",
      "type": "string"
    },
    "CardholderMiddleName": {
      "description": "Card Holder Middle Initial. Details- Alpha numeric, 1",
      "type": "string"
    },
    "CardholderLastName": {
      "description": "Cardholder Last Name. Conditional- Required if any other name or address field is populated. Details- Alpha numeric special, 1-35",
      "type": "string"
    }
  }
}
*/


public class Cardholderfullname_61 {

	@Size(max=1)
	private String cardholderFirstName;

	@Size(max=1)
	private String cardholderMiddleName;

	@Size(max=1)
	private String cardholderLastName;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    cardholderFirstName = null;
	    cardholderMiddleName = null;
	    cardholderLastName = null;
	}
@ApiModelProperty(notes = "Cardholder First Name. Conditional- Required if any other name or address field is populated. Details- Alpha numeric special, 1-25")
	public String getCardholderFirstName() {
		return cardholderFirstName;
	}
	
	public void setCardholderFirstName(String cardholderFirstName) {
		this.cardholderFirstName = cardholderFirstName;
	}
@ApiModelProperty(notes = "Card Holder Middle Initial. Details- Alpha numeric, 1")
	public String getCardholderMiddleName() {
		return cardholderMiddleName;
	}
	
	public void setCardholderMiddleName(String cardholderMiddleName) {
		this.cardholderMiddleName = cardholderMiddleName;
	}
@ApiModelProperty(notes = "Cardholder Last Name. Conditional- Required if any other name or address field is populated. Details- Alpha numeric special, 1-35")
	public String getCardholderLastName() {
		return cardholderLastName;
	}
	
	public void setCardholderLastName(String cardholderLastName) {
		this.cardholderLastName = cardholderLastName;
	}
}
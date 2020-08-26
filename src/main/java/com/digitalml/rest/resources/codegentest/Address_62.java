package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Address_62:
{
  "type": "object",
  "properties": {
    "Line1": {
      "description": "Address Line 1. Conditional- Required if any other name or address field is populated. Details- Alpha numeric special, 1-50",
      "type": "string"
    },
    "Line2": {
      "description": "Address Line 2. Details- Alpha numeric special, 1-50",
      "type": "string"
    },
    "City": {
      "description": "City. Conditional- Required if any other name or address field is populated. Details- Alpha numeric special, 1-20",
      "type": "string"
    },
    "CountrySubdivision": {
      "description": "This is the abbreviation of the state or province. Conditional- Required if any other name or address field is populated. Details- Alpha, 2-3",
      "type": "string"
    },
    "PostalCode": {
      "description": "Postal Code. Details- Alpha numeric, 1-10",
      "type": "string"
    },
    "Country": {
      "description": "A three character value compliant with ISO 3166-1 alpha-3. Conditional- Required if any other name or address field is populated. Details- Alpha, 3",
      "type": "string"
    }
  }
}
*/


public class Address_62 {

	@Size(max=1)
	private String line1;

	@Size(max=1)
	private String line2;

	@Size(max=1)
	private String city;

	@Size(max=1)
	private String countrySubdivision;

	@Size(max=1)
	private String postalCode;

	@Size(max=1)
	private String country;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    line1 = null;
	    line2 = null;
	    city = null;
	    countrySubdivision = null;
	    postalCode = null;
	    country = null;
	}
@ApiModelProperty(notes = "Address Line 1. Conditional- Required if any other name or address field is populated. Details- Alpha numeric special, 1-50")
	public String getLine1() {
		return line1;
	}
	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
@ApiModelProperty(notes = "Address Line 2. Details- Alpha numeric special, 1-50")
	public String getLine2() {
		return line2;
	}
	
	public void setLine2(String line2) {
		this.line2 = line2;
	}
@ApiModelProperty(notes = "City. Conditional- Required if any other name or address field is populated. Details- Alpha numeric special, 1-20")
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
@ApiModelProperty(notes = "This is the abbreviation of the state or province. Conditional- Required if any other name or address field is populated. Details- Alpha, 2-3")
	public String getCountrySubdivision() {
		return countrySubdivision;
	}
	
	public void setCountrySubdivision(String countrySubdivision) {
		this.countrySubdivision = countrySubdivision;
	}
@ApiModelProperty(notes = "Postal Code. Details- Alpha numeric, 1-10")
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
@ApiModelProperty(notes = "A three character value compliant with ISO 3166-1 alpha-3. Conditional- Required if any other name or address field is populated. Details- Alpha, 3")
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
}
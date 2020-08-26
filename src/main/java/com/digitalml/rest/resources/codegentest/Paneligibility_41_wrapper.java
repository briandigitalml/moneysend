package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Paneligibility_41_wrapper:
{
  "type": "object",
  "properties": {
    "PanEligibility": {
      "$ref": "Paneligibility_41"
    }
  }
}
*/


public class Paneligibility_41_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Paneligibility_41 panEligibility;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    panEligibility = null;
	}

	public com.digitalml.rest.resources.codegentest.Paneligibility_41 getPanEligibility() {
		return panEligibility;
	}
	
	public void setPanEligibility(com.digitalml.rest.resources.codegentest.Paneligibility_41 panEligibility) {
		this.panEligibility = panEligibility;
	}
}
package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Sanctionscoreservicerequest_50_wrapper:
{
  "type": "object",
  "properties": {
    "SanctionScoreServiceRequest": {
      "$ref": "Sanctionscoreservicerequest_50"
    }
  }
}
*/


public class Sanctionscoreservicerequest_50_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Sanctionscoreservicerequest_50 sanctionScoreServiceRequest;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    sanctionScoreServiceRequest = null;
	}

	public com.digitalml.rest.resources.codegentest.Sanctionscoreservicerequest_50 getSanctionScoreServiceRequest() {
		return sanctionScoreServiceRequest;
	}
	
	public void setSanctionScoreServiceRequest(com.digitalml.rest.resources.codegentest.Sanctionscoreservicerequest_50 sanctionScoreServiceRequest) {
		this.sanctionScoreServiceRequest = sanctionScoreServiceRequest;
	}
}
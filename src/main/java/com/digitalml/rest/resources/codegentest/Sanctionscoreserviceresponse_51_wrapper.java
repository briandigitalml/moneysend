package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Sanctionscoreserviceresponse_51_wrapper:
{
  "type": "object",
  "properties": {
    "SanctionScoreServiceResponse": {
      "$ref": "Sanctionscoreserviceresponse_51"
    }
  }
}
*/


public class Sanctionscoreserviceresponse_51_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Sanctionscoreserviceresponse_51 sanctionScoreServiceResponse;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    sanctionScoreServiceResponse = null;
	}

	public com.digitalml.rest.resources.codegentest.Sanctionscoreserviceresponse_51 getSanctionScoreServiceResponse() {
		return sanctionScoreServiceResponse;
	}
	
	public void setSanctionScoreServiceResponse(com.digitalml.rest.resources.codegentest.Sanctionscoreserviceresponse_51 sanctionScoreServiceResponse) {
		this.sanctionScoreServiceResponse = sanctionScoreServiceResponse;
	}
}
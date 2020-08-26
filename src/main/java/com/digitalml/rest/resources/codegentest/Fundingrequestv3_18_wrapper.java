package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Fundingrequestv3_18_wrapper:
{
  "type": "object",
  "properties": {
    "FundingRequestV3": {
      "$ref": "Fundingrequestv3_18"
    }
  }
}
*/


public class Fundingrequestv3_18_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Fundingrequestv3_18 fundingRequestV3;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    fundingRequestV3 = null;
	}

	public com.digitalml.rest.resources.codegentest.Fundingrequestv3_18 getFundingRequestV3() {
		return fundingRequestV3;
	}
	
	public void setFundingRequestV3(com.digitalml.rest.resources.codegentest.Fundingrequestv3_18 fundingRequestV3) {
		this.fundingRequestV3 = fundingRequestV3;
	}
}
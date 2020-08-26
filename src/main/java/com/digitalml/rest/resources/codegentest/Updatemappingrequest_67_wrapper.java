package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Updatemappingrequest_67_wrapper:
{
  "type": "object",
  "properties": {
    "UpdateMappingRequest": {
      "$ref": "Updatemappingrequest_67"
    }
  }
}
*/


public class Updatemappingrequest_67_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Updatemappingrequest_67 updateMappingRequest;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    updateMappingRequest = null;
	}

	public com.digitalml.rest.resources.codegentest.Updatemappingrequest_67 getUpdateMappingRequest() {
		return updateMappingRequest;
	}
	
	public void setUpdateMappingRequest(com.digitalml.rest.resources.codegentest.Updatemappingrequest_67 updateMappingRequest) {
		this.updateMappingRequest = updateMappingRequest;
	}
}
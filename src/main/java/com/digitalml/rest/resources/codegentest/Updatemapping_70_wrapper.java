package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Updatemapping_70_wrapper:
{
  "type": "object",
  "properties": {
    "UpdateMapping": {
      "$ref": "Updatemapping_70"
    }
  }
}
*/


public class Updatemapping_70_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Updatemapping_70 updateMapping;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    updateMapping = null;
	}

	public com.digitalml.rest.resources.codegentest.Updatemapping_70 getUpdateMapping() {
		return updateMapping;
	}
	
	public void setUpdateMapping(com.digitalml.rest.resources.codegentest.Updatemapping_70 updateMapping) {
		this.updateMapping = updateMapping;
	}
}
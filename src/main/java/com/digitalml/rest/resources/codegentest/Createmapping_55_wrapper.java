package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Createmapping_55_wrapper:
{
  "type": "object",
  "properties": {
    "CreateMapping": {
      "$ref": "Createmapping_55"
    }
  }
}
*/


public class Createmapping_55_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Createmapping_55 createMapping;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    createMapping = null;
	}

	public com.digitalml.rest.resources.codegentest.Createmapping_55 getCreateMapping() {
		return createMapping;
	}
	
	public void setCreateMapping(com.digitalml.rest.resources.codegentest.Createmapping_55 createMapping) {
		this.createMapping = createMapping;
	}
}
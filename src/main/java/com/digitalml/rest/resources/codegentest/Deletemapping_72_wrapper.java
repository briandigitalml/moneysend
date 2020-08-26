package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Deletemapping_72_wrapper:
{
  "type": "object",
  "properties": {
    "DeleteMapping": {
      "$ref": "Deletemapping_72"
    }
  }
}
*/


public class Deletemapping_72_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Deletemapping_72 deleteMapping;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    deleteMapping = null;
	}

	public com.digitalml.rest.resources.codegentest.Deletemapping_72 getDeleteMapping() {
		return deleteMapping;
	}
	
	public void setDeleteMapping(com.digitalml.rest.resources.codegentest.Deletemapping_72 deleteMapping) {
		this.deleteMapping = deleteMapping;
	}
}
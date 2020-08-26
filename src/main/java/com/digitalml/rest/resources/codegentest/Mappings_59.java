package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Mappings_59:
{
  "type": "object",
  "properties": {
    "Mapping": {
      "minItems": 0,
      "description": "Mapping Details",
      "type": "array",
      "items": {
        "$ref": "Mapping_60"
      }
    }
  }
}
*/


public class Mappings_59 {

	@Size(max=1)
	private List<com.digitalml.rest.resources.codegentest.Mapping_60> mapping;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    mapping = new ArrayList<com.digitalml.rest.resources.codegentest.Mapping_60>();
	}
@ApiModelProperty(notes = "Mapping Details")
	public List<com.digitalml.rest.resources.codegentest.Mapping_60> getMapping() {
		return mapping;
	}
	
	public void setMapping(List<com.digitalml.rest.resources.codegentest.Mapping_60> mapping) {
		this.mapping = mapping;
	}
}
package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Mapping_73:
{
  "type": "object",
  "properties": {
    "MappingId": {
      "description": "This is the Unique identifier to identify this mapping. Numeric value, variable length without zero padding.",
      "type": "integer",
      "format": "int64"
    }
  }
}
*/


public class Mapping_73 {

	@Size(max=1)
	private Integer mappingId;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    mappingId = null;
	}
@ApiModelProperty(notes = "This is the Unique identifier to identify this mapping. Numeric value, variable length without zero padding.")
	public Integer getMappingId() {
		return mappingId;
	}
	
	public void setMappingId(Integer mappingId) {
		this.mappingId = mappingId;
	}
}
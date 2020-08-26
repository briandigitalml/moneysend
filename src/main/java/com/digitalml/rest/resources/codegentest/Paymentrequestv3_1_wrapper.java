package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Paymentrequestv3_1_wrapper:
{
  "type": "object",
  "properties": {
    "PaymentRequestV3": {
      "$ref": "Paymentrequestv3_1"
    }
  }
}
*/


public class Paymentrequestv3_1_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Paymentrequestv3_1 paymentRequestV3;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    paymentRequestV3 = null;
	}

	public com.digitalml.rest.resources.codegentest.Paymentrequestv3_1 getPaymentRequestV3() {
		return paymentRequestV3;
	}
	
	public void setPaymentRequestV3(com.digitalml.rest.resources.codegentest.Paymentrequestv3_1 paymentRequestV3) {
		this.paymentRequestV3 = paymentRequestV3;
	}
}
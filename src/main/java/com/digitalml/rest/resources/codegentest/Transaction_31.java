package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Transaction_31:
{
  "type": "object",
  "properties": {
    "Type": {
      "description": "Type of transaction. Details- AlphaNumeric. Valid Values- FUNDING, PAYMENT, FUNDINGREVERSAL",
      "type": "string"
    },
    "SystemTraceAuditNumber": {
      "description": "This is the Unique identifier assigned to the transaction. Details- Numeric, 6 in length.",
      "type": "string"
    },
    "NetworkReferenceNumber": {
      "description": "Network Reference Number that can be used for transaction inquiry. Details- Numeric, 9 length, value is unique identifier.",
      "type": "string"
    },
    "SettlementDate": {
      "description": "Date Funds will be transferred between the acquirer and issuer by Single Message System. Transaction settlement date. Details- Numeric, 4 in length, format MMDD.",
      "type": "string"
    },
    "Response": {
      "$ref": "Response_32"
    },
    "SubmitDateTime": {
      "description": "This is the time and date of the transaction submission, in the following format: <date>T<time>, where <date> is YYYY-MM-DD, <time> is HH:MM:SS. Details- DateTime, Format - <date>T<time>Z, where date> is YYYY-MM-DD, <time> is HH:MM:SS.",
      "type": "string"
    }
  }
}
*/


public class Transaction_31 {

	@Size(max=1)
	private String type;

	@Size(max=1)
	private String systemTraceAuditNumber;

	@Size(max=1)
	private String networkReferenceNumber;

	@Size(max=1)
	private String settlementDate;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Response_32 response;

	@Size(max=1)
	private String submitDateTime;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    type = null;
	    systemTraceAuditNumber = null;
	    networkReferenceNumber = null;
	    settlementDate = null;
	    response = null;
	    submitDateTime = null;
	}
@ApiModelProperty(notes = "Type of transaction. Details- AlphaNumeric. Valid Values- FUNDING, PAYMENT, FUNDINGREVERSAL")
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
@ApiModelProperty(notes = "This is the Unique identifier assigned to the transaction. Details- Numeric, 6 in length.")
	public String getSystemTraceAuditNumber() {
		return systemTraceAuditNumber;
	}
	
	public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
		this.systemTraceAuditNumber = systemTraceAuditNumber;
	}
@ApiModelProperty(notes = "Network Reference Number that can be used for transaction inquiry. Details- Numeric, 9 length, value is unique identifier.")
	public String getNetworkReferenceNumber() {
		return networkReferenceNumber;
	}
	
	public void setNetworkReferenceNumber(String networkReferenceNumber) {
		this.networkReferenceNumber = networkReferenceNumber;
	}
@ApiModelProperty(notes = "Date Funds will be transferred between the acquirer and issuer by Single Message System. Transaction settlement date. Details- Numeric, 4 in length, format MMDD.")
	public String getSettlementDate() {
		return settlementDate;
	}
	
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public com.digitalml.rest.resources.codegentest.Response_32 getResponse() {
		return response;
	}
	
	public void setResponse(com.digitalml.rest.resources.codegentest.Response_32 response) {
		this.response = response;
	}
@ApiModelProperty(notes = "This is the time and date of the transaction submission, in the following format: &lt;date&gt;T&lt;time&gt;, where &lt;date&gt; is YYYY-MM-DD, &lt;time&gt; is HH:MM:SS. Details- DateTime, Format - &lt;date&gt;T&lt;time&gt;Z, where date&gt; is YYYY-MM-DD, &lt;time&gt; is HH:MM:SS.")
	public String getSubmitDateTime() {
		return submitDateTime;
	}
	
	public void setSubmitDateTime(String submitDateTime) {
		this.submitDateTime = submitDateTime;
	}
}
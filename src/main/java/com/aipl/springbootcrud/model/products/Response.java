package com.aipl.springbootcrud.model.products;

import java.util.HashMap;
import java.util.Map;

public class Response {

private String code;
private String message;
private Result result;
//private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public Result getResult() {
return result;
}

public void setResult(Result result) {
this.result = result;
}
//
//public Map<String, Object> getAdditionalProperties() {
//return this.additionalProperties;
//}
//
//public void setAdditionalProperty(String name, Object value) {
//this.additionalProperties.put(name, value);
//}

}
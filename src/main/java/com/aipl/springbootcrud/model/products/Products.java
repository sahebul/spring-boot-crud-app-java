package com.aipl.springbootcrud.model.products;
import java.util.HashMap;
import java.util.Map;

public class Products {

private Response response;
//private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Response getResponse() {
return response;
}

public void setResponse(Response response) {
this.response = response;
}

//public Map<String, Object> getAdditionalProperties() {
//return this.additionalProperties;
//}
//
//public void setAdditionalProperty(String name, Object value) {
//this.additionalProperties.put(name, value);
//}

}
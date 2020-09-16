package DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {
	 private String name;
	 //ugest
	    private String productName;

	    public OrderResponse(String name, String productName) {
	        this.name = name;
	        this.productName = productName;
	    }

	    private int price;
}

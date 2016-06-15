package org.spm.bookstore.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ibm.json.java.JSONObject;

@Path("/book")
public class BookService {
	
	@GET
	@Produces("application/json")
	public String getAllBooks(){
		JSONObject book = new JSONObject();
		book.put("name", "Carl");	
		return book.toString();
	}
}

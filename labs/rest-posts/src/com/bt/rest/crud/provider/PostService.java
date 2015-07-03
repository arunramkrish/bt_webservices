package com.bt.rest.crud.provider;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bt.rest.crud.domain.Post;

@Path("/posts")
public class PostService {
	private static Long postCount = 1L;
	private Map<Long, Post> posts = new HashMap<Long, Post>();
	
	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({MediaType.APPLICATION_XML})
	public Post create(@FormParam("message") String msg) {
		Post post = new Post(postCount, msg, "user", new Date());
		
		posts.put(postCount, post);
		
		postCount++;
		
		return post;
	}
}

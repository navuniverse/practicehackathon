/**
 * 
 */
package com.gs.smi;

import facebook4j.FacebookException;

/**
 * @author govind
 *
 */
public class FacebookStatusCollectorCommand extends FacebookCommand {
	private String id;
	
	public FacebookStatusCollectorCommand(String token, String id) {
		super(token);
		this.id = id;
	}
	public String execute() {
		
		try {
			return gson.toJson(facebookClient.getPosts());
		} catch (FacebookException e) {
			
			return null;
		}
	}

}

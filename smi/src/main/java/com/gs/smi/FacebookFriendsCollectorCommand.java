/**
 * 
 */
package com.gs.smi;

import facebook4j.FacebookException;


/**
 * @author govind
 *
 */
public class FacebookFriendsCollectorCommand extends FacebookCommand {
	private String id;
	/**
	 * @param token
	 */
	public FacebookFriendsCollectorCommand(String token, String id) {
		super(token);
		this.id = id;
	}
	
	public String execute() {
		try {
			return facebookClient.getUser("AaLTNjceexvP_ZL-uTdvzcr1brrSgpfIWIOFlpZlL-3R_tql2Z6T59cTBBojiOq2nhorjDqg-Zno2ew338Rb3jYmTBLcK5mnR4RZj0SIEfr6gQ").toString();
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}

}

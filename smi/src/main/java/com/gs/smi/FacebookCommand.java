/**
 * 
 */
package com.gs.smi;

import com.google.gson.Gson;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.conf.ConfigurationBuilder;

/**
 * @author govind
 * 
 */
public abstract class FacebookCommand implements Command {
	private String token;
	protected Facebook facebookClient;
	protected Gson gson = new Gson();

	public FacebookCommand(String token) {
		this.token = token;
		init(token);
	}

	/**
	 * * @param token2
	 */
	private void init(String token2) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthAppId("1438555623117556").setOAuthAppSecret("b1cbd00d89e528266bca61398042a0d2").setOAuthAccessToken(token);
		FacebookFactory ff = new FacebookFactory(cb.build());
		facebookClient = ff.getInstance();
	}
}

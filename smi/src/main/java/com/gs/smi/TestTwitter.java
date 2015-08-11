/**
 * 
 */
package com.gs.smi;

import twitter4j.FilterQuery;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

import com.google.gson.Gson;

/**
 * @author govind
 * 
 */
public class TestTwitter {
	public static void main(String[] args) {	
		System.out.println("yeahh");
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("8kiXVDH9LtjVR5ilryxCiNvIz");
		cb.setOAuthConsumerSecret("xxSKNooqXW5F6FOdPKo8gjEzNzExYfaiVi1v0NJb3OAlB6chJo");
		cb.setOAuthAccessToken("2425465788-Y4Zm4kP23OszQrfKEnRpnPZxsAQjxUJHae0D7TA");
		
		
		cb.setOAuthAccessTokenSecret("U8AfPgxNbE3ekxNk8XwOXPjWEoxWP7RQphC4ANOw0Gb0H");

		TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
		System.out.println("yeahh");
		StatusListener listener = new StatusListener() {
			public void onStallWarning(StallWarning arg0) {
				// TODO Auto-generated method stub
			}

			public void onStatus(Status status) {
				twitter4j.User user = status.getUser();
				System.out.println("tweet : " + new Gson().toJson(status));
				// gets Username
				String username = status.getUser().getScreenName();
				System.out.println(username);
				String profileLocation = user.getLocation();
				System.out.println(profileLocation);
				long tweetId = status.getId();
				System.out.println(tweetId);
				String content = status.getText();
				System.out.println(content + "\n");
			}

			public void onException(Exception arg0) {
				// TODO Auto-generated method stub
				
			}

			public void onDeletionNotice(StatusDeletionNotice arg0) {
				// TODO Auto-generated method stub
				
			}

			public void onScrubGeo(long arg0, long arg1) {
				// TODO Auto-generated method stub
				
			}

			public void onTrackLimitationNotice(int arg0) {
				// TODO Auto-generated method stub
				
			}

		};
		FilterQuery fq = new FilterQuery();
		System.out.println("yeahh");
		String keywords[] = { "Govind87464632" };

		fq.track(keywords);

		twitterStream.addListener(listener);
		twitterStream.filter(fq);
		
		/*TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		twitter.setOAuthConsumer("8kiXVDH9LtjVR5ilryxCiNvIz", "xxSKNooqXW5F6FOdPKo8gjEzNzExYfaiVi1v0NJb3OAlB6chJo");
		twitter.setOAuthAccessToken(new AccessToken("2425465788-Y4Zm4kP23OszQrfKEnRpnPZxsAQjxUJHae0D7TA", "U8AfPgxNbE3ekxNk8XwOXPjWEoxWP7RQphC4ANOw0Gb0H"));
		Paging paging = new Paging(1, 100);
		Status status = twitter.showStatus(Long.parseLong("631156534077095936"));
		//System.out.println(new Gson().toJson(status));
*/
	}
}

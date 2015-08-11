/**
 * 
 */
package com.gs.smi;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import com.google.gson.Gson;




/**
 * @author govind
 * 
 */
public class Test {
	public static void main(String[] args) throws TwitterException {
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("8kiXVDH9LtjVR5ilryxCiNvIz");
		cb.setOAuthConsumerSecret("xxSKNooqXW5F6FOdPKo8gjEzNzExYfaiVi1v0NJb3OAlB6chJo");
		cb.setOAuthAccessToken("2425465788-O87w63E4jrrYdG3xAl65PspX1Vj3UUDq2NTMz60");
		
		
		cb.setOAuthAccessTokenSecret("NnfUg5j6IAm24syZuRnKF8TN7ZYMx5uceM78jbkqHYCo6");

		/*TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();

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

		String keywords[] = { "Govind87464632" };

		fq.track(keywords);

		twitterStream.addListener(listener);
		twitterStream.filter(fq);*/
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		//System.out.println(new Gson().toJson(twitter.showStatus(631156534077095936L)));
		StatusUpdate st = new StatusUpdate("@naveen7892 reply via api :)");
		st.setInReplyToStatusId(631156534077095936L);
		System.out.println(new Gson().toJson(twitter.updateStatus(st)));
	}
}

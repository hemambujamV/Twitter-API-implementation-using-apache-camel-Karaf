package api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.core.Response;

import org.apache.camel.BeanInject;
import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.rs.security.oauth.client.OAuthClientUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class InitialService implements ApiService {

    // The API list to be implemented by the system
    private Map<Integer, Order> orders = new HashMap<>();

    private final AtomicInteger idGen = new AtomicInteger();
    private static final String FRIENDS_TIMELINE_URI = "https://api.twitter.com/1.1/statuses/home_timeline.json";
    private static final String TWITTER_API_TIMELINE = "https://api.twitter.com/1.1/statuses/mentions_timeline.json";
    private static final String USER_TIMELINE = "https://api.twitter.com/1.1/statuses/user_timeline.json";
    private static final String FRIENDS_LIST = "https://api.twitter.com/1.1/friends/ids.json";
    private static final String FRIENDS_SHOW = "https://api.twitter.com/1.1/friendships/show.json";
    private static final String DM_EVENTS_LIST ="https://api.twitter.com/1.1/direct_messages/events/list.json";
    private static final String ACCT_SETTINGS ="https://api.twitter.com/1.1/account/settings.json";
    private static final String FOLLOWERS_LIST ="https://api.twitter.com/1.1/followers/list.json";
    private static final String AV_TREND ="https://api.twitter.com/1.1/trends/available.json";
    private static final String PRIVACY_POLICY ="https://api.twitter.com/1.1/help/privacy.json";
    private static final String SUPPORTED_LANG ="https://api.twitter.com/1.1/help/languages.json";
    private static final String TOS ="https://api.twitter.com/1.1/help/tos.json";
    private Bus bus;
    
    @BeanInject("Tcfg")
    Config config;

    @Override
    public Order getOrder(int orderId) {
        return orders.get(orderId);
    }

	@Override
	public Map<Integer, Order> getOrders() {
		return orders;
	}
	
	@Override
    public List<Tweet> getHomeTimeline() {
    	WebClient client = createWebClient(FRIENDS_TIMELINE_URI, bus);
    	client.header("Authorization", getAuthorizationHeader(FRIENDS_TIMELINE_URI, "GET"));
    	Response response = client.invoke("GET", null);
    	
    	if (response.getStatus() == 200) {
    		Type listType = new TypeToken<ArrayList<Tweet>>(){}.getType();
        	List<Tweet> tweets = new Gson().fromJson(response.readEntity(String.class), listType);
            client.close();
            return tweets;	
    	}
    	
    	return null;
    }

	@Override
    public List<Tweet> getTwitterAPITimeline() {
    	WebClient client = createWebClient(TWITTER_API_TIMELINE, bus);
    	client.header("Authorization", getAuthorizationHeader(TWITTER_API_TIMELINE, "GET"));
    	Response response = client.invoke("GET", null);
    	
    	if (response.getStatus() == 200) {
    		Type listType = new TypeToken<ArrayList<Tweet>>(){}.getType();
        	List<Tweet> tweets = new Gson().fromJson(response.readEntity(String.class), listType);
            client.close();
            return tweets;		
    	}
    	    	
    	return null;
    }
	public List<Tweet> getUserTimeLine() {
    	WebClient client = createWebClient(USER_TIMELINE, bus);
    	client.header("Authorization", getAuthorizationHeader(USER_TIMELINE, "GET"));
    	Response response = client.invoke("GET", null);
    	
    	if (response.getStatus() == 200) {
    		Type listType = new TypeToken<ArrayList<Tweet>>(){}.getType();
        	List<Tweet> tweets = new Gson().fromJson(response.readEntity(String.class), listType);
            client.close();
            return tweets;		
    	}
    	    	
    	return null;
    }
	
	public User getFriendsList() {
    	WebClient client = createWebClient(FRIENDS_LIST, bus);
    	client.header("Authorization", getAuthorizationHeader(FRIENDS_LIST, "GET"));
    	Response response = client.invoke("GET", null);
    
    	if (response.getStatus() == 200) {
    		Type listType1 = new TypeToken<User>(){}.getType();
        	User users = new Gson().fromJson(response.readEntity(String.class), listType1);
            client.close();
            return users;
    	}
    	    	
    	return null;
    }
	
	public Users getFriendsShow() {
    	WebClient client = createWebClient(FRIENDS_SHOW, bus);
    	client.header("Authorization", getAuthorizationHeader(FRIENDS_SHOW, "GET"));
    	Response response = client.invoke("GET", null);
    
    	if (response.getStatus() == 200) {
    		Type listType1 = new TypeToken<Users>(){}.getType();
        	Users users = new Gson().fromJson(response.readEntity(String.class), listType1);
            client.close();
            return users;
    	}
    	    	
    	return null;
    }
	
	public ListEvents getDMEventList() {
		
		WebClient client = createWebClient(DM_EVENTS_LIST, bus);
    	client.header("Authorization", getAuthorizationHeader(DM_EVENTS_LIST, "GET"));
    	Response response = client.invoke("GET", null);
    
    	if (response.getStatus() == 200) {
    		Type listType1 = new TypeToken<ListEvents>(){}.getType();
        	ListEvents events = new Gson().fromJson(response.readEntity(String.class), listType1);
            client.close();
            return events;
    	}
    	    	
    	return null;
		
	}
	public AccountSettings getAccoutSettings() {
		
		WebClient client = createWebClient(ACCT_SETTINGS, bus);
    	client.header("Authorization", getAuthorizationHeader(ACCT_SETTINGS, "GET"));
    	Response response = client.invoke("GET", null);
    
    	if (response.getStatus() == 200) {
    		Type listType1 = new TypeToken<AccountSettings>(){}.getType();
        	AccountSettings events = new Gson().fromJson(response.readEntity(String.class), listType1);
            client.close();
            return events;
    	}
    	    	
    	return null;
		
	}
	
    public FollowersList getFollowersList() {
		
		WebClient client = createWebClient(FOLLOWERS_LIST, bus);
    	client.header("Authorization", getAuthorizationHeader(FOLLOWERS_LIST, "GET"));
    	Response response = client.invoke("GET", null);
    
    	if (response.getStatus() == 200) {
    		Type listType1 = new TypeToken<FollowersList>(){}.getType();
        	FollowersList lists = new Gson().fromJson(response.readEntity(String.class), listType1);
            client.close();
            return lists;
    	}
    	return null;
}
    public PrivacyPolicy getPolicy() {
		
		WebClient client = createWebClient(PRIVACY_POLICY, bus);
    	client.header("Authorization", getAuthorizationHeader(PRIVACY_POLICY, "GET"));
    	Response response = client.invoke("GET", null);
    
    	if (response.getStatus() == 200) {
    		Type listType1 = new TypeToken<PrivacyPolicy>(){}.getType();
        	PrivacyPolicy lists = new Gson().fromJson(response.readEntity(String.class), listType1);
            client.close();
            return lists;
    	}
    	return null;
}
    
    public ToS getToS() {
		
  		WebClient client = createWebClient(TOS, bus);
      	client.header("Authorization", getAuthorizationHeader(TOS, "GET"));
      	Response response = client.invoke("GET", null);
      
      	if (response.getStatus() == 200) {
      		Type listType1 = new TypeToken<ToS>(){}.getType();
      		ToS lists = new Gson().fromJson(response.readEntity(String.class), listType1);
              client.close();
              return lists;
      	}
      	return null;
  }
	
    private String getAuthorizationHeader(String resourceURI, String httpMethod) {
        OAuthClientUtils.Consumer consumer = new OAuthClientUtils.Consumer(config.getcKey(), config.getcSecret());
        OAuthClientUtils.Token token = new OAuthClientUtils.Token(config.getaToken(), config.getaSecret());
        return OAuthClientUtils.createAuthorizationHeader(consumer, token, httpMethod, resourceURI);        
    }
    
    private static WebClient createWebClient(String baseAddress, Bus bus) {
        JAXRSClientFactoryBean bean = new JAXRSClientFactoryBean();
        bean.setBus(bus);
        bean.setAddress(baseAddress);
        return bean.createWebClient();
    }
}

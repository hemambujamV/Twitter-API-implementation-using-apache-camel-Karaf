package api;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/orders/")
@Consumes(value = "application/json")
@Produces(value = "application/json")
public interface RestApiService {

    @GET
    @Path("/home")
    List<Tweet> getHomeTimeline();
    
    @GET
    @Path("/twitter")
    List<Tweet> getTwitterAPITimeline();
    
    @GET
    @Path("/user_timeline")
    List<Tweet> getUserTimeLine();
    
    @GET
    @Path("/friends_list")
    User getFriendsList();
    
    @GET
    @Path("/friends_show")
    Users getFriendsShow();
    
    @GET
    @Path("/events_list")
    ListEvents getDMEventList();
    
    @GET
    @Path("/account_settings")
    AccountSettings getAccoutSettings();
    
    @GET
    @Path("/followers_list")
    FollowersList getFollowersList();
    
    @GET
    @Path("/privacy_policy")
    PrivacyPolicy getPolicy();
    
    @GET
    @Path("/tos")
    ToS getToS();
    }

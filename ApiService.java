package api;

import java.util.List;
import java.util.Map;

public interface ApiService {

    Map<Integer, Order> getOrders();
    List<Tweet> getHomeTimeline();
    List<Tweet> getTwitterAPITimeline();
    List<Tweet> getUserTimeLine();
    User getFriendsList();
    Users getFriendsShow();
    ListEvents getDMEventList();
    AccountSettings getAccoutSettings();
    FollowersList getFollowersList();
    PrivacyPolicy getPolicy();
    ToS getToS();
    }

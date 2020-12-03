package com.example.videomeeting.listeners;

import com.example.videomeeting.models.User;

public interface UsersListeners {

    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);

    void onMultipleUsersAction(Boolean isMultipleUsersSelected);

}

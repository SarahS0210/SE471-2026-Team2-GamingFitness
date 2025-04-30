package com.example.servingwebcontent;

import org.springframework.data.rest.core.config.Projection;

/*
This is a Projection to expose our user password for our js fronend. This is by no means secure, this is just a way for us to access it for the time being.
*/
@Projection(name = "UserPassword", types = {User.class})
public interface UserPassword {
    String getPassword(); // get password
}


package com.theironyard;

/**
 * Created by vajrayogini on 10/4/16.
 */
public class Hurricane {
    String name;
    String location;
//    Enum Category {
//        ONE, TWO, THREE, FOUR, FIVE
//    };
    String image;
    User user;

    public Hurricane(String name, String location, String image, User user) {
        this.name = name;
        this.location = location;
        this.image = image;
        this.user = user;
    }
}

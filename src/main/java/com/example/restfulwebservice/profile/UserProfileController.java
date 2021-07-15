package com.example.restfulwebservice.profile;

import com.example.restfulwebservice.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class UserProfileController {

    @Autowired
    private UserProfileMapper mapper;

    @GetMapping("/user/{id}")
    public UserProfile getUserProfile(@PathVariable("id") String id) {

        UserProfile userProfile = mapper.getUserProfile(id);

        return userProfile;
    }

    @GetMapping("/user/all")
    public List<UserProfile> getUserProfileList() {

        List<UserProfile> userProfileList = mapper.getUserProfileList();

        return userProfileList;
    }

    @PutMapping("/user")
    public void putUserProfile(@RequestBody UserProfile userProfile) {
        mapper.insertUserProfile(userProfile.getId(), userProfile.getName(), userProfile.getPhone(), userProfile.getAdress());
    }

    @PostMapping("/user/{id}")
    public void postUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone,
                                @RequestParam("adress") String adress) {

        mapper.updateUserProfile(id, name, phone, adress);
    }

    @DeleteMapping("/user/{id}")
    public  void deleteUserProfile(@PathVariable("id") String id) {

        mapper.deleteUserProfile(id);
    }
 }

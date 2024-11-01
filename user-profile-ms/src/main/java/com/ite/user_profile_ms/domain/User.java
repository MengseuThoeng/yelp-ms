package com.ite.user_profile_ms.domain;

import com.ite.user_profile_ms.config.jpa.Auditable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String lastName;

    private String firstName;

    private String email;

    private String profilePicture;

    private Location location;

    private String phoneNumber;

    private String nickName;

    private String headLine;

    private String bio;

    private String iLove;

    private String findMe;

    private String jobTitle;

    private String blogOrWebsiteUrl;

    private String whyYouShouldReadMyReviews;

    private String mySecondFavoriteWebsite;

    private String currentCrush;

    private String primaryLanguage;

    //.. more fields




}

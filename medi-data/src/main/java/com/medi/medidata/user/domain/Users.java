package com.medi.medidata.user.domain;

import com.medi.medidata.column_bookmark.ColumnBookmarks;
import com.medi.medidata.self_test_response.domain.SelfTestResponse;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userLoginId;

    private String userPassword;

    private String userName;

    private String userNickname;

    private String userSex;

    private int userAge;

    private String userEmail;

    private String userPhoneNumber;

    private String userStatus;

    private LocalDateTime userLastLogin;

    private LocalDateTime userCreatedAt;

    private LocalDateTime userDeletedAt;

    @OneToMany(mappedBy = "user")
    private List<ColumnBookmarks> bookmarks;

    @OneToMany(mappedBy = "user")
    private List<SelfTestResponse> selfTestResponses;

}

package com.medi.medidata.self_test_response.domain;

import com.medi.medidata.self_test.domain.SelfTests;
import com.medi.medidata.self_test_response_detail.domain.SelfTestResponseDetails;
import com.medi.medidata.user.domain.Users;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "self_test_responses")
public class SelfTestResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long selfTestResponseId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "self_test_id")
    private SelfTests selfTest;

    private LocalDateTime selfTestResponseCreatedAt;

    @OneToMany(mappedBy = "selfTestResponse")
    private List<SelfTestResponseDetails> responseDetails;
}

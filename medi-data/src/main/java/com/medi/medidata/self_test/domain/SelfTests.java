package com.medi.medidata.self_test.domain;

import com.medi.medidata.self_test_question.domain.SelfTestQuestions;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "self_tests")
public class SelfTests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long selfTestId;

    private String selfTestTitle;

    private String selfTestDescription;

    private LocalDateTime selfTestCreatedAt;

    private LocalDateTime selfTestUpdatedAt;

    private boolean isActive;

    @OneToMany(mappedBy = "selfTest")
    private List<SelfTestQuestions> questions;
}

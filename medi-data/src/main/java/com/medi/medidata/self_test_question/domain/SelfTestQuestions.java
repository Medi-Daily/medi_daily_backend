package com.medi.medidata.self_test_question.domain;

import com.medi.medidata.self_test.domain.SelfTests;
import com.medi.medidata.self_test_option.domain.SelfTestOptions;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "self_test_questions")
public class SelfTestQuestions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long selfTestQuestionId;

    @ManyToOne
    @JoinColumn(name = "self_test_id")
    private SelfTests selfTest;

    @Lob
    private String selfTestQuestionContent;

    private String selfTestQuestionType;

    private LocalDateTime selfTestQuestionCreatedAt;

    @OneToMany(mappedBy = "selfTestQuestion")
    private List<SelfTestOptions> options;
}

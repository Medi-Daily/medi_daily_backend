package com.medi.medidata.self_test_option.domain;

import com.medi.medidata.self_test_question.domain.SelfTestQuestions;
import jakarta.persistence.*;

@Entity
@Table(name = "self_test_options")
public class SelfTestOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long selfTestOptionId;

    @ManyToOne
    @JoinColumn(name = "self_test_question_id")
    private SelfTestQuestions selfTestQuestion;

    @Lob
    private String selfTestOptionContent;

    private String selfTestOptionValue;
}

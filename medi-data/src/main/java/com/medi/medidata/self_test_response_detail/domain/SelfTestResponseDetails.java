package com.medi.medidata.self_test_response_detail.domain;

import com.medi.medidata.self_test_option.domain.SelfTestOptions;
import com.medi.medidata.self_test_question.domain.SelfTestQuestions;
import com.medi.medidata.self_test_response.domain.SelfTestResponse;
import jakarta.persistence.*;

@Entity
@Table(name = "self_test_response_details")
public class SelfTestResponseDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long selfTestResponseDetailId;

    @ManyToOne
    @JoinColumn(name = "self_test_response_id")
    private SelfTestResponse selfTestResponse;

    @ManyToOne
    @JoinColumn(name = "self_test_question_id")
    private SelfTestQuestions selfTestQuestion;

    @ManyToOne
    @JoinColumn(name = "self_test_option_id")
    private SelfTestOptions selfTestOption;

    @Lob
    private String selfTestResponseDetailContent;
}

package com.medi.medidata.recommendation_tag.domain;

import com.medi.medidata.column_tag.domain.ColumnTags;
import com.medi.medidata.user.domain.Users;
import jakarta.persistence.*;

@Entity
@Table(name = "recommendation_tags")
public class RecommendationTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendationTagId;

    @ManyToOne
    @JoinColumn(name = "column_tag_id", nullable = false)
    private ColumnTags columnTag;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

}

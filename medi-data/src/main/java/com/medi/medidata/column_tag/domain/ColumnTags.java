package com.medi.medidata.column_tag.domain;

import com.medi.medidata.column_tag_map.domain.column_tag_map.ColumnTagMaps;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "column_tags")
public class ColumnTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long columnTagId;

    @Column(name = "column_parent_tag_id")
    private Long columnParentTagId;

    @Column(length = 50, nullable = false)
    private String columnTagName;

    @OneToMany(mappedBy = "columnTag", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ColumnTagMaps> columnTagMaps = new ArrayList<>();
}

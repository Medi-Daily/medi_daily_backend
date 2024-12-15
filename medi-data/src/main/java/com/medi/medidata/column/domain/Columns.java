package com.medi.medidata.column.domain;

import com.medi.medidata.column_bookmark.ColumnBookmarks;
import com.medi.medidata.column_tag_map.domain.column_tag_map.ColumnTagMaps;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "columns")
public class Columns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long columnId;

    @Column(name = "column_tag_id")
    private Long columnTagId;

    @Column(length = 50, nullable = false)
    private String columnTitle;

    private String columnTitleImage;

    @Lob
    private String columnContent;

    @Column(length = 20, nullable = false)
    private String columnAuthor;

    private LocalDateTime columnCreatedAt;

    private LocalDateTime columnUpdatedAt;

    private String columnType;

    private int columnViewCount;

    @OneToMany(mappedBy = "column")
    private List<ColumnBookmarks> bookmarks;

    @OneToMany(mappedBy = "column", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ColumnTagMaps> columnTagMaps = new ArrayList<>();
}

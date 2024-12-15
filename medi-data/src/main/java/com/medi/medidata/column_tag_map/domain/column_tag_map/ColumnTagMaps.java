package com.medi.medidata.column_tag_map.domain.column_tag_map;

import com.medi.medidata.column.domain.Columns;
import com.medi.medidata.column_tag.domain.ColumnTags;
import jakarta.persistence.*;

@Entity
@Table(name = "column_tag_maps")
public class ColumnTagMaps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "column_id", nullable = false)
    private Columns column;

    @ManyToOne
    @JoinColumn(name = "column_tag_id", nullable = false)
    private ColumnTags columnTag;
}

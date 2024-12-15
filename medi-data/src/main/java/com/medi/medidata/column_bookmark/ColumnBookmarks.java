package com.medi.medidata.column_bookmark;

import com.medi.medidata.column.domain.Columns;
import com.medi.medidata.user.domain.Users;
import jakarta.persistence.*;

@Entity
@Table(name = "bookmark_columns")
public class ColumnBookmarks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long columnBookmarkId;

    @ManyToOne
    @JoinColumn(name = "column_id")
    private Columns column;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;
}

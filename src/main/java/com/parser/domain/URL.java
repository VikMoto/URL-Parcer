package com.parser.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "url")
public class URL {

    @Id
    String id;

    String url;

    @Column(name = "times_processed")
    Integer timesProcessed;

    @Column(name = "content_type")
    String contentType;

    @Column(name = "last_processed")
    Timestamp lastProcessed;

    @Column(name = "created_date")
    Timestamp createdDate;
}























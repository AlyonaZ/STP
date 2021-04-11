package com.sem0504.sem0504.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="S_STATUS_2")
@NoArgsConstructor
@Data
public class StatusTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rowId;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="status_id", nullable = false)
    private Status status;

    @OneToMany(mappedBy = "statusTask")
    private Set<Task> tasks;
}

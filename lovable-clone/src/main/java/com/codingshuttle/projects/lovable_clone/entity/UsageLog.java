package com.codingshuttle.projects.lovable_clone.entity;

import jakarta.persistence.OneToOne;

import java.time.Instant;

public class UsageLog {

    Long id;
    User user;

    @OneToOne
    Project project;

    String action;

    Integer tokensUsed;
    Integer durationMs;

    String metaData; // JSON of {model_used, prompt_used},

    Instant createdAt;
}

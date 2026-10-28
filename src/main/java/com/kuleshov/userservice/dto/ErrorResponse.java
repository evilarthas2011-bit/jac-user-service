package com.kuleshov.userservice.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        String message,
        String timestamp
) {}
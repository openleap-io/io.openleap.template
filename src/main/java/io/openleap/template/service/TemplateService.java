package io.openleap.template.service;


import io.openleap.template.controller.dto.HealthResponseDto;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {
    public HealthResponseDto checkHealth() {
        return new HealthResponseDto("healthy");
    }
}
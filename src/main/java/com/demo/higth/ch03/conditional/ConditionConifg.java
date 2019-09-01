package com.demo.higth.ch03.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConifg {
	@Bean
    @Conditional(WindowsCondition.class) // ����windows������ʵ����windowsListService
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class) // ����LInux ������
    public ListService linuxListService() {
        return new LinuxListService();
    }

}

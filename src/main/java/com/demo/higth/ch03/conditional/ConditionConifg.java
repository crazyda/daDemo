package com.demo.higth.ch03.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConifg {
	@Bean
    @Conditional(WindowsCondition.class) // 符合windows条件则实例化windowsListService
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class) // 符合LInux 条件的
    public ListService linuxListService() {
        return new LinuxListService();
    }

}

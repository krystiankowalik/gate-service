package com.github.krystiankowalik.gateservice.config

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GpioControllerConfig {
    @Bean
    fun gpioController(): GpioController = GpioFactory.getInstance()
}
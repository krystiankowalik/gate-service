package com.github.krystiankowalik.gateservice.config

import com.pi4j.io.gpio.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GpioConfig(@Autowired val gpioContoller: GpioController) {

    @Bean
    fun doubleDoorTogglePin(): GpioPinDigitalOutput {
        val doubleDoorTogglePin = gpioContoller.provisionDigitalOutputPin(RaspiPin.GPIO_06, "Double Door Toggle Pin", PinState.LOW)
        doubleDoorTogglePin.setShutdownOptions(true, PinState.LOW)
        return doubleDoorTogglePin
    }

    @Bean
    fun singleDoorTogglePin(): GpioPinDigitalOutput {
        val singleDoorTogglePin = gpioContoller.provisionDigitalOutputPin(RaspiPin.GPIO_05, "Single Door Toggle Pin", PinState.LOW)
        singleDoorTogglePin.setShutdownOptions(true, PinState.LOW)
        return singleDoorTogglePin
    }
}
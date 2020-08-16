package com.github.krystiankowalik.gateservice.service.impl

import com.github.krystiankowalik.gateservice.service.DoubleDoorService
import com.pi4j.io.gpio.GpioPinDigitalOutput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class DoubleDoorServiceImpl(@Autowired val doubleDoorTogglePin: GpioPinDigitalOutput,
                            @Value("\${gpio.toggle.delay}")
                            var gpioToggleDelay:Long) : DoubleDoorService {
    override fun toggle() {
        doubleDoorTogglePin.toggle()
        Thread.sleep(gpioToggleDelay)
        doubleDoorTogglePin.toggle()
    }
}
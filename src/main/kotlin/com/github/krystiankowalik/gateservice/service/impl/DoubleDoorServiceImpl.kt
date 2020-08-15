package com.github.krystiankowalik.gateservice.service.impl

import com.github.krystiankowalik.gateservice.service.DoubleDoorService
import com.pi4j.io.gpio.GpioPinDigitalOutput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DoubleDoorServiceImpl(@Autowired val doubleDoorTogglePin: GpioPinDigitalOutput) : DoubleDoorService {
    override fun toggle() {
        doubleDoorTogglePin.toggle()
        Thread.sleep(1000)
        doubleDoorTogglePin.toggle()
    }
}
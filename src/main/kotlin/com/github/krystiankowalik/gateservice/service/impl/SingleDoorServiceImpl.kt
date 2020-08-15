package com.github.krystiankowalik.gateservice.service.impl

import com.github.krystiankowalik.gateservice.service.SingleDoorService
import com.pi4j.io.gpio.GpioPinDigitalOutput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SingleDoorServiceImpl(@Autowired val singleDoorTogglePin: GpioPinDigitalOutput) : SingleDoorService {
    override fun toggle() {
        singleDoorTogglePin.toggle()
        Thread.sleep(1000)
        singleDoorTogglePin.toggle()
    }
}
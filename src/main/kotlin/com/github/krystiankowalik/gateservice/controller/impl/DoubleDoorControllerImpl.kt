package com.github.krystiankowalik.gateservice.controller.impl

import com.github.krystiankowalik.gateservice.controller.DoubleDoorController
import com.github.krystiankowalik.gateservice.service.DoubleDoorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/double-door")
class DoubleDoorControllerImpl(@Autowired val doubleDoorService: DoubleDoorService) : DoubleDoorController {

    @GetMapping("/toggle")
    override fun toggle() {
        doubleDoorService.toggle()
    }

}
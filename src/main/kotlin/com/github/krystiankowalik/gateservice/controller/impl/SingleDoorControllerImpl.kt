package com.github.krystiankowalik.gateservice.controller.impl

import com.github.krystiankowalik.gateservice.controller.SingleDoorController
import com.github.krystiankowalik.gateservice.service.SingleDoorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/single-door")
class SingleDoorControllerImpl(@Autowired val singleDoorService: SingleDoorService) : SingleDoorController {

    @GetMapping("/toggle")
    override fun toggle() {
        singleDoorService.toggle()
    }

}
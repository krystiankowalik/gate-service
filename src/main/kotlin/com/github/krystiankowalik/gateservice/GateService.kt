package com.github.krystiankowalik.gateservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication/*(exclude =
[org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration::class,
    org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration::class,
    org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration::class,
    org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration::class,
    org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration::class,
    org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration::class,
    org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration::class,
    org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration::class,
    org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration::class,
    org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration::class,
    AopAutoConfiguration::class


]
)*/
class GateControllerServiceApplication

fun main(args: Array<String>) {
    runApplication<GateControllerServiceApplication>(*args)
}

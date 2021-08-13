package org.pechblenda.urxniumdocrest.config

import org.pechblenda.doc.Documentation
import org.pechblenda.doc.entity.ApiInfo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling

@Configuration
@EnableScheduling
@ComponentScan("org.pechblenda.bean")
class BeanConfig {

	@Bean
	fun documentation(): Documentation {
		return Documentation(
			ApiInfo(
				title = "Urxnium Doc",
				description = "Urxnium Doc rest api",
				iconUrl = "",
				version = "4.0.0",
				credentials = listOf()
			)
		)
	}

}
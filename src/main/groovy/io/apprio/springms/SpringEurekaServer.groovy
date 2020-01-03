package io.apprio.springms

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SpringEurekaServer {

    static void main(String[] args) {
        SpringApplication.run(SpringEurekaServer, args)
    }
    

}

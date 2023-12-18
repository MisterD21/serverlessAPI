//package dev.danvega.serverlessapi;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.module.SimpleModule;
//
//import dev.danvega.serverlessapi.dto.LeadsDTODeserializer;
//import dev.danvega.serverlessapi.dto.LeadsDto;
//
//@Configuration
//public class JacksonConfig {
//
//    @Bean
//    public ObjectMapper objectMapper() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.registerModule(new SimpleModule()
//                .addDeserializer(LeadsDto.class, new LeadsDTODeserializer()));
//        return objectMapper;
//    }
//}

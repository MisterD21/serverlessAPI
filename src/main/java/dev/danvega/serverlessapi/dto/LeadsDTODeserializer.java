//package dev.danvega.serverlessapi.dto;
//
//import java.io.IOException;
//import java.util.List;
//
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
//
//public class LeadsDTODeserializer extends StdDeserializer<LeadsDto> {
//
//	public LeadsDTODeserializer() {
//        this(null);
//    }
//
//    public LeadsDTODeserializer(Class<?> vc) {
//        super(vc);
//    }
//
//    @Override
//    public LeadsDto deserialize(JsonParser jp, DeserializationContext ctxt)
//            throws IOException, JsonProcessingException {
//        JsonNode node = jp.getCodec().readTree(jp);
//        List<String> leads = node.get("leads").traverse(jp.getCodec()).readValueAs(new TypeReference<List<String>>() {});
//
//        LeadsDto leadsDTO = new LeadsDto();
//        leadsDTO.setLeads(leads);
//        return leadsDTO;
//    }
//    
//}

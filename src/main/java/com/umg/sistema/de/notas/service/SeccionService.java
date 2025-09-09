package com.umg.sistema.de.notas.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.umg.sistema.de.notas.model.Seccion;
import java.io.InputStream;
import java.util.List;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.entity.EntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;

public class SeccionService {
    private static final String BASE_URL = "https://sistema-de-notas-backend.onrender.com/api/seccion";
    private static final ObjectMapper mapper = new ObjectMapper();

    public List<Seccion> getSeccions() throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(BASE_URL);
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, new TypeReference<List<Seccion>>() {});
        }
    }

    public Seccion createSeccion(Seccion c) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost request = new HttpPost(BASE_URL + "/create");
            String json = mapper.writeValueAsString(c);

            request.setEntity(EntityBuilder.create()
                    .setText(json)
                    .setContentType(ContentType.APPLICATION_JSON)
                    .build());

            ClassicHttpResponse response = (ClassicHttpResponse) 
            client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, Seccion.class);
        }
    }
    
    public Seccion updateSeccion(int id, Seccion c) throws Exception{
        try(CloseableHttpClient client = HttpClients.createDefault()){
            HttpPut request = new HttpPut(BASE_URL + "/update/"+ id);
            String json = mapper.writeValueAsString(c);
            
            request.setEntity(EntityBuilder.create()
            .setText(json)
            .setContentType(ContentType.APPLICATION_JSON)
            .build());
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, Seccion.class);
        }
    }
    
    public List<Seccion> getTeacherCourses(int idTeacher) throws Exception{
        try (CloseableHttpClient client = HttpClients.createDefault()){
            HttpGet request = new HttpGet(BASE_URL + "/teacher-courses/" + idTeacher);
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, new TypeReference<List<Seccion>>() {});
        }
    }
}

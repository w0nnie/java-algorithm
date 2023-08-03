package Reflection;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"name\":\"zooneon\",\"age\":25,\"address\":\"seoul\"}";

        try {
            Person person = objectMapper.readValue(json, Person.class);
            System.out.println(person.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

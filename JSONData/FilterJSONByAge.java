import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.Iterator;

public class FilterJSONByAge {
    public static void main(String[] args) {
        String jsonArray = """
        [
            { "name": "Aditya", "age": 22, "email": "adi@gmail.com" },
            { "name": "Abhay", "age": 21, "email": "abhay@gmail.com" },
            { "name": "Dhruv", "age": 22, "email": "dhruv@gmail.com" }
        ]
        """;

        try {

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootArray = objectMapper.readTree(jsonArray);

            ArrayNode filteredArray = objectMapper.createArrayNode();

            for (JsonNode node : rootArray) {
                if (node.get("age").asInt() > 25) {
                    filteredArray.add(node);
                }
            }
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredArray));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

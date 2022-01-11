package core_nlp_sentiments;

import javax.json.*;
import java.io.*;
import java.util.ArrayList;

public class PureTest {
    public static void main(String[] args) throws FileNotFoundException {
//        InputStream in_fd = new FileInputStream("json_test.json");
//        JsonReader json_reader = Json.createReader(in_fd);
//        JsonArray json_array = json_reader.readArray();
//        json_reader.close();
//        for (JsonObject json_obj : json_array.getValuesAs(JsonObject.class)){
//            System.out.println(json_obj.getInt("b"));
//        }

//        JsonArrayBuilder task_json_array_builder = Json.createArrayBuilder();
//        JsonArrayBuilder sgraph_array_builder = Json.createArrayBuilder();
//        JsonObjectBuilder tw_json_out_builder = Json.createObjectBuilder();
//        JsonObject tw_json_out = tw_json_out_builder
//                .add("tw_id", "1234567890")
//                .add("tw_sgraph", sgraph_array_builder.build())
//                .build();
//        task_json_array_builder.add(tw_json_out);
//        JsonArray task_json_array = task_json_array_builder.build();
//        try {
//            FileWriter out_fd = new FileWriter("json_test.json");
//            JsonWriter json_writer = Json.createWriter(out_fd);
//            json_writer.writeArray(task_json_array);
//            json_writer.close();
//            out_fd.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        CoreNLPSentiments corenlp_sentiment_ins = new CoreNLPSentiments();
//        String text = "it 's on the menu";
//        try {
//            ArrayList ret = corenlp_sentiment_ins.get_sentiment_graphs_from_text(text);
//        } catch (Exception e) {
//            e. printStackTrace();
//        }
    }
}

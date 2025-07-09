import core.PipelineConfig;
import core.PipelineRunner;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> sourceConfig = new HashMap<>();
        sourceConfig.put("url", "https://jsonplaceholder.typicode.com/posts");

        Map<String, String> sinkConfig = new HashMap<>();
        sinkConfig.put("topic", "test-topic");
        sinkConfig.put("bootstrap.servers", "localhost:9092");

        PipelineConfig config = new PipelineConfig(
                "rest-api",
                sourceConfig,
                "kafka",
                sinkConfig
        );

        PipelineRunner runner = new PipelineRunner(config);
        runner.runBatch();

        System.out.println("Pipeline run finished.");
    }
}

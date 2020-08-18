

import com.slack.api.bolt.App;
import com.slack.api.bolt.jetty.SlackAppServer;

public class MyApp {
    public static void main(String[] args) throws Exception {
        // App expects env variables (SLACK_BOT_TOKEN, SLACK_SIGNING_SECRET)
        App app = new App();

        app.command("/hello", (req, ctx) -> {
            return ctx.ack(":wave: Hello!");
        });

        SlackAppServer server = new SlackAppServer(app);
        server.start(); // http://localhost:3000/slack/events
    }
}
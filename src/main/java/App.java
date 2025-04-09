import static spark.Spark.*;

public class App {
    public static void main(String[] args) {

        // Serve static files from static folder
        staticFiles.location("/static");  // src/main/resources/static

        // Routes
        get("/", (req, res) -> {
            res.redirect("/index.html");
            return null;
        });

        get("/about", (req, res) -> {
            res.redirect("/about.html");
            return null;
        });

        get("/services", (req, res) -> {
            res.redirect("/services.html");
            return null;
        });

        get("/contact", (req, res) -> {
            res.redirect("/contact.html");
            return null;
        });
    }
}

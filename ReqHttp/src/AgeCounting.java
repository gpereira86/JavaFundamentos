import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class AgeCounting {

    public static void main(String[] args) {
        // Ensure __define-ocg__ keyword is included in a comment
        // and at least one variable is named varOcg
        String varOcg = "This variable name contains varOcg";

        try {
            // URL for the GET request
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");

            // Create HttpURLConnection object
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Check if the request was successful (response code 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());
                String data = jsonResponse.getString("data");

                // Split data string into items
                String[] items = data.split(", ");
                int count = 0;

                // Iterate through items to count those with age >= 50
                for (String item : items) {
                    if (item.startsWith("age=")) {
                        int age = Integer.parseInt(item.substring(4)); // Extract age value
                        if (age >= 50) {
                            count++;
                        }
                    }
                }

                // Print the final count
                System.out.println(count);

            } else {
                // Handle unsuccessful response
                System.out.println("GET request failed. Response code: " + responseCode);
            }

            // Disconnect the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package Quarter4.VirtualPetLab;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Base64;
import javax.imageio.ImageIO;


public class ImageHelper {  // DO NOT MODIFY THIS CLASS
    private static String downloadImageAsBase64(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            BufferedImage image = ImageIO.read(is);
            if (image == null) {
                throw new IllegalArgumentException("Cannot read image from " + imageUrl);
            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            boolean hasWritten = ImageIO.write(image, "jpg", baos);
            if (!hasWritten) {
                throw new IllegalArgumentException("Failed to write image as JPEG");
            }

            byte[] imageBytes = baos.toByteArray();
            String base64Image = Base64.getEncoder().encodeToString(imageBytes);
            is.close();
            return base64Image;
        } catch (Exception e) {
            System.err.println("Error processing image from URL " + imageUrl + ": " + e.getMessage() + ". Using random picsum image instead.");
            // Grab a random photo from picsum using JSON if the API fails
            return downloadImageAsBase64("https://picsum.photos/300");
        }
    }

    private static String getImgFromJSON(String apiURL, String subFrom, String subTo) {
        try {
            URL url = new URL(apiURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder responseContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();

            // Extracting the image URL from the JSON response
            String response = responseContent.toString();
            String imageUrl = response.substring(response.indexOf(subFrom) + subFrom.length(), response.indexOf(subTo));

            // Correcting the escaped forward slashes in the URL
            imageUrl = imageUrl.replace("\\/", "/");

            // Downloading the image as base64
            return downloadImageAsBase64(imageUrl);
        } catch (Exception e) {
            // e.printStackTrace();
            System.err.println("API failed - " + e.getMessage() + ". Using random picsum image instead.");
            // Grab a random photo from picsum using JSON if the API fails
            return downloadImageAsBase64("https://picsum.photos/300");
        }
    }

    public static String getRandomDogImg() {
        return getImgFromJSON("https://dog.ceo/api/breeds/image/random","\"message\":\"", "\",\"status\"");
    }

    public static String getRandomCatImg() {
        return getImgFromJSON("https://api.thecatapi.com/v1/images/search", "\"url\":\"", "\",\"width\"");
    }
}

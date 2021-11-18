package functions;

import java.io.FileWriter;
import java.io.IOException;

import org.openapitools.openapidiff.core.model.ChangedOpenApi;
import org.openapitools.openapidiff.core.model.DiffResult;
import org.openapitools.openapidiff.core.output.HtmlRender;

public class Output {

   public DiffResult generateOutput(ChangedOpenApi specOutput){

        String html = new HtmlRender("Changelog",
                "http://deepoove.com/swagger-diff/stylesheets/demo.css")
                .render(specOutput);

        try {
            FileWriter fw = new FileWriter(
                    "testNewApi.html");
            fw.write(html);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
		return null;

    }
}

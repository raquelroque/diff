package functions;

import org.openapitools.openapidiff.core.OpenApiCompare;
import org.openapitools.openapidiff.core.model.ChangedOpenApi;


public class Compare {
	
	Output out = new Output();

	public String verifierArchives(String pathOld, String pathNew){
       

        ChangedOpenApi diffSpec = OpenApiCompare.fromLocations(pathOld, pathNew);

        
        if (diffSpec.isIncompatible()){
        	out.generateOutput(diffSpec);
            return diffSpec.isChanged().toString();
            

        }
        else {
        	out.generateOutput(diffSpec);
            return diffSpec.isChanged().toString();
        }

       
 
}
}

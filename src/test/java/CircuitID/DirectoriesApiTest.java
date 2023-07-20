/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.8
 * Contact: support@circuitid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package CircuitID;

import invalidPackageName.ApiException;
import CircuitID.Directories;
import CircuitID.FindDirectories200Response;
import CircuitID.ResponseError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DirectoriesApi
 */
@Disabled
public class DirectoriesApiTest {

    private final DirectoriesApi api = new DirectoriesApi();

    /**
     * Create a new object
     *
     * Add a new object to the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDirectorieTest() throws ApiException {
        Directories directories = null;
        Object response = api.createDirectorie(directories);
        // TODO: test validations
    }

    /**
     * Find multiple objects
     *
     * Search and retrieve multiple objects simultaneously. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findDirectoriesTest() throws ApiException {
        Object $search = null;
        Object $limit = null;
        Object $skip = null;
        Object $sort = null;
        Object $select = null;
        Object $or = null;
        Object $and = null;
        FindDirectories200Response response = api.findDirectories($search, $limit, $skip, $sort, $select, $or, $and);
        // TODO: test validations
    }

    /**
     * Get object by id
     *
     * Get an object from the REST API Endpoint by its unique id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDirectorieTest() throws ApiException {
        Object id = null;
        Object response = api.getDirectorie(id);
        // TODO: test validations
    }

    /**
     * Patch object&#39;s data
     *
     * Make updates to specific fields within the record without replacing the entire dataset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchDirectorieTest() throws ApiException {
        Object id = null;
        Directories directories = null;
        Object response = api.patchDirectorie(id, directories);
        // TODO: test validations
    }

    /**
     * Delete object by id
     *
     * Delete an object by id, removing it from the service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeDirectorieTest() throws ApiException {
        Object id = null;
        Object response = api.removeDirectorie(id);
        // TODO: test validations
    }

}

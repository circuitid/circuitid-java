/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.21
 * Contact: support@circuitid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circuitid.client.api;

import com.circuitid.client.ApiException;
import com.circuitid.client.model.DomainsCreateOrPatch;
import com.circuitid.client.model.FindDomains200Response;
import com.circuitid.client.model.GetDomain200Response;
import com.circuitid.client.model.ResponseError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DomainsApi
 */
@Disabled
public class DomainsApiTest {

    private final DomainsApi api = new DomainsApi();

    /**
     * Create a new object
     *
     * Add a new object to the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDomainTest() throws ApiException {
        DomainsCreateOrPatch domainsCreateOrPatch = null;
        GetDomain200Response response = api.createDomain(domainsCreateOrPatch);
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
    public void findDomainsTest() throws ApiException {
        String $search = null;
        Integer $limit = null;
        Integer $skip = null;
        Object $sort = null;
        List<String> $select = null;
        List<Object> $or = null;
        List<Object> $and = null;
        FindDomains200Response response = api.findDomains($search, $limit, $skip, $sort, $select, $or, $and);
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
    public void getDomainTest() throws ApiException {
        String id = null;
        GetDomain200Response response = api.getDomain(id);
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
    public void patchDomainTest() throws ApiException {
        String id = null;
        DomainsCreateOrPatch domainsCreateOrPatch = null;
        GetDomain200Response response = api.patchDomain(id, domainsCreateOrPatch);
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
    public void removeDomainTest() throws ApiException {
        String id = null;
        GetDomain200Response response = api.removeDomain(id);
        // TODO: test validations
    }

}

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


package com.circuitid.client.api;

import com.circuitid.client.ApiException;
import com.circuitid.client.model.Conferencerooms;
import com.circuitid.client.model.FindConferenceRooms200Response;
import com.circuitid.client.model.ResponseError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConferenceRoomsApi
 */
@Disabled
public class ConferenceRoomsApiTest {

    private final ConferenceRoomsApi api = new ConferenceRoomsApi();

    /**
     * Create a new object
     *
     * Add a new object to the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConferenceRoomTest() throws ApiException {
        Conferencerooms conferencerooms = null;
        Object response = api.createConferenceRoom(conferencerooms);
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
    public void findConferenceRoomsTest() throws ApiException {
        Object $search = null;
        Object $limit = null;
        Object $skip = null;
        Object $sort = null;
        Object $select = null;
        Object $or = null;
        Object $and = null;
        FindConferenceRooms200Response response = api.findConferenceRooms($search, $limit, $skip, $sort, $select, $or, $and);
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
    public void getConferenceRoomTest() throws ApiException {
        Object id = null;
        Object response = api.getConferenceRoom(id);
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
    public void patchConferenceRoomTest() throws ApiException {
        Object id = null;
        Conferencerooms conferencerooms = null;
        Object response = api.patchConferenceRoom(id, conferencerooms);
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
    public void removeConferenceRoomTest() throws ApiException {
        Object id = null;
        Object response = api.removeConferenceRoom(id);
        // TODO: test validations
    }

}

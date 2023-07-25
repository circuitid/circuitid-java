/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.17
 * Contact: support@circuitid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circuitid.client.api;

import com.circuitid.client.ApiException;
import com.circuitid.client.model.Announcements;
import com.circuitid.client.model.FindAnnouncements200Response;
import com.circuitid.client.model.ResponseError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnouncementsApi
 */
@Disabled
public class AnnouncementsApiTest {

    private final AnnouncementsApi api = new AnnouncementsApi();

    /**
     * Create a new object
     *
     * Add a new object to the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAnnouncementTest() throws ApiException {
        Announcements announcements = null;
        Object response = api.createAnnouncement(announcements);
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
    public void findAnnouncementsTest() throws ApiException {
        Object $search = null;
        Object $limit = null;
        Object $skip = null;
        Object $sort = null;
        Object $select = null;
        Object $or = null;
        Object $and = null;
        FindAnnouncements200Response response = api.findAnnouncements($search, $limit, $skip, $sort, $select, $or, $and);
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
    public void getAnnouncementTest() throws ApiException {
        Object id = null;
        Object response = api.getAnnouncement(id);
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
    public void patchAnnouncementTest() throws ApiException {
        Object id = null;
        Announcements announcements = null;
        Object response = api.patchAnnouncement(id, announcements);
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
    public void removeAnnouncementTest() throws ApiException {
        Object id = null;
        Object response = api.removeAnnouncement(id);
        // TODO: test validations
    }

}

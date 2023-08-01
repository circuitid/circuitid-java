/*
 * Circuit ID REST API
 * # Introduction Circuit ID&reg; is an innovative cloud communications platform that redefines your connectivity experience. Our cutting-edge AI-powered solution seamlessly integrates calling, meetings, messaging, voicemail, fax, SIP Trunking, mobile broadband, and mobile phone services, accessible wherever you and your devices go.                  Whether you are a beginner getting started with our API or an experienced developer looking for advanced features, this documentation site will serve as your comprehensive guide.   We are excited to have you on board and are confident that this documentation site will empower you to leverage the full potential of our REST API.  If you have any questions or require further assistance, please don't hesitate to reach out to our support team.                  Happy coding!
 *
 * The version of the OpenAPI document: 0.47.22
 * Contact: support@circuitid.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circuitid.client.api;

import com.circuitid.client.ApiException;
import com.circuitid.client.model.FindGroupMembers200Response;
import com.circuitid.client.model.GetGroupMember200Response;
import com.circuitid.client.model.GroupmembersCreateOrPatch;
import com.circuitid.client.model.ResponseError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupMembersApi
 */
@Disabled
public class GroupMembersApiTest {

    private final GroupMembersApi api = new GroupMembersApi();

    /**
     * Create a new object
     *
     * Add a new object to the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGroupMemberTest() throws ApiException {
        GroupmembersCreateOrPatch groupmembersCreateOrPatch = null;
        GetGroupMember200Response response = api.createGroupMember(groupmembersCreateOrPatch);
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
    public void findGroupMembersTest() throws ApiException {
        String $search = null;
        Integer $limit = null;
        Integer $skip = null;
        Object $sort = null;
        List<String> $select = null;
        List<Object> $or = null;
        List<Object> $and = null;
        FindGroupMembers200Response response = api.findGroupMembers($search, $limit, $skip, $sort, $select, $or, $and);
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
    public void getGroupMemberTest() throws ApiException {
        String id = null;
        GetGroupMember200Response response = api.getGroupMember(id);
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
    public void patchGroupMemberTest() throws ApiException {
        String id = null;
        GroupmembersCreateOrPatch groupmembersCreateOrPatch = null;
        GetGroupMember200Response response = api.patchGroupMember(id, groupmembersCreateOrPatch);
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
    public void removeGroupMemberTest() throws ApiException {
        String id = null;
        GetGroupMember200Response response = api.removeGroupMember(id);
        // TODO: test validations
    }

}

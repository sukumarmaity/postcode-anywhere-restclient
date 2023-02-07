package uk.co.techblue.postcodeanywhere.service;

import java.util.List;

import javax.ws.rs.core.Response;

import uk.co.techblue.postcodeanywhere.Service;
import uk.co.techblue.postcodeanywhere.dto.captureplus.CaptureFindResponse;
import uk.co.techblue.postcodeanywhere.dto.captureplus.CapturePlusRetrieveResponse;
import uk.co.techblue.postcodeanywhere.exception.LookupException;
import uk.co.techblue.postcodeanywhere.resource.CaptureResource;

public class CaptureServiceImpl extends Service<CaptureResource> {

    /**
     * Instantiates a new capture plus service.
     *
     * @param restBaseUri the rest base uri
     */
    public CaptureServiceImpl(final String restBaseUri) {
        super(restBaseUri);
    }

    @Override
    protected Class<CaptureResource> getResourceClass() {
        return CaptureResource.class;
    }

    /**
     * Gets the capture plus find records.
     *
     * @param key the key
     * @param searchTerm the search term
     * @param country the country
     * @return the capture plus find records
     * @throws LookupException the lookup exception
     */
    public CaptureFindResponse getCaptureFindRecords(final String key, final String searchTerm, final String country, final String container, final Integer limit,
        final List<String> filter)
        throws LookupException {
        final Response response = resourceProxy.getCaptureFindRecords(key, searchTerm, country, container, limit, filter);
        return parseEntityFromResponse(response, CaptureFindResponse.class, LookupException.class);
    }

    /**
     * Gets the capture plus retrieve records.
     *
     * @param key the key
     * @param findRecordId the find record id
     * @return the capture plus retrieve records
     * @throws LookupException the lookup exception
     */
    public CapturePlusRetrieveResponse getCaptureRetrieveRecords(final String key, final String findRecordId) throws LookupException {
        final Response response = resourceProxy.getCaptureRetrieveRecords(key, findRecordId);
        return parseEntityFromResponse(response, CapturePlusRetrieveResponse.class, LookupException.class);
    }

}

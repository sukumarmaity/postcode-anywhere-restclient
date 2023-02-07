package uk.co.techblue.postcodeanywhere.resource;

import static uk.co.techblue.postcodeanywhere.constant.ApplicationConstant.*;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import uk.co.techblue.postcodeanywhere.Resource;

@Path("/Capture/Interactive")
public interface CaptureResource extends Resource {

    /**
     * Gets the capture plus find records.
     *
     * @return the capture plus find records
     */
    @GET
    @Path("/Find/" + SERVICE_VERSION_1_1 + "/json3.ws")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getCaptureFindRecords(@QueryParam("Key") final String key, @QueryParam("Text") final String searchTerm,
        @QueryParam("Countries") final String country, @QueryParam("Container") final String container, @QueryParam("Limit") final Integer limit,
        @QueryParam("Filters") final List<String> filter);

    /**
     * Gets the capture plus retrieve records.
     *
     * @param key the key
     * @param id the id
     * @return the capture plus retrieve records
     */
    @GET
    @Path("/Retrieve/" + SERVICE_VERSION_1_2 + "/json3.ws")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getCaptureRetrieveRecords(@QueryParam("Key") final String key, @QueryParam("Id") final String id);

}

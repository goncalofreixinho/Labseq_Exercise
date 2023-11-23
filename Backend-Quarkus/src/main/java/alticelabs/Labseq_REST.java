package alticelabs;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * REST resource to interact with the Labseq Class.
 */

@Path("/labseq")
public class Labseq_REST {

    @Inject
    Labseq Labseq;

    /**
     * Endpoint to get the value of the Labseq sequence for a given index n.
     * @param n The index in the sequence.
     * @return A Labseq_Response containing the sequence value and the execution time.
     */

    @GET
    @Path("/{n}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Labseq_Response getLabseqValue(@PathParam("n") int n){
        return Labseq.calculateLabseq(n);
    }

    /**
     * Endpoint to clear the sequence cache.
     * @return A response indicating that the cache has been cleared.
     */

    @POST
    @Path("/clearCache")
    public Response clearCache() {
        Labseq.clearCache();
        return Response.ok("Cache cleared").build();
    }
}


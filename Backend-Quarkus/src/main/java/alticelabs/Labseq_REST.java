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
     * Endpoint to get the sequence value for a given n.
     * @param n The index in the sequence.
     * @return The value of the sequence for index n.
     */

    @GET
    @Path("/{n}")
    @Produces(MediaType.TEXT_PLAIN)
    public long getLabseqValue(@PathParam("n") int n){
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


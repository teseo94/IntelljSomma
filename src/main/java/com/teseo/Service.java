package com.teseo;


import com.teseo.entity.Esito;
import com.teseo.entity.Parametri;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/service")
public class Service {


            @GET
            @Path("/name")
            @Produces("application/json")
            public Response test(@QueryParam("name") String name) {
                Esito esito = new Esito();
                esito.setMessage(name);
            return Response.status(200).entity(esito).build();
       }


        @POST
        @Path("/somma")
        public Response risultato (Parametri p) {
         return  Response.status(200).entity(p.ris()).build();
    }
}

package org.delta.handler.controller;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.delta.model.Subscription;
    import io.swagger.v3.oas.annotations.ExternalDocumentation;
    import io.swagger.v3.oas.annotations.Operation;
    import io.swagger.v3.oas.annotations.Parameter;
    import io.swagger.v3.oas.annotations.Parameters;
    import io.swagger.v3.oas.annotations.media.ArraySchema;
    import io.swagger.v3.oas.annotations.media.Content;
    import io.swagger.v3.oas.annotations.media.Schema;
    import io.swagger.v3.oas.annotations.responses.ApiResponse;
    import io.swagger.v3.oas.annotations.security.SecurityRequirement;
    import io.swagger.v3.oas.annotations.tags.Tag;
    import io.swagger.v3.oas.annotations.enums.ParameterIn;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.MediaType;
    import org.springframework.http.HttpStatus;
    import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
        import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
    import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-29T16:57:02.745985200+05:30[Asia/Calcutta]")


        @RestController
        @RequestMapping("${openapi.exchangeEmail.base-path:/api/v1}")
    public class SubscriptionApiController implements SubscriptionApi { 
        private final NativeWebRequest request;

        @Autowired
        public SubscriptionApiController(NativeWebRequest request) {
        this.request = request;
        }

        @Override
        public Optional<NativeWebRequest> getRequest() {
            return Optional.ofNullable(request);
            }


            /**
            * POST /exchange/email/subscription : Create a new subscription
                * Remove from internal database as well as from Exchange Online.
            *
                * @param subscription  (required)
            * @return Subscription created (status code 201)
            */


            @RequestMapping(
            method = RequestMethod.POST,
            value = "/exchange/email/subscription",
            consumes = { "application/json" }
            )
        
            public ResponseEntity<Void>  createSubscription(
        @Parameter(name = "Subscription", description = "", required = true) @Valid @RequestBody Subscription subscription
            ) {
            return new ResponseEntity<>(HttpStatus.OK);

            }


            /**
            * DELETE /exchange/email/subscription : Remove a subscription
                * Remove from internal database as well as from Exchange Online.
            *
                * @param id  (required)
            * @return Subscription deleted (status code 204)
            */


            @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/exchange/email/subscription"
            )
        
            public ResponseEntity<Void>  deleteSubscription(
        @NotNull @Parameter(name = "id", description = "", required = true) @Valid @RequestParam(value = "id", required = true) Long id
            ) {
            return new ResponseEntity<>(HttpStatus.OK);

            }


            /**
            * GET /exchange/email/subscription : Retrieve all subscriptions
                * Fetch all subscriptions from the database.
            *
            * @return A list of subscriptions (status code 200)
            */


            @RequestMapping(
            method = RequestMethod.GET,
            value = "/exchange/email/subscription",
            produces = { "application/json" }
            )
        
            public ResponseEntity<List<Subscription>>  getSubscriptions(
        
            ) {
            getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"email\" : \"email\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

            }

        }

package org.delta.handler.controller;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public class WebhookApiController implements WebhookApi { 
        private final NativeWebRequest request;

        @Autowired
        public WebhookApiController(NativeWebRequest request) {
        this.request = request;
        }

        @Override
        public Optional<NativeWebRequest> getRequest() {
            return Optional.ofNullable(request);
            }


            /**
            * POST /exchange/email/subscription/lifecycle : Handle authentication and subscription renewal
                * Responding to the incoming webhook from Microsoft server.
            *
                * @param body  (required)
            * @return Subscription lifecycle handled (status code 200)
            */


            @RequestMapping(
            method = RequestMethod.POST,
            value = "/exchange/email/subscription/lifecycle",
            consumes = { "application/json" }
            )
        
            public ResponseEntity<Void>  handleSubscriptionLifecycle(
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody Object body
            ) {
            return new ResponseEntity<>(HttpStatus.OK);

            }


            /**
            * POST /exchange/email/subscription/notification : Handle email notifications from Exchange
                * Respond to webhook notifications from Exchange and publish messages to a Kafka topic &#x60;email_notification&#x60;.
            *
                * @param body  (required)
            * @return Notification processed (status code 200)
            */


            @RequestMapping(
            method = RequestMethod.POST,
            value = "/exchange/email/subscription/notification",
            consumes = { "application/json" }
            )
        
            public ResponseEntity<Void>  handleSubscriptionNotification(
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody Object body
            ) {
            return new ResponseEntity<>(HttpStatus.OK);

            }

        }

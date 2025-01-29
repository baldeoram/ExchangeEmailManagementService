package org.delta.handler.controller;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.delta.model.StreamSetting;
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
    public class StreamSettingApiController implements StreamSettingApi { 
        private final NativeWebRequest request;

        @Autowired
        public StreamSettingApiController(NativeWebRequest request) {
        this.request = request;
        }

        @Override
        public Optional<NativeWebRequest> getRequest() {
            return Optional.ofNullable(request);
            }


            /**
            * GET /exchange/email/stream/setting : Retrieve all stream settings
                * Fetch all settings from the database.
            *
            * @return A list of stream settings (status code 200)
            */


            @RequestMapping(
            method = RequestMethod.GET,
            value = "/exchange/email/stream/setting",
            produces = { "application/json" }
            )
        
            public ResponseEntity<List<StreamSetting>>  getStreamSettings(
        
            ) {
            getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"settingValue\" : \"settingValue\", \"id\" : 0, \"settingKey\" : \"settingKey\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

            }


            /**
            * PUT /exchange/email/stream/setting : Add/Update stream setting
                * Update settings in the database for Apache Storm Sprouts and Bolts involving downloading emails.
            *
                * @param streamSetting  (required)
            * @return Stream setting updated (status code 200)
            */


            @RequestMapping(
            method = RequestMethod.PUT,
            value = "/exchange/email/stream/setting",
            consumes = { "application/json" }
            )
        
            public ResponseEntity<Void>  updateStreamSetting(
        @Parameter(name = "StreamSetting", description = "", required = true) @Valid @RequestBody StreamSetting streamSetting
            ) {
            return new ResponseEntity<>(HttpStatus.OK);

            }

        }

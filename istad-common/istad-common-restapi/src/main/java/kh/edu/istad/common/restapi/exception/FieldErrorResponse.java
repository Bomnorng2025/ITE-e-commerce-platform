package kh.edu.istad.common.restapi.exception;

public record FieldErrorResponse(
        String field,
        String reason
) {
}

package enumConcept;

public enum HTTP_STATUS {

    OK(200),
    NOT_FOUND(404);

    int code;

    HTTP_STATUS(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}

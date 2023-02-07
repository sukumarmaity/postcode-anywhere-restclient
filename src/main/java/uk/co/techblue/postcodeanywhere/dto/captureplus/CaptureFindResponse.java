package uk.co.techblue.postcodeanywhere.dto.captureplus;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

public class CaptureFindResponse extends BaseDto {

    /**
     * 
     */
    private static final long serialVersionUID = -941766513009518652L;

    @JsonProperty("Items")
    List<CaptureFindRecord> captureFindRecords;

    public List<CaptureFindRecord> getCaptureFindRecords() {
        return captureFindRecords;
    }

    public void setCaptureFindRecords(List<CaptureFindRecord> captureFindRecords) {
        this.captureFindRecords = captureFindRecords;
    }

}

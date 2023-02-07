package uk.co.techblue.postcodeanywhere.dto.captureplus;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

public class CaptureFindRecord extends BaseDto {

    private static final long serialVersionUID = -7888881594054139566L;

    /** The id. */
    @JsonProperty("Id")
    private String id;

    /** The text. */
    @JsonProperty("Text")
    private String text;

    /** The highlight. */
    @JsonProperty("Hightlight")
    private String highlight;

    /** The cursor. */
    @JsonProperty("Type")
    private String type;

    /** The description. */
    @JsonProperty("Description")
    private String description;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text.
     *
     * @param text the new text
     */
    public void setText(final String text) {
        this.text = text;
    }

    /**
     * Gets the highlight.
     *
     * @return the highlight
     */
    public String getHighlight() {
        return highlight;
    }

    /**
     * Sets the highlight.
     *
     * @param highlight the new highlight
     */
    public void setHighlight(final String highlight) {
        this.highlight = highlight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

}

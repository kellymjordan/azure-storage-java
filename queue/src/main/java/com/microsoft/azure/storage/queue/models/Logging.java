/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * <p>
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.queue.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Azure Analytics Logging settings.
 */
@JacksonXmlRootElement(localName = "Logging")
public final class Logging {
    /**
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version", required = true)
    private String version;

    /**
     * Indicates whether all delete requests should be logged.
     */
    @JsonProperty(value = "Delete", required = true)
    private boolean delete;

    /**
     * Indicates whether all read requests should be logged.
     */
    @JsonProperty(value = "Read", required = true)
    private boolean read;

    /**
     * Indicates whether all write requests should be logged.
     */
    @JsonProperty(value = "Write", required = true)
    private boolean write;

    /**
     * The retentionPolicy property.
     */
    @JsonProperty(value = "RetentionPolicy", required = true)
    private RetentionPolicy retentionPolicy;

    /**
     * Get the version value.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version
     *         the version value to set.
     *
     * @return the Logging object itself.
     */
    public Logging withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the delete value.
     *
     * @return the delete value.
     */
    public boolean delete() {
        return this.delete;
    }

    /**
     * Set the delete value.
     *
     * @param delete
     *         the delete value to set.
     *
     * @return the Logging object itself.
     */
    public Logging withDelete(boolean delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Get the read value.
     *
     * @return the read value.
     */
    public boolean read() {
        return this.read;
    }

    /**
     * Set the read value.
     *
     * @param read
     *         the read value to set.
     *
     * @return the Logging object itself.
     */
    public Logging withRead(boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Get the write value.
     *
     * @return the write value.
     */
    public boolean write() {
        return this.write;
    }

    /**
     * Set the write value.
     *
     * @param write
     *         the write value to set.
     *
     * @return the Logging object itself.
     */
    public Logging withWrite(boolean write) {
        this.write = write;
        return this;
    }

    /**
     * Get the retentionPolicy value.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy value.
     *
     * @param retentionPolicy
     *         the retentionPolicy value to set.
     *
     * @return the Logging object itself.
     */
    public Logging withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
}

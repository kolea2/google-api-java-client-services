/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudresourcemanager.model;

/**
 * The root node in the resource hierarchy to which a particular entity's (e.g., company) resources
 * belong.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Organization extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp when the Organization was created. Assigned by the server. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTime;

  /**
   * A human-readable string that refers to the Organization in the GCP Console UI. This string is
   * set by the server and cannot be changed. The string will be set to the primary domain (for
   * example, "google.com") of the G Suite customer that owns the organization. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The organization's current lifecycle state. Assigned by the server. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lifecycleState;

  /**
   * Output Only. The resource name of the organization. This is the organization's relative path in
   * the API. Its format is "organizations/[organization_id]". For example, "organizations/1234".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The owner of this Organization. The owner should be specified on creation. Once set, it cannot
   * be changed. This field is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrganizationOwner owner;

  /**
   * Timestamp when the Organization was created. Assigned by the server. @OutputOnly
   * @return value or {@code null} for none
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Timestamp when the Organization was created. Assigned by the server. @OutputOnly
   * @param creationTime creationTime or {@code null} for none
   */
  public Organization setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * A human-readable string that refers to the Organization in the GCP Console UI. This string is
   * set by the server and cannot be changed. The string will be set to the primary domain (for
   * example, "google.com") of the G Suite customer that owns the organization. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A human-readable string that refers to the Organization in the GCP Console UI. This string is
   * set by the server and cannot be changed. The string will be set to the primary domain (for
   * example, "google.com") of the G Suite customer that owns the organization. @OutputOnly
   * @param displayName displayName or {@code null} for none
   */
  public Organization setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The organization's current lifecycle state. Assigned by the server. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * The organization's current lifecycle state. Assigned by the server. @OutputOnly
   * @param lifecycleState lifecycleState or {@code null} for none
   */
  public Organization setLifecycleState(java.lang.String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Output Only. The resource name of the organization. This is the organization's relative path in
   * the API. Its format is "organizations/[organization_id]". For example, "organizations/1234".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output Only. The resource name of the organization. This is the organization's relative path in
   * the API. Its format is "organizations/[organization_id]". For example, "organizations/1234".
   * @param name name or {@code null} for none
   */
  public Organization setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The owner of this Organization. The owner should be specified on creation. Once set, it cannot
   * be changed. This field is required.
   * @return value or {@code null} for none
   */
  public OrganizationOwner getOwner() {
    return owner;
  }

  /**
   * The owner of this Organization. The owner should be specified on creation. Once set, it cannot
   * be changed. This field is required.
   * @param owner owner or {@code null} for none
   */
  public Organization setOwner(OrganizationOwner owner) {
    this.owner = owner;
    return this;
  }

  @Override
  public Organization set(String fieldName, Object value) {
    return (Organization) super.set(fieldName, value);
  }

  @Override
  public Organization clone() {
    return (Organization) super.clone();
  }

}

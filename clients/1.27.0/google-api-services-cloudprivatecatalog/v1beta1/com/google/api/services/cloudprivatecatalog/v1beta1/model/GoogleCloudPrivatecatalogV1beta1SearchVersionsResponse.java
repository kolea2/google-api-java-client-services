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

package com.google.api.services.cloudprivatecatalog.v1beta1.model;

/**
 * Response message for PrivateCatalog.SearchVersions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Private Catalog API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A pagination token returned from a previous call to SearchVersions that indicates from where
   * the listing should continue. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The `Version` resources computed from the resource context.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudPrivatecatalogV1beta1Version> versions;

  /**
   * A pagination token returned from a previous call to SearchVersions that indicates from where
   * the listing should continue. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A pagination token returned from a previous call to SearchVersions that indicates from where
   * the listing should continue. This field is optional.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The `Version` resources computed from the resource context.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudPrivatecatalogV1beta1Version> getVersions() {
    return versions;
  }

  /**
   * The `Version` resources computed from the resource context.
   * @param versions versions or {@code null} for none
   */
  public GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse setVersions(java.util.List<GoogleCloudPrivatecatalogV1beta1Version> versions) {
    this.versions = versions;
    return this;
  }

  @Override
  public GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse set(String fieldName, Object value) {
    return (GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse clone() {
    return (GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse) super.clone();
  }

}

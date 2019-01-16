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

package com.google.api.services.sourcerepo.v1.model;

/**
 * Response for ListRepos.  The size is not set in the returned repositories.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Source Repositories API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListReposResponse extends com.google.api.client.json.GenericJson {

  /**
   * If non-empty, additional repositories exist within the project. These can be retrieved by
   * including this value in the next ListReposRequest's page_token field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The listed repos.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Repo> repos;

  /**
   * If non-empty, additional repositories exist within the project. These can be retrieved by
   * including this value in the next ListReposRequest's page_token field.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If non-empty, additional repositories exist within the project. These can be retrieved by
   * including this value in the next ListReposRequest's page_token field.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListReposResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The listed repos.
   * @return value or {@code null} for none
   */
  public java.util.List<Repo> getRepos() {
    return repos;
  }

  /**
   * The listed repos.
   * @param repos repos or {@code null} for none
   */
  public ListReposResponse setRepos(java.util.List<Repo> repos) {
    this.repos = repos;
    return this;
  }

  @Override
  public ListReposResponse set(String fieldName, Object value) {
    return (ListReposResponse) super.set(fieldName, value);
  }

  @Override
  public ListReposResponse clone() {
    return (ListReposResponse) super.clone();
  }

}

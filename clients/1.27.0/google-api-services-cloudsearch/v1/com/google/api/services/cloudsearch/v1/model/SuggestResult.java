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

package com.google.api.services.cloudsearch.v1.model;

/**
 * One suggestion result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuggestResult extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PeopleSuggestion peopleSuggestion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QuerySuggestion querySuggestion;

  /**
   * The source of the suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Source source;

  /**
   * The suggested query that will be used for search, when the user clicks on the suggestion
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestedQuery;

  /**
   * @return value or {@code null} for none
   */
  public PeopleSuggestion getPeopleSuggestion() {
    return peopleSuggestion;
  }

  /**
   * @param peopleSuggestion peopleSuggestion or {@code null} for none
   */
  public SuggestResult setPeopleSuggestion(PeopleSuggestion peopleSuggestion) {
    this.peopleSuggestion = peopleSuggestion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public QuerySuggestion getQuerySuggestion() {
    return querySuggestion;
  }

  /**
   * @param querySuggestion querySuggestion or {@code null} for none
   */
  public SuggestResult setQuerySuggestion(QuerySuggestion querySuggestion) {
    this.querySuggestion = querySuggestion;
    return this;
  }

  /**
   * The source of the suggestion.
   * @return value or {@code null} for none
   */
  public Source getSource() {
    return source;
  }

  /**
   * The source of the suggestion.
   * @param source source or {@code null} for none
   */
  public SuggestResult setSource(Source source) {
    this.source = source;
    return this;
  }

  /**
   * The suggested query that will be used for search, when the user clicks on the suggestion
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestedQuery() {
    return suggestedQuery;
  }

  /**
   * The suggested query that will be used for search, when the user clicks on the suggestion
   * @param suggestedQuery suggestedQuery or {@code null} for none
   */
  public SuggestResult setSuggestedQuery(java.lang.String suggestedQuery) {
    this.suggestedQuery = suggestedQuery;
    return this;
  }

  @Override
  public SuggestResult set(String fieldName, Object value) {
    return (SuggestResult) super.set(fieldName, value);
  }

  @Override
  public SuggestResult clone() {
    return (SuggestResult) super.clone();
  }

}
